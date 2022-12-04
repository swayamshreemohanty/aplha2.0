public class test {
    public static void main(String[] args) {
        int n = 4;
        // total item 8
        // star=2
        // spaces=6

        for (int row = 1; row <= n; row++) {
            // starts
            for (int star = 1; star <= row; star++) {
                System.out.print("*");
            }
            // spaces
            for (int space = (row + 1); space <= ((n * 2) - row); space++) {
                System.out.print(" ");
            }
            // starts
            for (int star = 1; star <= row; star++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // inverted
        for (int row = n; row >= 1; row--) {
            // starts
            for (int star = 1; star <= row; star++) {
                System.out.print("*");
            }
            // spaces
            for (int space = (row + 1); space <= ((n * 2) - row); space++) {
                System.out.print(" ");
            }
            // starts
            for (int star = 1; star <= row; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
