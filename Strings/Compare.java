public class Compare {
    public static void main(String[] args) {
        String s1 = "tony";
        String s2 = "tony";
        String s3 = new String("tony");

        System.out.println("Checking: " + s1.equals(s2));

        // Wrong format
        // System.out.println("Checking: " + (s1 == s3));
    }
}
