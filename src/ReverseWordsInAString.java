import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseWordsInAString {
    static String reverseWords(String s) {
        // create a string array to store split words
        String[] stringArray = s.split("\\s+");
        // create an empty string for result
        String result = "";

        // loop through the words in stringArray
        for (int i = 0; i < stringArray.length; i++) {
            // if it's the last word, it will turn into the first word without a space in the front
            // any other words that's not the last word will have a space in the front
            if (i == stringArray.length - 1) {
                result = stringArray[i] + result;
            } else {
                result = " " + stringArray[i] + result;
            }
        }

        return result.trim();
    }

    static String reverseWordsV2(String s) {
        // remove leading spaces
        s = s.trim();

        // split by multiple spaces
        List<String> wordList = Arrays.asList(s.split("\\s+"));
        Collections.reverse(wordList);

        return String.join(" ", wordList);
    }

//    public static void main(String[] args)
//    {
//        String s1 = "the sky is blue";
//        System.out.println(reverseWordsV2(s1));
//
//        String s2 = "  hello world  ";
//        System.out.println(reverseWordsV2(s2));
//
//        String s3 = "a good   example";
//        System.out.println(reverseWordsV2(s3));
//    }
}

