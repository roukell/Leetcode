public class ProductOfArrayExceptSelf {

    /**
     * Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
     * The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
     * You must write an algorithm that runs in O(n) time and without using the division operation.
     * <p>
     * Example 1:
     * Input: nums = [1,2,3,4]
     * Output: [24,12,8,6]
     * <p>
     * Example 2:
     * Input: nums = [-1,1,0,-3,3]
     * Output: [0,0,9,0,0]
     */

    static int[] productExceptSelf(int[] nums) {
        // find out the length of nums array
        int numsLength = nums.length;
        // create left and right array list to store result
        int[] left = new int[numsLength];
        int[] right = new int[numsLength];
        // final answer to be returned
        int[] output = new int[numsLength];

        // left: loop through nums from the left side, index 0 will be 1 for now.
        left[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            left[i] = nums[i - 1] * left[i - 1];
        }

        // right: loop through nums from the right side
        right[numsLength - 1] = 1;
        for (int i = numsLength - 2; i >= 0; i--) {
            right[i] = nums[i + 1] * right[i + 1];
        }

        // construct the output array
        for (int i = 0; i < numsLength; i++) {
            output[i] = left[i] * right [i];
        }

        return output;
    }

    // test case
//    public static void main(String[] args)
//    {
//        int[] nums1 = {1,2,3,4};
//        System.out.println(Arrays.toString(productExceptSelf(nums1)));
//    }
}

