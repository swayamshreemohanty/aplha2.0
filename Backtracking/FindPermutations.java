public class FindPermutations {

    public static void findPermutations(String str, String answer) {

        // Base case
        if (str.length() == 0) {
            System.out.println(answer);
            return;
        }

        // Recursion:
        for (int i = 0; i < str.length(); i++) {

            // extract the char
            char currentChar = str.charAt(i);

            // update the string
            String newStr = str.substring(0, i) + str.substring(i + 1);

            // recursion
            findPermutations(newStr, answer + currentChar);
        }

    }

    public static void main(String[] args) {
        String str = "abc";
        findPermutations(str, "");
    }

}
