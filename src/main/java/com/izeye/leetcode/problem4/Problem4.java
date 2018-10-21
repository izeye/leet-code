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
//			int[] merged = new int[nums1.length + nums2.length];
//			System.arraycopy(nums1, 0, merged, 0, nums1.length);
//			System.arraycopy(nums2, 0, merged, nums1.length, nums2.length);
//			Arrays.sort(merged);
			int[] merged = merge(nums1, nums2);
			int remainder = merged.length % 2;
			int middle = (merged.length + remainder) / 2 - 1;
			if (remainder == 1) {
				return merged[middle];
			}
			return (merged[middle] + merged[middle + 1]) / 2d;
		}

		public int[] merge(int[] sorted1, int[] sorted2) {
			int[] merged = new int[sorted1.length + sorted2.length];
			int sorted1Index = 0;
			int sorted2Index = 0;
			for (int i = 0; i < merged.length; i++) {
				if (sorted1Index == sorted1.length) {
					System.arraycopy(sorted2, sorted2Index, merged, i, merged.length - i);
					break;
				}
				if (sorted2Index == sorted2.length) {
					System.arraycopy(sorted1, sorted1Index, merged, i, merged.length - i);
					break;
				}
				if (sorted1[sorted1Index] < sorted2[sorted2Index]) {
					merged[i] = sorted1[sorted1Index];
					sorted1Index++;
				}
				else {
					merged[i] = sorted2[sorted2Index];
					sorted2Index++;
				}
			}
			return merged;
		}
	}

}
