/**
 * 给定两个大小为 m 和 n 的有序数组 nums1 和 nums2 。 请找出这两个有序数组的中位数。要求算法的时间复杂度为 O(log (m+n)) 。
 * 你可以假设 nums1 和 nums2 均不为空。 示例 1: nums1 = [1, 3] nums2 = [2] 中位数是 2.0 示例 2:
 * nums1 = [1, 2] nums2 = [3, 4] 中位数是 (2 + 3)/2 = 2.5
 * 
 * @author zuish
 *
 */
public class Test004 {

	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int num[] = new int[nums1.length + nums2.length];
		int j = 0, x = 0;
		if (num.length % 2 == 1) {
			for (int i = 0; i <= num.length / 2 + 1; i++) {
				if (x > nums2.length - 1 && j > nums1.length - 1) {
					break;
				}
				if (j > nums1.length - 1) {
					num[i] = nums2[x];
					x++;
				} else if (x > nums2.length - 1) {
					num[i] = nums1[j];
					j++;
				} else if (nums1[j] > nums2[x]) {
					num[i] = nums2[x];
					x++;
				} else {
					num[i] = nums1[j];
					j++;
				}
			}
			return num[num.length / 2];
		} else {
			for (int i = 0; i <= num.length / 2 + 1; i++) {
				if (x > nums2.length - 1 && j > nums1.length - 1) {
					break;
				}
				if (j > nums1.length - 1) {
					num[i] = nums2[x];
					x++;
				} else if (x > nums2.length - 1) {
					num[i] = nums1[j];
					j++;
				} else if (nums1[j] > nums2[x]) {
					num[i] = nums2[x];
					x++;
				} else {
					num[i] = nums1[j];
					j++;
				}
			}
			return (num[num.length / 2] + num[num.length / 2 - 1]) / 2.0;
		}

	}
}
