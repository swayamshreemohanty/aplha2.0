/**
 * Tiling
 */
public class Tiling {

    public static int findTilesArrangeWay(int n) { // (2*n)
        // base case
        if (n == 0 || n == 1) {
            return 1;
        }

        // Find Vertical Way
        int verticalWay = findTilesArrangeWay(n - 1);

        // Find Horizontal Way
        int horizontalWay = findTilesArrangeWay(n - 2);

        // Total ways
        return verticalWay + horizontalWay;
    }

    public static void main(String[] args) {
        System.out.println(findTilesArrangeWay(5));
    }
}