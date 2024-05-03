public class GridWays {

    public static int findGridWays(int rowCell, int columnCell, int totalRow, int totalColumn) {
        // base case

        // 1. Check for the target cell
        if (rowCell == totalRow - 1 && columnCell == totalColumn - 1) {
            return 1;
        }
        // 2. Check for the boundary cross
        else if (rowCell == totalRow || columnCell == totalColumn) {
            return 0;
        }

        // row wise
        int w1 = findGridWays(rowCell + 1, columnCell, totalRow, totalColumn);

        // column wise
        int w2 = findGridWays(rowCell, columnCell + 1, totalRow, totalColumn);

        return w1 + w2;
    }

    public static void main(String[] args) {
        int rowCell = 0;
        int columnCell = 0;

        int totalRow = 3;
        int totalColumn = 3;

        System.out.println(findGridWays(rowCell, columnCell, totalRow, totalColumn));
    }
}
