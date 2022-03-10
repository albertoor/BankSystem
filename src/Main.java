import Models.CheckingAccount;

public class Main {
    public static void main(String[] args) {
        CheckingAccount basicAccount = new CheckingAccount(1500);
        basicAccount.withdrawal(500);
        basicAccount.withdrawal(1100);
        System.out.println(basicAccount.getBalance());
    }
}
