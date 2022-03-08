import models.CheckingAccount;
import models.Customer;
import models.InvestmentAccount;

public class Main {
    public static void main(String[] args) {

        InvestmentAccount investmentAccount = new InvestmentAccount(2000.0, 0.05);
        System.out.println("Balance inicial: " + investmentAccount.getBalance());
        System.out.println("Retiro: 600");
        investmentAccount.withdrawal(600.0);
        System.out.println("Nuevo balance: " + investmentAccount.getBalance());
        System.out.println("Retiro: 600");
        investmentAccount.withdrawal(600.0);
        System.out.println("Nuevo balance:" + investmentAccount.getBalance());
        System.out.println("Aplicando corte...");
        investmentAccount.applyInterestRate();
        System.out.println("Nuevo balance:" + investmentAccount.getBalance());
        investmentAccount.accountStatus();

//        SystemTerminal systemTerminal = new SystemTerminal();
//        systemTerminal.startTerminal();
    }
}
