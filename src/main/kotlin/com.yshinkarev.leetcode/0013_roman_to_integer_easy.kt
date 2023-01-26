package com.yshinkarev.leetcode

/**
 * https://leetcode.com/problems/roman-to-integer
 */
class `0013_roman_to_integer_easy` {

    fun romanToInt(s: String): Int {
        val map = mutableMapOf<Char, Int>().also {
            it['I'] = 1
            it['V'] = 5
            it['X'] = 10
            it['L'] = 50
            it['C'] = 100
            it['D'] = 500
            it['M'] = 1000
        }
        var result = map[s[0]]!!
        for (i in 1 until s.length) {
            val cur = map[s[i]]
            val prev = map[s[i - 1]]
            result += cur!!
            if (cur > prev!!) {
                result -= 2 * prev
            }
        }
        return result
    }
}