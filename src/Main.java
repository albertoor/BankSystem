import Models.BasicAccount;
import Models.CheckingAccount;

public class Main {
    public static void main(String[] args) {
        BasicAccount basicAccount = new BasicAccount(1500);
        basicAccount.withdraw(500);
        basicAccount.withdraw(1100);
        System.out.println(basicAccount.getBalance());
    }
}
