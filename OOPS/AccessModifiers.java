public class AccessModifiers {
    public static void main(String[] args) {
        BankAccount bankAccount = BankAccount();

    }

  
}

class BankAccount {
    public String username;
    private String password;

    public void setPassword(String pwd) {
        password = pwd;
    }
}
