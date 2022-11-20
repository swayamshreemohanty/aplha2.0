public class BinDecConverter {

    public static double binaryToDecimal(int binary) {
        double dec = 0;
        int pow = 0;
        while (binary > 0) {
            int lastdigit = binary % 10;
            binary /= 10;
            dec += (lastdigit * Math.pow(2, pow));
            pow++;
        }
        return dec;
    }

    public static void main(String[] args) {
        System.out.println(binaryToDecimal(1000));
    }
}
