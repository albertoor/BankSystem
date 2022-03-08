package models;

import interfaces.IAccount;

public class InvestmentAccount extends Account {

    private double interestRate;
    private  double tax = 0.16;

    public InvestmentAccount(double balance, double interestRate) {
        super(balance);
        this.interestRate = interestRate;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void applyInterestRate() {
        double grossInterest = getBalance() * interestRate;
        double netInterest = grossInterest - (grossInterest * getTax());
        deposit(netInterest);
    }

    @Override
    public void accountStatus() {
        System.out.println("Estado de cuenta - Cuenta de inversion");
        System.out.println("Balance actual: " + getBalance());
        System.out.println("Tasa de Interés: " + getInterestRate());
    }
}
