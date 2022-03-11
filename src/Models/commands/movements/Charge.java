package Models.commands.movements;

import Interfaces.ChargeCmd;
import Models.bank.CheckingAccount;
import Models.bank.InvestmentAccount;
import Models.bank.SavingsAccount;

public class Charge implements ChargeCmd {
    @Override
    public void makeChargeSaving(SavingsAccount savingsAccount) {
        System.out.println("Balance actual: " + savingsAccount.getBalance());
        System.out.print("Motivo de cargo: ");
        String reason = System.console().readLine();
        System.out.print("Ingresa la cantidad a retirar: ");
        double amountToWithdraw = Double.parseDouble(System.console().readLine());
        savingsAccount.withdrawal(amountToWithdraw);
        System.out.println("Cargo de " + amountToWithdraw + " por " + reason);
        System.out.println("Nuevo Balance: " + savingsAccount.getBalance());
    }

    @Override
    public void makeChargeInvestment(InvestmentAccount investmentAccount) {
        System.out.println("Balance actual: " + investmentAccount.getBalance());
        System.out.print("Motivo de cargo: ");
        String reason = System.console().readLine();
        System.out.print("Ingresa la cantidad a retirar: ");
        double amountToWithdraw = Double.parseDouble(System.console().readLine());
        investmentAccount.withdrawal(amountToWithdraw);
        System.out.println("Cargo de " + amountToWithdraw + " por " + reason);
        System.out.println("Nuevo Balance: " + investmentAccount.getBalance());
    }

    @Override
    public void makeChargeChecking(CheckingAccount checkingAccount) {
        System.out.println("Balance actual: " + checkingAccount.getBalance());
        System.out.print("Motivo de cargo: ");
        String reason = System.console().readLine();
        System.out.print("Ingresa la cantidad a retirar: ");
        double amountToWithdraw = Double.parseDouble(System.console().readLine());
        checkingAccount.withdrawal(amountToWithdraw);
        System.out.println("Cargo de " + amountToWithdraw + " por " + reason);
        System.out.println("Nuevo Balance: " + checkingAccount.getBalance());
    }
}
