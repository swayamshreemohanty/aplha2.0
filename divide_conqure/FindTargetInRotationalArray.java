/**
 * find_target_in_rotational_array
 */
public class FindTargetInRotationalArray {

    public static int findTarget(int array[], int targetElement, int startIndex, int endIndex) {
        // base case
        if (startIndex > endIndex) {
            // In this case no value found and return -1
            return -1;
        }

        // work

        // 1. find mid:
        int midIndex = startIndex + ((endIndex - startIndex) / 2);

        // 2. 1st check if the target is on the mid or not
        if (array[midIndex] == targetElement) {
            return midIndex;
        }

        // 3. else check on the slope
        //
        // midIndex on L1 //4,5,6,7

        if (array[startIndex] <= array[midIndex]) {
            // case 1: Check on the left side of the mid index
            if (array[startIndex] <= targetElement && targetElement <= array[midIndex]) {
                return findTarget(array, targetElement, startIndex, midIndex - 1);
            } else {
                // case 2: Check the right side part along with the slope 2
                return findTarget(array, targetElement, midIndex + 1, endIndex);

            }
        } else {

            // mid index on the L2 //0,1,2
            if (array[midIndex] <= targetElement && targetElement <= array[endIndex]) {
                // case 2: Check on the right side of the mid index

                return findTarget(array, targetElement, midIndex + 1, endIndex);

            } else {
                // case 4: Check the left side part along with the slope 1
                return findTarget(array, targetElement, startIndex, midIndex - 1);

            }
        }
    }

    public static void main(String[] args) {

        int[] arr = { 4, 5, 6, 7, 0, 1, 2 };
        int targetElement = 0;

        System.out.println("The target is at: " + findTarget(arr, targetElement, 0, arr.length - 1) + " index");

    }

}