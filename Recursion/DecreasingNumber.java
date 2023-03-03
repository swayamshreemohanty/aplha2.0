
public class DecreasingNumber {
    static void printDecreasingNumber(int number) {
        if (number==0) {
            return;
        }
        System.out.print(number + " ");
        printDecreasingNumber(number - 1);
    }

    public static void main(String[] args) {
        printDecreasingNumber(5);
    }
}
