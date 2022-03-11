package Models.bank;

public class SavingsAccount extends BankAccount{
    private static final double INTEREST_RATE = 0.16;

    public SavingsAccount(double balance, String id) {
        super(balance, id);
    }

    public void withdrawal(double amount) {
        super.withdrawal(amount);
    }

    protected void addInterest(){
        double interest = getBalance() * INTEREST_RATE / 100;
        deposit(interest);
    }

    @Override
    public void accountStatus() {
        System.out.println("Estado de Cuenta de Ahorro No. " + id);
        System.out.println("Balance: " + balance);
    }
}
