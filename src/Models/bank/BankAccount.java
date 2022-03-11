package Models.bank;

public abstract class BankAccount {
    protected double balance;
    protected String id;

    public BankAccount(double balance, String id) {
        this.balance = balance;
        this.id = id;
    }

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

    protected void withdrawal(double amount) {
        if (amount > balance)
            System.out.println("Fondos insuficientes");
        else
            balance -= amount;
    }

    protected void deposit(double amount){
        if (amount < 0) {
            throw new IllegalArgumentException();
        }
        balance += amount;
    }

    public abstract void accountStatus();

}
