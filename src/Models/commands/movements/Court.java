package Models.commands.movements;

import Models.bank.CheckingAccount;
import Models.bank.InvestmentAccount;
import Models.bank.SavingsAccount;

public class Court {
    public void makeCourtChecking(CheckingAccount checkingAccount) {
        System.out.println("Balance actual: " + checkingAccount.getBalance());
        System.out.print("Ingresa la cantidad a depositar: ");
        double amountToDeposit = Double.parseDouble(System.console().readLine());
        checkingAccount.deposit(amountToDeposit);
        System.out.println("Nuevo Balance: " + checkingAccount.getBalance());
    }

    public void makeCourtSaving(SavingsAccount savingsAccount) {
        System.out.println("Balance actual: " + savingsAccount.getBalance());
        System.out.print("Ingresa la cantidad a depositar: ");
        double amountToDeposit = Double.parseDouble(System.console().readLine());
        savingsAccount.deposit(amountToDeposit);
        System.out.println("Nuevo Balance: " + savingsAccount.getBalance());
    }

    public void makeCourtInvestment(InvestmentAccount investmentAccount) {
        System.out.println("Balance actual: " + investmentAccount.getBalance());
        System.out.print("Ingresa la cantidad a depositar: ");
        double amountToDeposit = Double.parseDouble(System.console().readLine());
        investmentAccount.deposit(amountToDeposit);
        System.out.println("Nuevo Balance: " + investmentAccount.getBalance());
    }
}
