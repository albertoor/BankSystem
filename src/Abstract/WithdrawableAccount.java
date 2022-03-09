package Abstract;

public abstract class WithdrawableAccount extends BankAccount{

    public WithdrawableAccount(double balance) {
        super(balance);
    }

    public abstract void withdraw(double amount);
}
