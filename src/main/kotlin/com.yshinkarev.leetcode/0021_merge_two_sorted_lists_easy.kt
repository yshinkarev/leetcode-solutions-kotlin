package com.yshinkarev.leetcode

/**
 * https://leetcode.com/problems/merge-two-sorted-lists
 */
class `0021_merge_two_sorted_lists_easy` {

    class ListNode(var `val`: Int) {
        var next: ListNode? = null
    }

    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        if (list1 == null) return list2
        if (list2 == null) return list1

        return if (list1.`val` >= list2.`val`) {
            list2.next = mergeTwoLists(list1, list2.next)
            list2
        } else {
            list1.next = mergeTwoLists(list1.next, list2)
            list1
        }
    }
}