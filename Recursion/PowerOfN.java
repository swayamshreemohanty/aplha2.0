public class PowerOfN {

    static int findPower(int number, int power) {
        if (power == 0) {
            return 1;
        }
        return number * findPower(number, power - 1);
    }

    // Optimize
    static int findPowerOptimized(int number, int power) {
        if (power == 0) {
            return 1;
        }

        // Find the power of a half series
        int halfPowerValue = findPowerOptimized(number, power / 2);

        // Find the square of that power value
        int halfPowerSquare = halfPowerValue * halfPowerValue;

        if (power % 2 == 0) {
            // Even number
            return halfPowerSquare;
        } else {
            // Odd number
            return number * halfPowerSquare;
        }

    }

    public static void main(String[] args) {
        System.out.println(findPowerOptimized(2, 5));
    }
}
