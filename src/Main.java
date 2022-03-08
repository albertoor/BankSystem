import models.CheckingAccount;
import models.Customer;

public class Main {
    public static void main(String[] args) {

        CheckingAccount checkingAccount = new CheckingAccount(1000, 5.0);
        System.out.println("Balance inicial" + checkingAccount.getBalance());
        System.out.println("Retiro 500");
        checkingAccount.withdrawal(600.0);
        System.out.println("Retiro 500");
        checkingAccount.withdrawal(600.0);
        checkingAccount.accountStatus();

//        SystemTerminal systemTerminal = new SystemTerminal();
//        systemTerminal.startTerminal();
    }
}
