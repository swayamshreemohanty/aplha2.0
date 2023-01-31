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

    public static void main(String[] args) {
        System.out.println(setBit(10, 2));
    }
}
