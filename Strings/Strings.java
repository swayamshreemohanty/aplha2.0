public class Strings {

    public static void main(String[] args) {
        // String fullName = "Hii bro";
        // System.out.println(fullName.charAt(0));

        String[] fruits = { "banana", "mango", "apple" };

        String largestString = fruits[0];
        for (int i = 1; i < fruits.length; i++) {

            // System.out.println(fruits[i].compareTo(largestString));
            // System.out.println(largestString.compareTo(fruits[i]));
            if (largestString.compareTo(fruits[i]) < 0) {
                largestString = fruits[i];
            }
        }
        System.out.println("Largest String: " + largestString);
    }
}
