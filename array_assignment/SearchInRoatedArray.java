//Time complexity: log(n)

//Binary search method

public class SearchInRoatedArray {
    public static int searchElementIndex(int[] nums, int target) {
        int minimumElementIndex = searchMinimumNumberIndex(nums);
        if (nums[minimumElementIndex] <= target && target < nums.length) {
            // Left side sorted array
            return searchElementIndexInRange(nums, minimumElementIndex, nums.length - 1, target);
        } else {
            // Right side sorted array
            return searchElementIndexInRange(nums, 0, minimumElementIndex, target);
        }

    }

    public static int searchElementIndexInRange(int[] nums, int startIndex, int endIndex, int target) {
        int leftIndex = startIndex;
        int rightIndex = endIndex;
        while (leftIndex <= rightIndex) {
            System.out.println(leftIndex);
            System.out.println(rightIndex);
            System.out.println();
            int midIndex = leftIndex + ((rightIndex - leftIndex) / 2);
            System.out.println(midIndex);
            System.out.println();
            if (nums[midIndex] == target) {
                return midIndex;
            } else if (target < nums[midIndex]) {
                rightIndex = midIndex - 1;
            } else {
                leftIndex = midIndex + 1;
            }
        }
        return -1;
    }

    public static int searchMinimumNumberIndex(int[] nums) {
        int leftIndex = 0;
        int rightIndex = nums.length - 1;
        while (leftIndex < rightIndex) {
            int midIndex = leftIndex + ((rightIndex - leftIndex) / 2);
            if (midIndex > 0 && (nums[midIndex - 1] > nums[midIndex])) {
                return midIndex;
            } else if (nums[leftIndex] <= nums[midIndex] && nums[rightIndex] < nums[midIndex]) {
                leftIndex = midIndex + 1;
            } else {
                rightIndex = midIndex - 1;
            }
        }
        return leftIndex;
    }

    public static void main(String[] args) {

        int[] nums = { 4, 5, 6, 7, 0, 1, 2 };

        System.out.println(searchElementIndex(nums, 0));
    }
}