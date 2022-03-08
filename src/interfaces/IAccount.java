package interfaces;

public interface IAccount {
    void deposit(double amount);
    void withdrawal(double amount);
    void updateBalance(double newBalance);
    void accountStatus();
}
