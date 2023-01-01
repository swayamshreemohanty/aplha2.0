package array_assignment;

public class FindDuplicate {

    public static boolean findDuplicateNumber(int[] array) {
        // Outer loop
        for (int i = 0; i < array.length; i++) {
            // Inner loop
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    return true;
                }
            }
        }
        return false;
    }
    //TODO:Here we also use the HashSet, soon that will added

    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 1 };
        System.out.println(findDuplicateNumber(array));
    }
}
