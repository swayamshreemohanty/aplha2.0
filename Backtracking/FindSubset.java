public class FindSubset {

    public static void findSubset(String str, String answer, int index) {

        // Base case
        if (index == str.length()) {
            if (answer.length() == 0) {
                System.out.println("null");
            } else {
                System.out.println(answer);
            }
            return;
        }

        // Recursion:

        // 1.Yes condition
        findSubset(str, answer + str.charAt(index), index + 1);

        // 2.No condition
        findSubset(str, answer, index + 1);
    }

    public static void main(String[] args) {
        String str = "abc";
        findSubset(str, "", 0);
    }

}
