public class SortedArray {

    public static boolean isArraySorted(int[] array, int i) {
        //base case
        if (i == (array.length - 1)) {
            return true;
        } else {
            if (array[i] > array[i + 1]) {
                return false;
            } else {
                return isArraySorted(array, i + 1);
            }
        }

    }

    public static void main(String[] args) {
        int[] array = { 1,2,5 };
        System.out.println(isArraySorted(array, 0));
    }
}
