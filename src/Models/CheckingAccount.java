package Models;

import Abstract.WithdrawableAccount;

public class CheckingAccount extends WithdrawableAccount {

    private double withdrawalFee;

    public CheckingAccount(double balance, double withdrawalFee) {
        super(balance);
        this.withdrawalFee = withdrawalFee;
    }

    @Override
    public void deposit(double amount) {}

    @Override
    public void withdraw(double amount) {
        double totalAmount = amount + withdrawalFee;
        super.withdraw(totalAmount);
    }
}
