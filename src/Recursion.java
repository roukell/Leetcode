import java.util.ArrayList;
import java.util.Arrays;

public class Recursion {
    public static int[] removeFirstElArr(int[] arr) {
        if (arr.length == 0 ) return new int[]{};

        int[] newArr = new int[arr.length - 1];

        for (int i = 1; i < arr.length; i++) {
            newArr[i - 1] = arr[i];
        }

        return newArr;
    }

    public static int sum(int[] arr) {
        int head = 0;
        int[] newArr = removeFirstElArr(arr);

        if (arr.length == 0) {
            return 0;
        } else {
            return arr[head] + sum(newArr);
        }
    }

    public static ArrayList<Integer> quickSort(ArrayList<Integer> arr) {
        if (arr.size() < 2) {
            return arr;
        } else {
            int pivot = arr.getFirst();
            ArrayList<Integer> less = new ArrayList<>();
            ArrayList<Integer> greater = new ArrayList<>();

            for (int i = 1; i < arr.size(); i++) {
                int j = arr.get(i);

                if (arr.get(i) > pivot) {
                    greater.add(j);
                } else if (arr.get(i) <= pivot){
                    less.add(j);
                }
            }

            // combine all arrayList: less + pivot + greater
            ArrayList<Integer> result = new ArrayList<>(quickSort(less));
            result.add(pivot);
            result.addAll(quickSort(greater));

            return result;
        }

    }

    public static void main(String[] args) {
//        int[] arr = {-1, 200, 0};
//        System.out.println(sum(arr));

        ArrayList<Integer> arrList = new ArrayList<>(Arrays.asList(2, 1, 3, 6, 5, 10, 9, 0, 7, 11));
        System.out.println(quickSort(arrList));
    }


}
