public class StringCompression {
/*
    Given an array of characters chars, compress it using the following algorithm:
    Begin with an empty string s. For each group of consecutive repeating characters in chars:
    If the group's length is 1, append the character to s.
    Otherwise, append the character followed by the group's length.
    The compressed string s should not be returned separately, but instead, be stored in the input character array chars. Note that group lengths that are 10 or longer will be split into multiple characters in chars.
    After you are done modifying the input array, return the new length of the array.
    You must write an algorithm that uses only constant extra space.

    Example 1:
    Input: chars = ["a","a","b","b","c","c","c"]
    Output: Return 6, and the first 6 characters of the input array should be: ["a","2","b","2","c","3"]
    Explanation: The groups are "aa", "bb", and "ccc". This compresses to "a2b2c3".
*/
    static int compress(char[] chars) {
        String s = "";
        int counter = 0;

        if (chars.length == 1) return 1;

        // loop through chars array
        for (int i = 0; i < chars.length; i++) {
            if (i == 0) {
                s += String.valueOf(chars[i]);
            } else if (chars[i] != chars[i - 1]) {
                if (counter == 1) {
                    s += String.valueOf(chars[i]);
                } else {
                    s += counter + String.valueOf(chars[i]);
                }

                counter = 0;
            }

            counter++;

            if (i == chars.length - 1) {
                s += counter;
            }
        }

        System.out.println(s);
        System.out.println(s.length());
        return s.length();
        // question expecting char array instead...poor example and explanation.
    }

    // test case
    public static void main(String[] args) {
        char[] chars = {'a','b','b','b','b','b','b','b','b','b','b','b','b'};
        System.out.println(compress(chars));
    }
}
