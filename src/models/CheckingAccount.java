package models;

import interfaces.IAccount;

public class CheckingAccount extends Account {

    private double withdrawalCommission;

    public CheckingAccount(double balance, double withdrawalCommission) {
        super(balance);
        this.withdrawalCommission = withdrawalCommission;
    }

    public double getWithdrawalCommission() {
        return withdrawalCommission;
    }

    @Override
    public void deposit(double amount) {
    }

    @Override
    public void withdrawal(double amount) {
        double totalAmount = amount + withdrawalCommission;
        super.withdrawal(totalAmount);
    }

    @Override
    public void accountStatus() {
        System.out.println("Estado de cuenta - Cuenta de cheques");
        System.out.println("Balance actual: " + getBalance());
        System.out.println("Comision de retiro: " + getWithdrawalCommission());
    }
}
