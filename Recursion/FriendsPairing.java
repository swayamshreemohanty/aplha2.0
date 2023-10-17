class FriendsPairing {

    private static int findFriendsPair(int n, String path) {
        System.out.println();
        System.out.println("path: " + path);

        System.out.println("n: " + n);

        if (n == 1 || n == 2) {
            return n;
        }

        // Single way
        int fnm1 = findFriendsPair(n - 1, "n-1");
        System.out.println();
        System.out.println("fnm1: " + fnm1);

        // -----------------------------
        // Pair way
        int fnm2 = findFriendsPair(n - 2, "n-2");
        System.out.println();
        System.out.println("fnm2: " + fnm2);

        // total pair ways
        int pairChoices = (n - 1) * fnm2;
        System.out.println("pairChoices: " + pairChoices);
        // -----------------------------

        int totalWays = fnm1 + pairChoices;
        System.out.println("totalWays: " + totalWays);

        System.out.println("--------------");
        System.out.println("---------------");
        System.out.println("---------------");

        return totalWays;
    }

    public static void main(String[] args) {
        System.out.println(findFriendsPair(6, "main"));
    }
}