import models.CheckingAccount;
import models.Customer;

public class Main {
    public static void main(String[] args) {

        CheckingAccount checkingAccount = new CheckingAccount(15000, 5.0);
        checkingAccount.accountStatus();
//        SystemTerminal systemTerminal = new SystemTerminal();
//        systemTerminal.startTerminal();
    }
}
