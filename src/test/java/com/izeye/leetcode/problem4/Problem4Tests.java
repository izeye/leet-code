package com.izeye.leetcode.problem4;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for {@link Problem4}.
 *
 * @author Johnny Lim
 */
public class Problem4Tests {

	@Test
	public void findMedianSortedArrays() {
		assertThat(new Problem4().new Solution().findMedianSortedArrays(new int[]{ 1, 3 }, new int[]{ 2 }))
				.isEqualTo(2d);
	}

}
