public class Array {

    public static void reverseArrayBySwap(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int temp = 0;
            int endIndex = (array.length - 1) - i;
            if (i < endIndex) {
                temp = array[i];
                array[i] = array[endIndex];
                array[endIndex] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 5, 9, 10, 15 };

        System.out.println("Before reverse");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        reverseArrayBySwap(array);

        System.out.println();
        System.out.println("After reverse");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
