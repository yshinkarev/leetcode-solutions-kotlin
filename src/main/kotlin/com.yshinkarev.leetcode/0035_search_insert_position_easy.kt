package com.yshinkarev.leetcode

/**
 * https://leetcode.com/problems/search-insert-position
 */
class `0035_search_insert_position_easy` {

    fun searchInsert(nums: IntArray, target: Int): Int {
        var left = 0
        var right = nums.size

        while (left < right) {
            val middle = (left + right) / 2
            if (nums[middle] == target) {
                return middle
            } else if (nums[middle] < target) {
                left = middle + 1
            } else {
                right = middle
            }

        }

        return left
    }
}