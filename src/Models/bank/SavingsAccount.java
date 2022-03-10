package Models.bank;

public class SavingsAccount extends BankAccount{
    private static final double INTEREST_RATE = 0.16;

    public SavingsAccount(double balance, String id) {
        super(balance, id);
    }

    protected void addInterest(){
        double interest = getBalance() * INTEREST_RATE / 100;
        deposit(interest);
    }

    @Override
    public void accountStatus() {
        System.out.println("Estado de cuenta No. " + id);
        System.out.println("Balance: " + balance);
    }
}
