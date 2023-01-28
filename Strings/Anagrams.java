import java.util.Arrays;

public class Anagrams {

    public static boolean isAnagrams(String str1, String str2) {
        if (str1.length() == str2.length()) {

            // convert both strings to lowercase
            str1 = str1.toLowerCase();
            str2 = str2.toLowerCase();

            // convert to char Array for sorting purpose
            char[] strArray1 = str1.toCharArray();
            char[] strArray2 = str2.toCharArray();

            // sort both the array
            Arrays.sort(strArray1);
            Arrays.sort(strArray2);

            return Arrays.equals(strArray1, strArray2);
        }
        return false;
    }

    public static void main(String[] args) {
        String str1 = "Race";
        String str2 = "care";

        if (isAnagrams(str1, str2)) {
            System.out.println("Both strings are anagrams");
        } else {
            System.out.println("Both strings are not anagrams");

        }
    }
}
