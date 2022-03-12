package Models.commands.movements;

import Models.bank.CheckingAccount;
import Models.bank.CreditCardAccount;
import Models.bank.InvestmentAccount;
import Models.bank.SavingsAccount;
import Utils.ReadInput;

public class Withdrawal {

    private ReadInput readInput = new ReadInput();

    private static final String MSG_DEFAULT = "Ingresa la cantidad a retirar: ";

    public void makeWithdrawalInvestment(InvestmentAccount investmentAccount) {
        System.out.println("Balance actual: " + investmentAccount.getBalance());
        double amountToWithdraw = readInput.readDouble(MSG_DEFAULT);
        investmentAccount.withdrawal(amountToWithdraw);
        System.out.println("Nuevo Balance: " + investmentAccount.getBalance());
    }

    public void makeWithdrawalChecking(CheckingAccount checkingAccount) {
        System.out.println("Balance actual: " + checkingAccount.getBalance());
        double amountToWithdraw = readInput.readDouble(MSG_DEFAULT);
        checkingAccount.withdrawal(amountToWithdraw);
        System.out.println("Nuevo Balance: " + checkingAccount.getBalance());
    }

    public void makeWithdrawalSaving(SavingsAccount savingsAccount) {
        System.out.println("Balance actual: " + savingsAccount.getBalance());
        double amountToWithdraw = readInput.readDouble(MSG_DEFAULT);
        savingsAccount.withdrawal(amountToWithdraw);
        System.out.println("Nuevo Balance: " + savingsAccount.getBalance());
    }

}
