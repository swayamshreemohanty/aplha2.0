public class CheckOddEven {
    private static void OddOrEven(int number) {
        int bitMask = 1;
        if ((number & bitMask) == 0) {
            System.out.println(number + " is Even");
        } else {
            System.out.println(number + " is Odd");
        }
    }

    public static void main(String[] args) {
        OddOrEven(10);
        OddOrEven(4);
        OddOrEven(7);
    }
}