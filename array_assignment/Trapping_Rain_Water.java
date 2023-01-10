public class Trapping_Rain_Water {

    public static int findTrappedRainWater(int[] heights) {
        int[] leftMaxBoundiers = new int[heights.length];

        int[] rightMaxBoundiers = new int[heights.length];

        // Find left max boundiers
        leftMaxBoundiers[0] = heights[0];

        // find for rest array
        for (int i = 1; i < heights.length; i++) {
            leftMaxBoundiers[i] = Integer.max(leftMaxBoundiers[i - 1], heights[i]);
        }

        // Find right max boundiers
        rightMaxBoundiers[rightMaxBoundiers.length - 1] = heights[heights.length - 1];
        for (int i = rightMaxBoundiers.length - 2; i >= 0; i--) {
            rightMaxBoundiers[i] = Integer.max(rightMaxBoundiers[i + 1], heights[i]);

        }

        int totalWaterTrapperd = 0;
        // Find water level for each heights
        for (int i = 0; i < heights.length; i++) {
            int waterLevelHeight = Integer.min(leftMaxBoundiers[i], rightMaxBoundiers[i]);
            int trappedWater = (waterLevelHeight - heights[i]) * 1; // Here 1 is the width of the height bar
            totalWaterTrapperd += trappedWater;
        }

        return totalWaterTrapperd;
    }

    // Optimized
    public static int trappedWater(int[] heights) {
        int trappedWater = 0;
        int leftIndex = 0;
        int rightIndex = heights.length - 1;
        int leftMax = heights[leftIndex];
        int rightMax = heights[rightIndex];

        while (leftIndex < rightIndex) {
            if (leftMax < rightMax) {
                leftIndex++;
                leftMax = Integer.max(leftMax, heights[leftIndex]);
                trappedWater += leftMax - heights[leftIndex];
            } else {
                rightIndex--;
                rightMax = Integer.max(rightMax, heights[rightIndex]);
                trappedWater += rightMax - heights[rightIndex];
            }
        }
        return trappedWater;
    }

    public static void main(String[] args) {
        int[] heights = { 4, 2, 0, 6, 3, 2, 5 };

        System.out.println("Total rainwater trapped: " + trappedWater(heights));
    }
}
