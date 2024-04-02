public class FindPeakElement {
/*  binary search
    A peak element is an element that is strictly greater than its neighbors.
    Given a 0-indexed integer array nums, find a peak element, and return its index. If the array contains multiple peaks, return the index to any of the peaks.
    You may imagine that nums[-1] = nums[n] = -∞. In other words, an element is always considered to be strictly greater than a neighbor that is outside the array.
    You must write an algorithm that runs in O(log n) time.

    Example 1:
    Input: nums = [1,2,3,1]
    Output: 2
    Explanation: 3 is a peak element and your function should return the index number 2.

    Example 2:
    Input: nums = [1,2,1,3,5,6,4]
    Output: 5
    Explanation: Your function can return either index number 1 where the peak element is 2, or index number 5 where the peak element is 6.
*/

    static int findPeakEl(int[] nums) {
        int max = nums.length - 1; // max is the last index -1
        int min = 0; // min is the first index 0

        if (max == min) return 0;

        // A peak element is an element that is strictly greater than its neighbors
        // start search from the middle of the nums array
        while (min < max) {
            // find middle index
            int mid = min + (max - min)/2;

            // if mid is greater than the number on the right, check the array on the left side
            if (nums[mid] > nums[mid + 1]) {
                max = mid;
            } else {
                // if mid is less than the number on the right, check the array on the right side
                min = mid + 1;
            }
        }

        return min;
    }

    // test cases
//    public static void main(String[] args) {
//        int[] nums = {1,2,1,3,5,6,4};
//        System.out.println(findPeakEl(nums));
//    }
}
