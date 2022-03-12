package Models.commands.movements;

import Models.bank.CheckingAccount;
import Models.bank.InvestmentAccount;
import Models.bank.SavingsAccount;
import Utils.ReadInput;

public class Deposit  {

    private ReadInput readInput = new ReadInput();
    private static final String MSG_DEFAULT = "Ingresa la cantidad a depositar";

    public void makeDepositChecking(CheckingAccount checkingAccount) {
        System.out.println("Balance actual: " + checkingAccount.getBalance());
        double amountToDeposit = readInput.readDouble(MSG_DEFAULT);
        checkingAccount.deposit(amountToDeposit);
        System.out.println("Nuevo Balance: " + checkingAccount.getBalance());
    }

    public void makeDepositSaving(SavingsAccount savingsAccount) {
        System.out.println("Balance actual: " + savingsAccount.getBalance());
        double amountToDeposit = readInput.readDouble(MSG_DEFAULT);
        savingsAccount.deposit(amountToDeposit);
        System.out.println("Nuevo Balance: " + savingsAccount.getBalance());
    }

    public void makeDepositInvestment(InvestmentAccount investmentAccount) {
        System.out.println("Balance actual: " + investmentAccount.getBalance());
        double amountToDeposit = readInput.readDouble(MSG_DEFAULT);
        investmentAccount.deposit(amountToDeposit);
        System.out.println("Nuevo Balance: " + investmentAccount.getBalance());
    }
}
