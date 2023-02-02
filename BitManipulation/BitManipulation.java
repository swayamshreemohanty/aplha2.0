public class BitManipulation {

    public static int GetIthBit(int number, int index) {
        int bitMask = 1 << index;
        return (number & bitMask) == 0 ? 0 : 1;
        // return (number & bitMask);
    }

    public static int setBit(int number, int index) {
        int bitMask = 1 << index;
        return (number | bitMask);
    }

    public static int clearBit(int number, int index) {
        int bitMask = ~(1 << index);
        return (number & bitMask);
    }

    // Update bit
    // 1st approach
    public static int updateBit(int number, int index, int newBit) {
        // 1st clear the bit on the (i)th index
        number = clearBit(number, index);

        int bitMask = newBit << index;
        return (number | bitMask);
    }

    // 2nd approach
    public static int updateBitSimple(int number, int index, int newBit) {
        if (newBit == 0) {
            return clearBit(number, index);
        } else {
            return setBit(number, index);
        }
    }
    //

    // Clear ith bits
    private static int cleariThbits(int number, int index) {
        int bitMask = (~0) << index;
        return number & bitMask;
    }

    // Clear range of bits
    private static int clearBitsinRange(int number, int from, int to) {
        int bitMask = ((~0) << (to + 1)) | ((1 << from) - 1);
        return number & bitMask;
    }

    // Check the number is Power of 2 or not
    private static boolean isPowerofTwo(int number) {
        return (number & (number - 1)) == 0;
    }

    // Check for set bits
    private static int checkSetBit(int number) {
        int count = 0;
        while (number > 0) {
            if ((number & 1) != 0) {
                count++;
            }
            number = number >> 1;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(checkSetBit(10));

    }
}
