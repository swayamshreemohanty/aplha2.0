import java.util.Scanner;

public class ReverseNumber {

    // formula: reverse=(reverse*10)+lastdigit
    private static int reverseNumber(int number) {
        int reverse = 0;
        while (number > 0) {
            int lastdigit = number % 10;
            reverse = (reverse * 10) + lastdigit;
            number = number / 10;
        }
        return reverse;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int number = scanner.nextInt();
        scanner.close();
        System.out.println("Reverse of " + number + " is " + reverseNumber(number));
    }
}
