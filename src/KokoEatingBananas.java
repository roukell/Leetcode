import java.util.Arrays;

public class KokoEatingBananas {
/*
    binary search
    Koko loves to eat bananas. There are n piles of bananas, the ith pile has piles[i] bananas. The guards have gone and will come back in h hours.
    Koko can decide her bananas-per-hour eating speed of k. Each hour, she chooses some pile of bananas and eats k bananas from that pile. If the pile has less than k bananas, she eats all of them instead and will not eat any more bananas during this hour.
    Koko likes to eat slowly but still wants to finish eating all the bananas before the guards return.
    Return the minimum integer k such that she can eat all the bananas within h hours.

    Example 1:
    Input: piles = [3,6,7,11], h = 8
    3/4 + 6/4 + 7/4 + 11/4 = 1 + 2 + 2 + 3 = 8
    3/11 + 6/11 + 7/11 + 11/11 = 1 + 1 + 1 + 1 = 4 --> not the minimal
    3/7 + 6/7 + 7/7 + 11/7 = 1 + 1 + 1 + 2 = 5 --> not the minimal
    3/6 + 6/6 + 7/6 + 11/6 = 1 + 1 + 2 + 2 = 6 --> not the minimal
    3/3 + 6/3 + 7/3 + 11/3 = 1 + 2 + 3 + 4 = 10 --> cannot finish bananas within 8 hours
    3/5 + 6/5 + 7/5 + 11/5 = 1 + 2 + 2 + 3 = 8
    Output: 4

    Example 2:
    Input: piles = [30,11,23,4,20], h = 5
    30/30 + 11/30 + 23/30 + 4/30 + 20/30 = 1 + 1 + 1 + 1 + 1 = 5
    Output: 30

    Example 3:
    Input: piles = [30,11,23,4,20], h = 6
    30/23 + 11/23 + 23/23 + 4/23 + 20/23 = 2 + 1 + 1 + 1 + 1 = 6
    Output: 23
*/
    static int minEatingSpeed(int[] piles, int h) {
        // we can start with middle value. assume k = middle
        // sort the array first, so piles array start from the smallest number to largest
        Arrays.sort(piles);

        int left = 1; // min eating speed
        int right = 1; // max eating speed = max number of banana in piles
        for (int bananaNum : piles) {
            right = Math.max(right, bananaNum);
        }

        while (right > left) {
            int mid = (right + left)/2;
            int estimatedHours = 0;

            // Iterate over the piles and calculate estimated hours.
            // We increase the estimatedHours by ceil(bananaNum / middle)
            for (int bananaNum : piles) {
                estimatedHours += (int) Math.ceil((double) bananaNum / mid);
            }

            if (estimatedHours <= h) {
                // if estimated hours is less than and equal to h, we need to decrease number of banana eaten in an hour (decrease speed)
                // in this case, let right = mid
                right = mid;
            } else {
                // else, we need to increase number of banana eaten in an hour (increase sped)
                left = mid + 1;
            }
        }

        // once right = left, the value of left or right = answer
        return left;
    }

    // test case
//    public static void main(String[] args) {
//        int[] piles = {30,11,23,4,20};
//        int h = 5;
//        System.out.println(minEatingSpeed(piles, h));
//    }
}
