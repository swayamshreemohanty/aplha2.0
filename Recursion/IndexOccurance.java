class IndexOccurance {

    //1st method
    private static int findLastOccurance(int numberList[], int index, int key) {
        if (index >= numberList.length) {
            return -1;
        }
        int result = findLastOccurance(numberList, index + 1, key);

        if (result == -1 && numberList[index] == key) {
            return index;
        } else {
            return result;
        }

    }

    //2nd method
    private static int findLastOccuranceReverse(int numberList[], int index, int key) {
        if (index <= 0) {
            return -1;
        }
        // Compare
        if (numberList[index] == key) {
            return index;
        } else {
            // Look forward
            return findLastOccuranceReverse(numberList, index - 1, key);
        }

    }

    private static int findFirstOccurance(int numberList[], int index, int key) {
        if (index >= numberList.length) {
            return -1;
        }
        // Compare
        if (numberList[index] == key) {
            return index;
        } else {
            // Look forward
            return findFirstOccurance(numberList, index + 1, key);
        }

    }

    public static void main(String[] args) {
        int arr[] = { 8, 3, 6, 9, 5, 10, 9, 5, 3 };
        // System.out.println(findFirstOccurance(arr, 0, 9));
        // System.out.println(findLastOccurance(arr, 0, 3));
        System.out.println(findLastOccuranceReverse(arr, (arr.length-1), 9));
    }
}