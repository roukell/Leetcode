public class PalindromeNumber {
    // Math
    // if x is a palindrome number, return true
    public static boolean isPalindrome(int x) {

        String y = String.valueOf(x);
        StringBuilder z = new StringBuilder(y);
        String i = z.reverse().toString();

        return y.equals(i);
    }

//    public static void main(String[] args) {
//        int num = 12111;
//        System.out.println(isPalindrome(num));
//    }
}
