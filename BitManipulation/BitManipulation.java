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

    public static void main(String[] args) {
        System.out.println(cleariThbits(15, 2));

    }
}
