public class Palindrome {

    public static boolean isPalindrome(String str) {
        int strLength = str.length();
        for (int i = 0; i < (strLength / 2); i++) {
            if (str.charAt(i) != str.charAt(strLength - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "racecar";
        System.out.println(isPalindrome(str));
    }
}
