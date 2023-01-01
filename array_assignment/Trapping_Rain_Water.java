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
    public static int trap(int[] height) {
        int n = height.length;
        int res = 0, l = 0, r = n - 1;
        int rMax = height[r], lMax = height[l];
        while (l < r) {
            if (lMax < rMax) {
                l++;
                lMax = Math.max(lMax, height[l]);
                System.out.print("!" + (lMax - height[l]) + " ");
                res += lMax - height[l];
            } else {
                r--;
                rMax = Math.max(rMax, height[r]);
                System.out.print("#" + (rMax - height[r]) + " ");

                res += rMax - height[r];
            }
        }
        System.out.println();
        return res;
    }

    public static void main(String[] args) {
        int[] heights = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };

        System.out.println("Total rainwater trapped: " + trap(heights));
    }
}
