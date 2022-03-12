package Models.commands.movements;

import Models.bank.CheckingAccount;
import Models.bank.InvestmentAccount;
import Models.bank.SavingsAccount;
import Utils.ReadInput;

public class Charge {

    private ReadInput readInput = new ReadInput();
    private static final String MSG_DEFAULT = "Ingresa la cantidad a retiar por cargo";
    private static final String MSG_REASON = "Motivo de pago: ";

    public void makeChargeSaving(SavingsAccount savingsAccount) {
        System.out.println("Balance actual: " + savingsAccount.getBalance());
        String reason = readInput.readString(MSG_REASON);
        double amountToWithdrawCharge = readInput.readDouble(MSG_DEFAULT);
        savingsAccount.withdrawal(amountToWithdrawCharge);
        System.out.println("Cargo de " + amountToWithdrawCharge + " por " + reason);
        System.out.println("Nuevo Balance: " + savingsAccount.getBalance());
    }

    public void makeChargeInvestment(InvestmentAccount investmentAccount) {
        System.out.println("Balance actual: " + investmentAccount.getBalance());
        String reason = readInput.readString(MSG_REASON);
        double amountToWithdrawCharge = readInput.readDouble(MSG_DEFAULT);
        investmentAccount.withdrawal(amountToWithdrawCharge);
        System.out.println("Cargo de " + amountToWithdrawCharge + " por " + reason);
        System.out.println("Nuevo Balance: " + investmentAccount.getBalance());
    }

    public void makeChargeChecking(CheckingAccount checkingAccount) {
        System.out.println("Balance actual: " + checkingAccount.getBalance());
        String reason = readInput.readString(MSG_REASON);
        double amountToWithdrawCharge = readInput.readDouble(MSG_DEFAULT);
        checkingAccount.withdrawal(amountToWithdrawCharge);
        System.out.println("Cargo de " + amountToWithdrawCharge + " por " + reason);
        System.out.println("Nuevo Balance: " + checkingAccount.getBalance());
    }
}
