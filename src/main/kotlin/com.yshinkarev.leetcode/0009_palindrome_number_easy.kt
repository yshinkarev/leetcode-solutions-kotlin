package com.yshinkarev.leetcode

/**
 * https://leetcode.com/problems/palindrome-number
 */
class `0009_palindrome_number_easy` {

    fun isPalindrome(x: Int): Boolean {
        if (x < 0 || x != 0 && x % 10 == 0) return false
        var curx = x
        var rev = 0
        while (curx > rev) {
            rev = rev * 10 + curx % 10;
            curx /= 10;
        }
        return curx == rev || curx == rev / 10;
    }
}