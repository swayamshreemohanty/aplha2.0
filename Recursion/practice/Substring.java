public class Substring {

    public static int countSubString(String str, int i, int j, int n) {

        if (n == 1) {
            return 1;
        } else if (n <= 0) {
            return 0;
        }

        int res = countSubString(str, i + 1, j, n - 1) + countSubString(str, i, j - 1, n - 1)
                - countSubString(str, i + 1, j - 1, n - 2);

        System.out.println("Before Res: " + res + " ");

        if (str.charAt(i) == str.charAt(j)) {
            res++;
        }
        System.out.println("After Res: " + res + " ");
        return res;
    }

    public static void main(String[] args) {
        String str = "aba";
        int n = str.length();
        System.out.println(countSubString(str, 0, n - 1, n));

    }
}
