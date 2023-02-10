package com.yshinkarev.leetcode

/**
 * https://leetcode.com/problems/remove-element
 */
class `0027_remove_element_easy` {

    fun removeElement(nums: IntArray, `val`: Int): Int {
        var length = nums.size
        var i = 0

        while (i < length) {
            if (nums[i] == `val`) {
                length--
                nums[i] = nums[length]
            } else {
                i++
            }
        }

        return length
    }
}