public class SearchInsertPosition {
/*
    Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
    You must write an algorithm with O(log n) runtime complexity.

    Example 1:
    Input: nums = [1,3,5,6], target = 5
    Output: 2

    Example 2:
    Input: nums = [1,3,5,6], target = 2
    Output: 1

    Example 3:
    Input: nums = [1,3,5,6], target = 7
    Output: 4
*/

    public static int searchInsert(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            int lo = 0, hi = nums.length;

            while (lo < hi) {
                int mid = lo + (hi - lo)/2;

                if (nums[mid] > target) {
                    hi = mid;
                } else if (nums[mid] < target){
                    lo = mid + 1;
                } else {
                    return mid;
                }
            }

            return lo;
        }

        return -1;
    }

    // test case
//    public static void main(String[] args)
//    {
//        int[] nums = {1,3,5,6};
//        int target = 7;
//
//        System.out.println(searchInsert(nums, target));
//    }
}
