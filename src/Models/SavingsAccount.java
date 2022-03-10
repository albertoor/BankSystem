package Models;

public class SavingsAccount extends BankAccount{
    private static final double INTEREST_RATE = 0.16;

    public SavingsAccount(double balance) {
        super(balance);
    }

    protected void addInterest(){
        double interest = getBalance() * INTEREST_RATE / 100;
        deposit(interest);
    }

    @Override
    public void accountStatus() {

    }
}
