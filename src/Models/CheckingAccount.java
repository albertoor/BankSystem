package Models;

public class CheckingAccount extends BankAccount {

    private double withdrawalFee;

    public CheckingAccount(double balance) {
        super(balance);
    }

    @Override
    public void withdrawal(double amount) {
        double totalAmount = amount + withdrawalFee;
        super.withdrawal(totalAmount);
    }

    @Override
    public void accountStatus() {

    }

}
