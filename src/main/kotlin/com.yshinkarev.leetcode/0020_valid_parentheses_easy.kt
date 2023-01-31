package com.yshinkarev.leetcode

import java.util.Stack

/**
 * https://leetcode.com/problems/valid-parentheses
 */
class `0020_valid_parentheses_easy` {

    private val brackets = mapOf(
        '(' to ')',
        '{' to '}',
        '[' to ']'
    )

    fun isValid(s: String): Boolean {
        val stack = Stack<Char>()
        for (c in s.toCharArray()) {
            val closeBracket = brackets[c]
            if (closeBracket == null) {
                if (stack.isEmpty() || stack.pop() != c) return false
            } else {
                stack.push(closeBracket)
            }
        }
        return stack.isEmpty()
    }
}