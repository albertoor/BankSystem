package Models.bank;

public class CheckingAccount extends BankAccount {

    private double withdrawalFee;

    public CheckingAccount(double balance, String id) {
        super(balance, id);
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
