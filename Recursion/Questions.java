public class Questions {
    static int factorial(int num) {
        if (num == 0) {
            return 1;
        }
        return num * (factorial(num - 1));
    }

    static int sumOfN(int num) {
        if (num == 1) {
            return 1;
        }
        return num + (sumOfN(num - 1));
    }

    static int fibonacci(int num, String from) {
        System.out.print(num + from + " ");
        if (num == 0 || num == 1) {
            return num;
        }
        return fibonacci(num - 1, "M1") + fibonacci(num - 2, "M2");
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(5, ""));
    }
}
