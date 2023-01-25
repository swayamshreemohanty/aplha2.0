public class Transpose {
    public static void printMatrix(int matrix[][]) {
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[0].length; column++) {
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }
    }

    public static void transpose(int matrix[][]) {
        int newRow = matrix[0].length;
        int newColumn = matrix.length;
        int newMatrix[][] = new int[newRow][newColumn];

        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[0].length; column++) {
                newMatrix[column][row] = matrix[row][column];
            }
        }

        // Print the transpose matrix
        printMatrix(newMatrix);
    }

    public static void main(String[] args) {
        int[][] matrix = { { 11, 12, 13 }, { 21, 22, 23 } };
        transpose(matrix);
    }
}
