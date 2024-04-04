public class PalindromeNumber {
    // Math
    // if x is a palindrome number, return true
    public static boolean isPalindrome(int x) {

        String y = String.valueOf(x);
        StringBuilder z = new StringBuilder(y);
        String i = z.reverse().toString();

        return y.equals(i);
    }

    // Time: O(log10(N))
    // N = int x
    // Space: O(1)
    public static boolean isPalindrome2(int x) {
        // negative number cannot be palindrome
        // numbers end with 0 cannot be palindrome
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int revertedNumber = 0;
        while (x > revertedNumber) {
            // append the last digit of x
            revertedNumber = revertedNumber * 10 + x % 10;

            // change the last digit of x
            x /= 10;
        }

        return x == revertedNumber || x == revertedNumber/10;
    }

//    public static void main(String[] args) {
//        int num = 1221;
//        System.out.println(isPalindrome2(num));
//    }
}
