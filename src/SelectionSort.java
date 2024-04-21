import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SelectionSort {
    public static List<Integer> convertToArrayList(int[] array) {
        List<Integer> newList = new ArrayList<>();

        for (int j : array) {
            newList.add(j);
        }

        return newList;
    }

    public static int findSmallest(List<Integer> array) {
        int smallest = array.getFirst();
        int smallestIndex = 0;

        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) < smallest) {
                smallest = array.get(i);
                smallestIndex = i;
            }
        }

        return smallestIndex;
    }

    public static void selectionSort(int[] array) {
        List<Integer> newArray = new ArrayList<>();
        List<Integer> copiedArray = convertToArrayList(array);
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            int smallestIndex = findSmallest(copiedArray);

            newArray.add(copiedArray.get(smallestIndex));
            System.out.println(i + ". newArray: " + newArray);

            copiedArray.remove(smallestIndex);
            System.out.println(i + ". copiedArray: " + copiedArray);
        }

        System.out.println("final copied array: " + copiedArray);
        System.out.println("final new array: " + newArray);
    }

    public static void main(String[] args) {
        int[] array = {5, 3, 7, 9, 10, 15, 0};
        selectionSort(array);
    }
}
