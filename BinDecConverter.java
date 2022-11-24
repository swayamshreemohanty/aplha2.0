public class BinDecConverter {

    public static int binaryToDecimal(int binary) {
        int dec = 0;
        int pow = 0;
        while (binary > 0) {
            int remainder = binary % 10; // (extract the last digit)
            binary /= 10;
            dec += (remainder * (int) Math.pow(2, pow));
            pow++;
        }
        return dec;
    }

    public static int decimalToBinary(int decimal) {
        int binary = 0;
        int pow = 0;
        while (decimal > 0) {
            int remainder = decimal % 2;
            binary += remainder * (int) Math.pow(10, pow);
            decimal /= 2;
            pow++;
        }
        return binary;
    }

    public static void main(String[] args) {
        System.out.println(decimalToBinary(12));

    }
}
