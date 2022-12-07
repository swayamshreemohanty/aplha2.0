public class ArraySearch {

    public static int binarySearch(int array[], int key) {

        int startIndex = 0;
        int endIndex = array.length - 1;

        while (startIndex <= endIndex) {

            int midindex = (startIndex + endIndex) / 2;

            if (array[midindex] == key) {
                return midindex;
            } else if (array[midindex] < key) { // Key must be in the right side of the mid point
                startIndex = midindex + 1;
            } else if (array[midindex] > key) {// Key must be in the left side of the mid point
                endIndex = midindex - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int array[] = { 1, 2, 4, 5, 8, 9, 16, 28, 30 };
        int index = binarySearch(array, 9);
        if (index == -1) {
            System.out.println("Index not found");
        } else {
            System.out.println("index found on: " + index);
        }
    }
}
