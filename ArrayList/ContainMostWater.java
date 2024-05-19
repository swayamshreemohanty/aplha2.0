import java.util.ArrayList;

public class ContainMostWater {

    public static int storeWater(ArrayList<Integer> heights) {
        int maxWaterVolume = Integer.MIN_VALUE;

        int startPointIndex = 0;
        int endPointIndex = heights.size() - 1;

        while (startPointIndex < endPointIndex) {
            final int startPointHeight = heights.get(startPointIndex);
            final int endPointHeight = heights.get(endPointIndex);

            final int widthOfIndex = endPointIndex - startPointIndex;

            final int minHeight = Math.min(startPointHeight, endPointHeight);

            final int waterVolume = minHeight * widthOfIndex;

            maxWaterVolume = Math.max(maxWaterVolume, waterVolume);

            System.out.println();
 
            System.out.println("Current volume for " + "startPointIndex: " + startPointIndex + " and "
                    + "endPointIndex: " + endPointIndex + " and " + "startPointHeight: " + startPointHeight + " and "
                    + "endPointHeight: " + endPointHeight + " and " + "widthOfIndex: " + widthOfIndex + " and "
                    + "minHeight: " + minHeight + " and " + "waterVolume: " + waterVolume);

            System.out.println();

            // update pointer
            if (startPointHeight < endPointHeight) {
                startPointIndex++;
            } else {
                endPointIndex--;
            }
        }

        return maxWaterVolume;
    }

    public static void main(String[] args) {
        ArrayList<Integer> heights = new ArrayList<>();

        heights.add(1);
        heights.add(8);
        heights.add(6);
        heights.add(2);
        heights.add(5);
        heights.add(4);
        heights.add(8);
        heights.add(3);
        heights.add(7);

        System.out.println("Max Stored water: " + storeWater(heights));
    }
}
