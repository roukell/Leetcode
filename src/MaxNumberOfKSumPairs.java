import java.util.Arrays;

public class MaxNumberOfKSumPairs {
/*  two pointers
    You are given an integer array nums and an integer k.
    In one operation, you can pick two numbers from the array whose sum equals k and remove them from the array.
    Return the maximum number of operations you can perform on the array.

    Example 1:
    Input: nums = [1,2,3,4], k = 5
    Output: 2
    Explanation: Starting with nums = [1,2,3,4]:
            - Remove numbers 1 and 4, then nums = [2,3]
            - Remove numbers 2 and 3, then nums = []
    There are no more pairs that sum up to 5, hence a total of 2 operations.

    Example 2:
    Input: nums = [3,1,3,4,3], k = 6
    Output: 1
    Explanation: Starting with nums = [3,1,3,4,3]:
            - Remove the first two 3's, then nums = [1,4,3]
    There are no more pairs that sum up to 6, hence a total of 1 operation
*/
    static int maxOperations(int[] nums, int k) {
        int l = 0;
        int r = nums.length - 1;
        int count = 0;
        Arrays.sort(nums);

        while (l < r) {
            if (nums[r] + nums[l] == k) {
                count++;
                l++;
                r--;
            } else if (nums[r] + nums[l] < k) {
                l++;
            } else if (nums[r] + nums[l] > k) {
                r--;
            }
        }

        return count;
    }

    //    test case
//    public static void main(String[] args) {
//        int[] nums = new int[]{4,4,1,3,1,3,2,2,5,5,1,5,2,1,2,3,5,4};
//        int k = 2;
//        System.out.println(maxOperations(nums, k));
//    }
}
