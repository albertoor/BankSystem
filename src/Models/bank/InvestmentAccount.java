package Models.bank;

public class InvestmentAccount extends BankAccount{
    private double interestCommission;
    private double interestToCourt;

    public InvestmentAccount(double balance, String id, double interestToCourt, double interestCommission) {
        super(balance, id);
        this.interestToCourt = interestToCourt;
        this.interestCommission = interestCommission;
    }

    public double getInterestToCourt() {
        return interestToCourt;
    }

    public void setInterestToCourt(double interestToCourt) {
        this.interestToCourt = interestToCourt;
    }

    public double getInterestCommission() {
        return interestCommission;
    }

    public void setInterestCommission(double interestCommision) {
        this.interestCommission = interestCommision;
    }

    public void deposit(double amount){
        super.deposit(amount );
    }

    public void withdrawal(double amount) {
        super.withdrawal(amount);
    }

    public void applyCut() {
        double grossInterest = getBalance() * getInterestToCourt();
        double netInterest = grossInterest - (grossInterest * getInterestCommission());
        deposit(netInterest);
    }

    @Override
    public void accountStatus() {
        System.out.println("Estado de Cuenta de Inversion No. " + id);
        System.out.println("Balance: " + balance);
    }

}
