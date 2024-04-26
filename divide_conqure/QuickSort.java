/**
 * QuickSort
 */
public class QuickSort {
    private static void printArr(int arr[]) {
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    private static int partition(int arr[], int startIndex, int endIndex) {

        int i = startIndex - 1;
        int pivotIndex = endIndex;

        for (int j = startIndex; j < endIndex; j++) {
            if (arr[j] < arr[pivotIndex]) {
                // Swap
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        // Move the pivot element to it's sort position

        // Swap
        i++;
        int temp = arr[pivotIndex];
        arr[pivotIndex] = arr[i];
        arr[i] = temp;

        return i;
    }

    private static void quickSort(int arr[], int startIndex, int endIndex) {

        if (startIndex >= endIndex) {
            return;
        }

        int pivotIndex = partition(arr, startIndex, endIndex);

        System.out.println("pivotIndex " + pivotIndex);

        // Sort Left array
        quickSort(arr, startIndex, pivotIndex - 1);

        // Sort Right array
        quickSort(arr, pivotIndex + 1, endIndex);
    }

    public static void main(String[] args) {
        // int arr[] = { 9, 8, 4, 2, 10, 3, 6 };
        int arr[] = { 6, 3, 9, 5, 2, 8 };

        printArr(arr);
        quickSort(arr, 0, arr.length - 1);
        printArr(arr);
    }
}