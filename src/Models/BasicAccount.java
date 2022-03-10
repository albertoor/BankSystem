package Models;

import Abstract.BankAccount;
import Abstract.WithdrawableAccount;

public class BasicAccount extends WithdrawableAccount {

    public BasicAccount(double balance) {
        super(balance);
    }

    @Override
    public void deposit(double amount) {
        setBalance(balance += amount);
    }

    @Override
    public void withdraw(double amount) {
        if (amount > getBalance())
            System.out.println("Fondos Insuficientes");
        else
            balance -= amount;
    }
}
