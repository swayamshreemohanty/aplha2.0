public class BasicSort {
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void bubbleSort(int[] arr) {
        for (int turn = 0; turn <= (arr.length - 2); turn++) {
            for (int i = 0; i <= arr.length - 2 - turn; i++) {
                // Swap
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
    }

    public static void selectionSort(int[] arr) {
        for (int turn = 0; turn <= (arr.length - 2); turn++) {
            int minIndex = turn;
            for (int i = turn + 1; i <= arr.length - 1; i++) {
                if (arr[minIndex] > arr[i]) {
                    // Update the minIndex
                    minIndex = i;
                }
                System.out.print(arr[minIndex] + " ");
            }
            System.out.println();

            // Swap
            int temp = arr[minIndex];
            arr[minIndex] = arr[turn];
            arr[turn] = temp;
        }
    }

    public static void main(String[] args) {
        int[] array = { 5, 4, 1, 3, 2 };

        ///
        System.out.println("Before Sort");
        printArray(array);

        // Sorting
        selectionSort(array);
        //

        ///
        System.out.println("After Sort");
        printArray(array);
    }
}
