package Models.bank;

public class InvestmentAccount extends BankAccount{
    private double interestToCourt;
    private double tax = 0.16;

    public InvestmentAccount(double balance, String id, double interestToCourt) {
        super(balance, id);
        this.interestToCourt = interestToCourt;
    }

    public double getInterestToCourt() {
        return interestToCourt;
    }

    public double getTax() {
        return tax;
    }

    public void deposit(double amount){
        super.deposit(amount);
    }

    public void withdrawal(double amount) {
        super.withdrawal(amount);
    }

    public void applyCut() {
        double grossInterest = getBalance() * interestToCourt;
        double netInterest = grossInterest - (grossInterest * getTax());
        deposit(netInterest);
    }

    @Override
    public void accountStatus() {
        System.out.println("Estado de Cuenta de Inversion No. " + id);
        System.out.println("Balance: " + balance);
    }

}
