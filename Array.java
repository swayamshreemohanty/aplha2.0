public class Array {

    public static void reverseArrayBySwap(int[] array) {

        // Method 1

        int startIndex = 0, lastIndex = array.length - 1;

        while (startIndex < lastIndex) {
            int temp = array[startIndex];
            array[startIndex] = array[lastIndex];
            array[lastIndex] = temp;

            //
            startIndex++;
            lastIndex--;
        }

        // Method 2
        // for (int i = 0; i < array.length; i++) {
        // int temp = 0;
        // int endIndex = (array.length - 1) - i;
        // if (i < endIndex) {
        // temp = array[i];
        // array[i] = array[endIndex];
        // array[endIndex] = temp;
        // }
        // }
    }

    public static void arrayPairs(int[] array) {
        int totalPair = 0; // (n(n-1))/2
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                System.out.print("(" + array[i] + "," + array[j] + ")" + " ");
                totalPair++;
            }
            System.out.println();
        }
        System.out.println("Total pair: " + totalPair);
    }

    public static void maxSubArraySumByPrefixArray(int[] array) {
        int[] prefixArray = new int[array.length];
        int maxSum = Integer.MIN_VALUE;
        // create prefix array
        prefixArray[0] = array[0];

        // This loop always starts from 1, because prefix array 1st element should be
        // same as main array 1st index.
        // Because the sum of the element with the main array starts from the second
        // element in the prefix
        // array.
        for (int prefixIndex = 1; prefixIndex < prefixArray.length; prefixIndex++) {
            prefixArray[prefixIndex] = prefixArray[prefixIndex - 1] + array[prefixIndex];
        }
        //

        // Find the subarray sum
        for (int startIndex = 0; startIndex < array.length; startIndex++) {
            for (int endIndex = startIndex; endIndex < array.length; endIndex++) {

                // Formula to find subarray sum from prefix array:
                // sum= prefixArray[endIndex] - prefixArray[startIndex-1];

                int currentSum = startIndex == 0 ? prefixArray[endIndex]
                        : prefixArray[endIndex] - prefixArray[startIndex - 1];

                if (currentSum > maxSum) {
                    maxSum = currentSum;
                }
            }
        }

        System.out.println("Max Subarray sum is:"+maxSum);
    }

    public static void subArray(int[] array) {
        int totalSubArray = 0; // (n(n+1))/2
        int maxSubArraySum = Integer.MIN_VALUE;
        for (int startIndex = 0; startIndex < array.length; startIndex++) {
            for (int endIndex = startIndex; endIndex < array.length; endIndex++) {

                int currSubArraySum = 0;
                // Subarray
                for (int subArrayIndex = startIndex; subArrayIndex <= endIndex; subArrayIndex++) {
                    System.out.print(array[subArrayIndex] + " ");
                    currSubArraySum += array[subArrayIndex];
                }
                System.out.println("//SubArraySum: " + currSubArraySum);
                if (currSubArraySum > maxSubArraySum) {
                    maxSubArraySum = currSubArraySum;
                }
                totalSubArray++;
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Total SubArray: " + totalSubArray);
        System.out.println("Max SubArray SUM: " + maxSubArraySum);
    }

    public static void main(String[] args) {
        // int[] array = { 2, 4, 6, 8, 10 };
        int[] array = { 1, -2, 6, -1, 3 };
        // subArray(array);
        maxSubArraySumByPrefixArray(array);
    }
}
