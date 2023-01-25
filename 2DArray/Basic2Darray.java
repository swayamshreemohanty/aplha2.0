import java.util.Scanner;

public class Basic2Darray {
    public static void main(String[] args) {
        int matrix[][] = new int[3][6];
        // int matrix[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int rows = matrix.length;
        int columns = matrix[0].length;
        Scanner scanner = new Scanner(System.in);

        // take input
        for (int row = 0; row < rows; row++) {
            System.out.println("Enter data for row " + (row + 1));
            for (int column = 0; column < columns; column++) {
                matrix[row][column] = scanner.nextInt();
            }
        }
        System.out.println();
        scanner.close();

        int smallestElement = Integer.MAX_VALUE;
        int largestElement = Integer.MIN_VALUE;
        // print the matrix
        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {
                int currentMatrixElement = matrix[row][column];
                if (smallestElement > currentMatrixElement) {
                    smallestElement = currentMatrixElement;
                }
                if (largestElement < currentMatrixElement) {
                    largestElement = currentMatrixElement;
                }
                System.out.print(currentMatrixElement + " ");
            }
            System.out.println();
        }
        System.out.println("The minimum element in the matrix is: " + smallestElement);
        System.out.println("The maximum element in the matrix is: " + largestElement);
    }
}
