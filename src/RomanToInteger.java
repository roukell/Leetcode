import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    // HashMap
    // O(1)
    // n(1)
    static Map<String, Integer> values = new HashMap<>();

    static {
        values.put("I", 1);
        values.put("V", 5);
        values.put("X", 10);
        values.put("L", 50);
        values.put("C", 100);
        values.put("D", 500);
        values.put("M", 1000);
        values.put("IV", 4);
        values.put("IX", 9);
        values.put("XL", 40);
        values.put("XC", 90);
        values.put("CD", 400);
        values.put("CM", 900);
    }

    public static int romanToInt(String s) {
        int currentSum = 0;
        int i = 0;

        while (i < s.length()) {
            // if s[i] is not the last element in String s
            if (i < s.length() - 1) {
                // try to find double symbols from the map
                String doubleSymbol = s.substring(i, i + 2);

                if (values.containsKey(doubleSymbol)) {
                    currentSum += values.get(doubleSymbol);
                    i += 2;
                    continue;
                }
            }

            // otherwise it must be length 1 symbol
            String singleSymbol = s.substring(i, i + 1);
            currentSum += values.get(singleSymbol);
            i++;
        }

        return currentSum;
    }

    // test case
    public static void main(String[] args) {
        String s = "XI";
        System.out.println(romanToInt(s));
    }

}
