public class IncreasingNumber {

    public static void printIncreaseNumber(int number) {
        if (number == 1) {
            System.out.print(number + " ");
            return;
        }
        printIncreaseNumber(number - 1);
        System.out.print(number + " ");
        return;
    }

    public static void main(String[] args) {
        printIncreaseNumber(5);
    }
}
