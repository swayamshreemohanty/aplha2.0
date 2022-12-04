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

    public static void invertHalfPyramidNumber(int totalLine) {
        for (int line = 1; line <= totalLine; line++) {
            for (int number = 1; number <= (totalLine - line) + 1; number++) {
                System.out.print(number);
            }
            System.out.println();
        }
    }

    public static void floydsTriangle(int totalLine) {
        int counter = 1;
        for (int line = 1; line <= totalLine; line++) {
            for (int number = 1; number <= line; number++) {
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
    }

    public static void zeroOneTriangle(int totalLine) {

        for (int row = 1; row <= totalLine; row++) {
            for (int column = 1; column <= row; column++) {
                int number = ((column + row) % 2 == 0) ? 1 : 0;
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }

    public static void butterflyPatternMethod1(int totalLine) {
        for (int row = 1; row <= totalLine; row++) {
            // starts
            for (int star = 1; star <= row; star++) {
                System.out.print("*");
            }
            // spaces
            for (int space = row + 1; space <= ((totalLine * 2) - row); space++) {
                System.out.print(" ");
            }

            // starts
            for (int star = 1; star <= row; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // Inverted
        for (int row = totalLine; row >= 1; row--) {
            // starts
            for (int star = 1; star <= row; star++) {
                System.out.print("*");
            }

            // spaces
            for (int space = row + 1; space <= ((totalLine * 2) - row); space++) {
                System.out.print(" ");
            }

            // starts
            for (int star = 1; star <= row; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void butterflyPatternMethod2(int totalLine) {
        for (int row = 1; row <= totalLine; row++) {
            // starts
            for (int star = 1; star <= row; star++) {
                System.out.print("*");
            }
            // spaces
            for (int space = 1; space <= 2 * (totalLine - row); space++) {
                System.out.print(" ");
            }

            // starts
            for (int star = 1; star <= row; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // Inverted
        for (int row = totalLine; row >= 1; row--) {
            // starts
            for (int star = 1; star <= row; star++) {
                System.out.print("*");
            }

            // spaces
            for (int space = 1; space <= 2 * (totalLine - row); space++) {
                System.out.print(" ");
            }

            // starts
            for (int star = 1; star <= row; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // hollowPattern(4, 5);
        // invertedRotatedHalfPyramidPattern_Method2(5);
        // invertHalfPyramidNumber(5);
        // floydsTriangle(9);
        // zeroOneTriangle(5);
        butterflyPatternMethod2(4);
    }
}
