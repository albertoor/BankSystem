package Abstract;

public abstract class BankAccount {
    protected double balance;
    protected String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public BankAccount(double balance) {
        this.balance = balance;
    }
    public abstract void deposit(double amount);
}
