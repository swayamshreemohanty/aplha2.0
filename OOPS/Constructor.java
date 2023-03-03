
public class Constructor {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.arr[0]=10;
        bankAccount.arr[1]=20;

        System.out.println(bankAccount.arr);
    }

}

class BankAccount {
    int[] arr;

    BankAccount() {
        arr = new int[3];
    }
    // public String username;
    // private String password;

    // BankAccount(int a) {

    // }

    // BankAccount(int a, int b) {

    // }
    // public void setPassword(String pwd) {
    // password = pwd;
    // }
}
