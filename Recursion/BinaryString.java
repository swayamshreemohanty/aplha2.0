public class BinaryString {

    static void printBinaryString(int n, int lastNumber, String str) {
        if (n == 0) {
            System.out.println(str);
            return;
        }

        printBinaryString(n - 1, 0, str + "0");

        if (lastNumber == 0) {
            printBinaryString(n - 1, 1, str + "1");
        }

    }

    public static void main(String[] args) {
        printBinaryString(3, 0, "");
        // String str="00";

        // System.out.println(str+"1");
    }
}
