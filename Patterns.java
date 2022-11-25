public class Patterns {

    public static void hollowPattern(int totalRows, int totalColums) {
        for (int row = 1; row <= totalRows; row++) {
            for (int column = 1; column <= totalColums; column++) {
                if (row == 1 || row == totalRows || column == 1 || column == totalColums) {
                    System.out.print("* ");

                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void invertedRotatedHalfPyramidPattern_Method1(int totalRows) {
        int totalColums = totalRows; // This is a Square matrix
        for (int row = 1; row <= totalRows; row++) {
            int space = totalColums - row;
            for (int column = 1; column <= totalColums; column++) {
                if (column <= space) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    public static void invertedRotatedHalfPyramidPattern_Method2(int totalRows) {
        for (int row = 1; row <= totalRows; row++) {
            // Print spaces
            for (int space = 1; space <= (totalRows - row); space++) {
                System.out.print(" ");
            }

            // Print stars
            for (int star = 1; star <= row; star++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        // hollowPattern(4, 5);
        invertedRotatedHalfPyramidPattern_Method2(5);
    }
}
