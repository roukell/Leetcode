public class IncreasingTripletSubsequence {
    /*
    Given an integer array nums, return true if there exists a triple of indices (i, j, k) such that i < j < k and nums[i] < nums[j] < nums[k]. If no such indices exists, return false.

    Example 1:
    Input: nums = [1,2,3,4,5]
    Output: true
    Explanation: Any triplet where i < j < k is valid.

    Example 2:
    Input: nums = [5,4,3,2,1]
    Output: false
    Explanation: No triplet exists.

    Example 3:
    Input: nums = [2,1,5,0,4,6]
    Output: true
    Explanation: The triplet (3, 4, 5) is valid because nums[3] == 0 < nums[4] == 4 < nums[5] == 6.
     */

    static boolean increasingTriplet(int[] nums) {
        int first_num = Integer.MAX_VALUE;
        int second_num = Integer.MAX_VALUE;

        for (int i : nums) {
            // find the smallest number which is the first number
            if (i <= first_num) {
                first_num = i;
            } else if (i <= second_num) {
                // if i is less than second number (but greater than first number)
                second_num = i;
            } else {
                // if i is greater than first_num and second_num
                // for this problem, we are only looking for the existence of a valid increasing triplet subsequence, even though first_num and second_num are out of order, we don't need to worry about it.
                return true;
            }
        }

        return false;
    }

    // test case
//    public static void main(String[] args) {
//        int[] nums = {3,5,2,7,1,4,6};
//        System.out.println(increasingTriplet(nums));
//    }
}
