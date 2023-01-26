package com.yshinkarev.leetcode

/**
 * https://leetcode.com/problems/longest-common-prefix
 */
class `0014_longest_common_prefix_easy` {

    fun longestCommonPrefix(strs: Array<String>): String {
        if (strs.isEmpty()) return ""
        val first = strs[0]
        for (i in first.indices) {
            val c = first[i]
            for (j in 1 until strs.size) {
                val cur = strs[j]
                if (i == cur.length || cur[i] != c) {
                    return first.substring(0, i)
                }
            }
        }
        return first
    }
}