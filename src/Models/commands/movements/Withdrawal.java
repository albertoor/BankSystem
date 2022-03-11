package Models.commands.movements;

import Interfaces.WithdrawalCmd;
import Models.bank.CheckingAccount;
import Models.bank.InvestmentAccount;
import Models.bank.SavingsAccount;

public class Withdrawal implements WithdrawalCmd {

    @Override
    public void makeWithdrawalInvestment(InvestmentAccount investmentAccount) {
        System.out.println("Balance actual: " + investmentAccount.getBalance());
        System.out.print("Ingresa la cantidad a retirar: ");
        double amountToWithdraw = Double.parseDouble(System.console().readLine());
        investmentAccount.withdrawal(amountToWithdraw);
        System.out.println("Nuevo Balance: " + investmentAccount.getBalance());
    }

    @Override
    public void makeWithdrawalChecking(CheckingAccount checkingAccount) {
        System.out.println("Balance actual: " + checkingAccount.getBalance());
        System.out.print("Ingresa la cantidad a retirar: ");
        double amountToWithdraw = Double.parseDouble(System.console().readLine());
        checkingAccount.withdrawal(amountToWithdraw);
        System.out.println("Nuevo Balance: " + checkingAccount.getBalance());
    }

    @Override
    public void makeWithdrawalSaving(SavingsAccount savingsAccount) {
        System.out.println("Balance actual: " + savingsAccount.getBalance());
        System.out.print("Ingresa la cantidad a retirar: ");
        double amountToWithdraw = Double.parseDouble(System.console().readLine());
        savingsAccount.withdrawal(amountToWithdraw);
        System.out.println("Nuevo Balance: " + savingsAccount.getBalance());
    }
}
