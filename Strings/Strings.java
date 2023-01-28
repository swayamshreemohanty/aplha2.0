public class Strings {

    private static void StringBuilderTest(String str) {
        StringBuilder stringBuilder = new StringBuilder(str);
        for (char i = '1'; i <= 'z'; i++) {
            stringBuilder.append(i);
        }

        System.out.println(stringBuilder);
    }

    public static String FirstLetterToUpperCase(String str) {
        StringBuilder sb = new StringBuilder("");
        if (!str.isEmpty()) {
            sb.append(Character.toUpperCase(str.charAt(0)));
            for (int i = 1; i < str.length(); i++) {
                if (str.charAt(i) == ' ') {
                    sb.append(str.charAt(i));
                    i++;
                    if (str.charAt(i) == ' ' || Character.isUpperCase(str.charAt(i))) {
                        continue;
                    }
                    System.out.print("@@@@: " + str.charAt(i));
                    sb.append(Character.toUpperCase(str.charAt(i)));

                } else {
                    sb.append(str.charAt(i));
                }
            }
        }
        return sb.toString();
    }

    // public static String ReverseSentense(String str) {
    //     StringBuilder sentence = new StringBuilder("");
    //     if (!str.isEmpty()) {
    //         for (int i = 1; i < str.length(); i++) {
    //             if (str.charAt(i) == ' ') {
    //                 sentence.append(str.charAt(i));
    //                 i++;
    //                 if (str.charAt(i) == ' ' || Character.isUpperCase(str.charAt(i))) {
    //                     continue;
    //                 }
    //                 System.out.print("@@@@: " + str.charAt(i));
    //                 sb.append(Character.toUpperCase(str.charAt(i)));

    //             } else {
    //                 sb.append(str.charAt(i));
    //             }
    //         }
    //     }
    //     return sb.toString();
    // }

    public static void main(String[] args) {
        String fullName = "hii                 bro";
        // String fullName = "i am swayam";
        FirstLetterToUpperCase(fullName);
        // System.out.println(FirstLetterToUpperCase(fullName));

        // char ch = 'a';
        // System.out.println(Character.toUpperCase(ch));

        // StringBuilderTest(fullName);

        // System.out.println(fullName.charAt(0));
        // String[] fruits = { "banana", "mango", "apple" };
        // String largestString = fruits[0];
        // for (int i = 1; i < fruits.length; i++) {
        // // System.out.println(fruits[i].compareTo(largestString));
        // // System.out.println(largestString.compareTo(fruits[i]));
        // if (largestString.compareTo(fruits[i]) < 0) {
        // largestString = fruits[i];
        // }
        // }
        // System.out.println("Largest String: " + largestString);
    }
}
