public class TrappingRainwater {

    private static void findWaterTrapBruteForce(int[] heights) {
        int totalWaterTrappedSum = 0;

        for (int barIndex = 0; barIndex < heights.length; barIndex++) {
            int leftMaxHeight = Integer.MIN_VALUE;
            int rightMaxHeight = Integer.MIN_VALUE;
            // Find left side max height
            // 1
            if (barIndex == 0) { // Extact at 1st index
                leftMaxHeight = heights[barIndex];
            } else {
                // 2
                for (int leftIndex = barIndex - 1; leftIndex >= 0; leftIndex--) {
                    if (heights[leftIndex] > leftMaxHeight) {
                        leftMaxHeight = heights[leftIndex];
                    }
                }
            }

            // Find right side max height
            // 1
            if (barIndex == heights.length - 1) {// Extact at last index
                rightMaxHeight = heights[barIndex];
            } else {
                // 2
                for (int rightIndex = barIndex + 1; rightIndex < heights.length; rightIndex++) {
                    if (heights[rightIndex] > rightMaxHeight) {
                        rightMaxHeight = heights[rightIndex];
                    }
                }
            }

            // ***Count water trap***
            // Trapped Water = (Water_level - Bar_height) * Bar_width
            // Between two height water level always maintain on the min height
            // Min height:
            System.out.println("Bar count: " + (barIndex + 1));
            System.out.println("Bar value: " + heights[barIndex]);
            System.out.println("Left Max: " + leftMaxHeight);
            System.out.println("Right Max: " + rightMaxHeight);

            int waterLevel = Integer.min(leftMaxHeight, rightMaxHeight);
            // System.out.print(waterLevel + " ");

            int waterTrapped = (waterLevel - heights[barIndex]) * 1;
            if (waterTrapped < 0) {
                waterTrapped = 0;
            }
            System.out.println("waterTrapped: " + waterTrapped);
            totalWaterTrappedSum += waterTrapped;

            // new line
            System.out.println();
        }

        System.out.println("Total waterTrapped: " + totalWaterTrappedSum);

    }

    private static int trappingRainWater(int[] heights) {
        int heightArrayLength = heights.length;
        // 1 // Calculate the left max boundary for every boundary//

        // define the left max boundaries holding array:
        int[] leftMaxBoundaries = new int[heightArrayLength];

        // Our 1st bar should the left max boundary
        leftMaxBoundaries[0] = heights[0];

        // Calculate the left max boudnaries from the 2nd place of the heights array
        for (int boundaryIndex = 1; boundaryIndex < heightArrayLength; boundaryIndex++) {
            leftMaxBoundaries[boundaryIndex] = Math.max(leftMaxBoundaries[boundaryIndex - 1], heights[boundaryIndex]);
        }

        // 2 // Calculate the right max boundary for every boundary//
        // define the right max boundaries holding array:
        int[] rightMaxBoundaries = new int[heightArrayLength];

        // Our last bar should the right max boundary
        rightMaxBoundaries[heightArrayLength - 1] = heights[heightArrayLength - 1];

        // Calculate the left right boudnaries from the last 2nd place of the heights
        for (int boundaryIndex = heightArrayLength - 2; boundaryIndex >= 0; boundaryIndex--) {
            rightMaxBoundaries[boundaryIndex] = Math.max(rightMaxBoundaries[boundaryIndex + 1], heights[boundaryIndex]);
        }

        // 3//Calculate the trapping rain water
        int totalTrappedRainWaters = 0;

        for (int boundaryIndex = 0; boundaryIndex < rightMaxBoundaries.length; boundaryIndex++) {
            // Take the min height from the left and right max bars as water level
            int waterLevel = Math.min(leftMaxBoundaries[boundaryIndex], rightMaxBoundaries[boundaryIndex]);

            // calculate trapped water
            // Trapped Water = (Water_level - Bar_height) * Bar_width
            totalTrappedRainWaters += ((waterLevel - heights[boundaryIndex]) * 1);
        }

        return totalTrappedRainWaters;
    }

    public static void main(String[] args) {
        int[] heights = { 4, 2, 0, 6, 3, 2, 5 };

        System.out.println("Total water will trap: " + trappingRainWater(heights));
    }
}
