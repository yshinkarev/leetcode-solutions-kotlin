package com.yshinkarev.leetcode

/**
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array
 */
class `0026_remove_duplicates_from_sorted_array_easy` {

    fun removeDuplicates(nums: IntArray): Int {
        if (nums.isEmpty()) return 0
        var i = 1
        for (n in nums) {
            if (n > nums[i - 1]) {
                nums[i++] = n
            }
        }
        return i
    }
}