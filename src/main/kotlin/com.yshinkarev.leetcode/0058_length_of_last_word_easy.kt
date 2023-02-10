package com.yshinkarev.leetcode

/**
 * https://leetcode.com/problems/length-of-last-word
 */
class `0058_length_of_last_word_easy` {

    fun lengthOfLastWord(s: String): Int {
        var length = 0

        for (i in s.length - 1 downTo 0) {
            if (s[i] == ' ') {
                if (length != 0) {
                    return length
                }
            } else {
                length++
            }
        }

        return length
    }
}