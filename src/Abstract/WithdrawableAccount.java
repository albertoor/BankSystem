package Abstract;

public abstract class WithdrawableAccount extends BankAccount{
    public WithdrawableAccount(double balance) {
        super(balance);
    }

    protected void withdraw(double amount){
        if (amount > balance)
            System.out.println("Fondo insuficientes");
        else
            balance -= amount;
    }
}
