package com.yshinkarev.leetcode

/**
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array
 */
class `0026_remove_duplicates_from_sorted_array` {

    fun removeDuplicates(nums: IntArray): Int {
        var i = if (nums.isEmpty()) 0 else 1
        for (n in nums) {
            if (n > nums[i - 1]) {
                nums[i++] = n
            }
        }
        return i
    }
}