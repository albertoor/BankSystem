import Models.CheckingAccount;
import Models.InvestmentAccount;

public class Main {
    public static void main(String[] args) {
        InvestmentAccount investmentAccount = new InvestmentAccount(2000.0, 0.05);
        investmentAccount.withdrawal(600.0);
        investmentAccount.withdrawal(600.0);
        investmentAccount.applyCut();
        System.out.println(investmentAccount.getBalance());
    }
}
