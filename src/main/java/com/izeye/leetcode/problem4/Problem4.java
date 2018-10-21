package com.izeye.leetcode.problem4;

import java.util.Arrays;

/**
 * 4. Median of Two Sorted Arrays
 *
 * See https://leetcode.com/problems/median-of-two-sorted-arrays/
 *
 * @author Johnny Lim
 */
public class Problem4 {

	class Solution {
		public double findMedianSortedArrays(int[] nums1, int[] nums2) {
			int[] merged = new int[nums1.length + nums2.length];
			System.arraycopy(nums1, 0, merged, 0, nums1.length);
			System.arraycopy(nums2, 0, merged, nums1.length, nums2.length);
			Arrays.sort(merged);
			int remainder = merged.length % 2;
			int middle = (merged.length + remainder) / 2 - 1;
			if (remainder == 1) {
				return merged[middle];
			}
			return (merged[middle] + merged[middle + 1]) / 2d;
		}
	}

}
