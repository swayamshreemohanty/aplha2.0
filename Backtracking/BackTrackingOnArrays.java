public class BackTrackingOnArrays {

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // change array
    public static void changeArray(int[] arr, int index, int value) {

        // base case
        if (index == arr.length) {
            System.out.println("On base case");
            printArray(arr);
            return;
        }

        // recursion
        arr[index] = value;
        changeArray(arr, index + 1, value + 1);
        arr[index] = arr[index] - 2;
    }

    public static void main(String[] args) {
        int[] arr = new int[5];
        changeArray(arr, 0, 1);
        System.out.println("After array call");
        printArray(arr);
    }

}