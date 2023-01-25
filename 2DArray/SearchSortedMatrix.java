public class SearchSortedMatrix {
    // Start the search from top right element
    private static boolean staircaseSearch(int matrix[][], int key) {
        int row = 0;
        int column = matrix[0].length - 1;
        while (row < matrix.length && column >= 0) {
            if (key == matrix[row][column]) {
                System.out.println("Key found at: " + "(" + row + "," + column + ")");
                return true;
            } else if (key < matrix[row][column]) {
                column--;
            } else {
                row++;
            }
        }
        System.out.println("Key not found");
        return false;
    }

    // Start the search from bottom left element
    private static boolean reverseStaircaseSearch(int matrix[][], int key) {
        int row = matrix.length - 1;
        int column = 0;
        while (row >= 0 && column < matrix[0].length) {
            if (key == matrix[row][column]) {
                System.out.println("Key found at: " + "(" + row + "," + column + ")");
                return true;
            } else if (key < matrix[row][column]) {
                row--;
            } else {
                column++;
            }
        }
        System.out.println("Key not found");
        return false;
    }

    public static void main(String[] args) {
        int matrix[][] = { { 10, 20, 30, 40 }, { 15, 25, 35, 45 }, { 27, 29, 37, 48 }, { 32, 33, 39, 50 }, };
        int key = 33;
        System.out.println(staircaseSearch(matrix, key));
    }
}
