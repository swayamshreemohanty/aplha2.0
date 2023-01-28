public class Compress {

    public static String compressString(String str) {
        StringBuilder newString = new StringBuilder("");
        for (int i = 0; i < str.length(); i++) {
            Integer count = 1;

            // Check for the continuos repeatation
            while (i < str.length() - 1 && (str.charAt(i) == str.charAt(i + 1))) {
                count++;
                i++;
            }

            // If repeatation completed assign the repeated element
            newString.append(str.charAt(i));
            if (count > 1) {
                newString.append(count.toString());
            }
        }

        return newString.toString();
    }

    public static void main(String[] args) {
        String string = "abcd";
        System.out.println(compressString(string));
    }
}
