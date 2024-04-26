
public class MergeSort {

    private static void printArr(int arr[]) {
        for (int element : arr) {
            System.out.print(element + " ");
        }
    }

    private static void mergeSort(int arr[], int si, int ei) {
        // base
        if (si >= ei) {
            return;
        }

        int midIndex = (si + ei) / 2;

        // left part
        mergeSort(arr, si, midIndex);

        // right part
        mergeSort(arr, midIndex + 1, ei);

        // Merge both array
        merge(arr, si, midIndex, ei);
    }

    private static void merge(int arr[], int startIndex, int midIndex, int endIndex) {

        // temp array to store the sorted element
        int tempArray[] = new int[(endIndex - startIndex) + 1];
        int tempArrIterator = 0;

        int leftIterator = startIndex;
        int rightIterator = midIndex + 1;

        // Compare the two parts of the main array
        while (leftIterator <= midIndex && rightIterator <= endIndex) {
            if (arr[leftIterator] < arr[rightIterator]) {
                tempArray[tempArrIterator++] = arr[leftIterator++];
            } else {
                tempArray[tempArrIterator++] = arr[rightIterator++];
            }
        }

        // after the comparision if one of the array part is left then assign the
        // remaining in the temp array

        // Check for the left side
        while (leftIterator <= midIndex) {
            tempArray[tempArrIterator++] = arr[leftIterator++];
        }

        // Check for the right side
        while (rightIterator <= endIndex) {
            tempArray[tempArrIterator++] = arr[rightIterator++];
        }

        // Copy the temp array in the main array

        for (int tempArrIndex = 0,
                mainArrIndex = startIndex; tempArrIndex < tempArray.length; mainArrIndex++, tempArrIndex++) {
            arr[mainArrIndex] = tempArray[tempArrIndex];
        }

    }

    public static void main(String[] args) {
        int arr[] = { 5, 3, 2, 4, 6, 9, 2, 1, 15 };

        System.out.println("Before");
        printArr(arr);
        System.out.println("\n");

        // sort the array
        mergeSort(arr, 0, arr.length - 1);

        printArr(arr);
    }

}