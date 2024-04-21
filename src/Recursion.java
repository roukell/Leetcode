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

    public static void main(String[] args) {
        int[] arr = {2 ,4, 6, 8, 10};
        System.out.println(sum(arr));
    }


}
