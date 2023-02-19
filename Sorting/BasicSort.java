import java.util.Arrays;

public class BasicSort {
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
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

    public static void insertionSort(int[] arr) {
        for (int turn = 1; turn < arr.length; turn++) {
            int currentElement = arr[turn];
            int previousIndex = turn - 1;
            while (previousIndex >= 0 && arr[previousIndex] > currentElement) {
                arr[previousIndex + 1] = arr[previousIndex];
                previousIndex--;
            }
            // Insertion
            arr[previousIndex + 1] = currentElement;
        }
    }

    /**This sorting method should be use for +ve numbers, and the value should be small.
    *ex: 1, 4, 1, 3, 2, 4, 3, 12.
    *
    *Here repeatation doesn't matters
    */
    public static void countingSort(int[] arr) {
        int maxElement = Integer.MIN_VALUE;
        // Find max element
        for (int i = 0; i < arr.length; i++) {
            maxElement = Integer.max(maxElement, arr[i]);
        }

        // Repeat counter array
        int repeatCounterArr[] = new int[maxElement + 1];

        //Count for repeat element and assign the counter as element for repeatCounter array
        for (int i = 0; i < arr.length; i++) {
            repeatCounterArr[arr[i]]++;
        }

        // Sorting
        int mainArrayIndex = 0;
        for (int i = 0; i < repeatCounterArr.length; i++) {
            while (repeatCounterArr[i] > 0) {
                arr[mainArrayIndex] = i;
                repeatCounterArr[i]--;
                mainArrayIndex++;
            }

        }

        System.out.println("MAX: " + maxElement);
    }

    public static void main(String[] args) {
        // int[] array = { 5, 4, 1, 3, 2 };
        int[] array = { 1, 4, 1, 3, 2, 4, 3, 12 };

        ///
        System.out.println("Before Sort");
        printArray(array);

        // Sorting
        countingSort(array);
        //
        ///
        System.out.println("After Sort");
        printArray(array);
    }
}
