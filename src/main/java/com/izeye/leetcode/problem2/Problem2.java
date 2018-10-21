package com.izeye.leetcode.problem2;

/**
 * 2. Add Two Numbers
 *
 * See https://leetcode.com/problems/add-two-numbers/
 *
 * @author Johnny Lim
 */
public class Problem2 {

	/**
	 * Definition for singly-linked list.
	 * public class ListNode {
	 *     int val;
	 *     ListNode next;
	 *     ListNode(int x) { val = x; }
	 * }
	 */
	class Solution {
		public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
			ListNode root = null;
			ListNode previous = null;
			int carry = 0;
			do {
				int sum = 0;
				if (l1 != null) {
					sum += l1.val;
					l1 = l1.next;
				}
				if (l2 != null) {
					sum += l2.val;
					l2 = l2.next;
				}
				sum += carry;
				if (sum >= 10) {
					sum -= 10;
					carry = 1;
				}
				else {
					carry = 0;
				}
				ListNode node = new ListNode(sum);
				if (root == null) {
					root = node;
				} else {
					previous.next = node;
				}
				previous = node;
			} while (l1 != null || l2 != null);
			if (carry != 0) {
				ListNode node = new ListNode(1);
				previous.next = node;
			}
			return root;
		}
	}

	public class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}

}
