public class SpiralMatrix {

    public static void printSpiralMatrix(int matrix[][]) {
        int startRowIndex = 0;
        int endRowIndex = matrix.length - 1;
        int startColumnIndex = 0;
        int endColumnIndex = matrix[0].length - 1;
        while ((startRowIndex <= endRowIndex) && (startColumnIndex <= endColumnIndex)) {
            // print the top border(left to right)
            for (int i = startColumnIndex; i <= endColumnIndex; i++) {
                System.out.print(matrix[startRowIndex][i] + " ");
            }

            // print the right border (top to bottom)
            for (int i = startRowIndex + 1; i <= endRowIndex; i++) {
                System.out.print(matrix[i][endColumnIndex] + " ");
            }

            // print the bottom border (right to left)
            for (int i = endColumnIndex - 1; i >= startColumnIndex; i--) {
                if (startRowIndex == endRowIndex) {
                    break;
                }

                System.out.print(matrix[endRowIndex][i] + " ");
            }

            // print the left border (bottom to top)
            for (int i = endRowIndex - 1; i >= startRowIndex + 1; i--) {
                if (startColumnIndex == endColumnIndex) {
                    break;
                }

                System.out.print(matrix[i][startColumnIndex] + " ");
            }

            // Increase the start row
            startRowIndex++;

            // Increase the start column
            startColumnIndex++;

            // Decrease the end Column
            endColumnIndex--;

            // Decrease the end row
            endRowIndex--;

        }
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, {
                13, 14, 15, 16 } };
        // int matrix[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };

        printSpiralMatrix(matrix);
    }
}
