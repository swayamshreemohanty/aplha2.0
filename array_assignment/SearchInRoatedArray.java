//Time complexity: log(n)

//Binary search method

public class SearchInRoatedArray {

    public static int searchIndex(int[] nums, int target) {
        int minimumElementIndex = findMinElementIndex(nums);

        if (target >= nums[minimumElementIndex] && target <= nums[nums.length - 1]) {
            // Find in Right sorted array
            return findElementInRange(nums, minimumElementIndex, nums.length - 1, target);
        } else {
            // Find in Left sorted array
            return findElementInRange(nums, 0, minimumElementIndex - 1, target);

        }
    }

    // Helper function
    public static int findElementInRange(int[] nums, int startIndex, int endIndex, int target) {
        int elementIndex = -1;
        int leftIndex = startIndex;
        int rightIndex = nums.length;

        while (leftIndex <= rightIndex) {
            int midIndex = leftIndex + ((rightIndex - leftIndex) / 2);

            if (nums[midIndex] == target) {
                return midIndex;
            } else if (nums[midIndex] > target) {
                rightIndex = midIndex - 1;
            } else {
                leftIndex = midIndex + 1;
            }
        }

        return elementIndex;

    }

    // Helper function
    public static int findMinElementIndex(int[] nums) {
        int leftIndex = 0;
        int rightIndex = nums.length - 1;

        while (leftIndex < rightIndex) {
            int midIndex = leftIndex + ((rightIndex - leftIndex) / 2);

            if (midIndex > 0 && nums[midIndex - 1] > nums[midIndex]) {
                return midIndex;
            } else if (nums[midIndex] > nums[leftIndex] && nums[midIndex] > nums[rightIndex]) {
                leftIndex = midIndex + 1;
            } else {
                rightIndex = midIndex - 1;
            }
        }

        return leftIndex;

    }

    public static void main(String[] args) {
        int[] nums = { 4, 5, 6, 7, 0, 1, 2 };

        System.out.println("Element Index is: " + searchIndex(nums, 0));
    }
}
