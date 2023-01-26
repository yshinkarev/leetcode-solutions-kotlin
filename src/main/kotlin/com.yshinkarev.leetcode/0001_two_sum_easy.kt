package com.yshinkarev.leetcode

/**
 * https://leetcode.com/problems/two-sum
 */
class `0001_two_sum_easy` {

    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = mutableMapOf<Int, Int>()
        for (i in nums.indices) {
            val key = target - nums[i]
            if (map.containsKey(key)) {
                return intArrayOf(map[key]!!, i)
            } else {
                map[nums[i]] = i
            }
        }
        return intArrayOf(-1, -1)
    }
}