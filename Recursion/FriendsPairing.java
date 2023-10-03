class FriendsPairing {

    private static int findFriendsPair(int n, String path) {
        System.out.println("path: " + path);
        System.out.println("n: " + n);

        if (n == 1 || n == 2) {
            return n;
        }
        int fnm1 = findFriendsPair(n - 1, "n-1");
        System.out.println("fnm1: " + fnm1);

        int fnm2 = findFriendsPair(n - 2, "n-2");
        System.out.println("fnm2: " + fnm2);

        int pairChoices = (n - 1) * fnm2;
        System.out.println("pairChoices: " + pairChoices);

        System.out.println();
        return fnm1 + pairChoices;

    }

    public static void main(String[] args) {
        System.out.println(findFriendsPair(3,"main"));
    }
}