public class Findoccurance {

    public static void printOccurenace(int arr[], int index, int key) {
        // base
        if (arr.length == index) {
            return;
        }

        if (arr[index] == key) {
            System.out.println(index + " ");
        }

        printOccurenace(arr, index + 1, key);
    }

    public static void main(String[] args) {
        int arr[] = { 3, 2, 4, 5, 6, 2, 7, 2, 2 };
        printOccurenace(arr, 0, 2);
    }

}
