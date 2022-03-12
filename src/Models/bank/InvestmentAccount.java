package Models.bank;

public class InvestmentAccount extends BankAccount{
    private double interestCommission;
    private double tax;

    public InvestmentAccount(double balance, String id, double interestCommission) {
        super(balance, id);
        this.interestCommission = interestCommission;
    }

    public double getTax() {
        return tax;
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
        double grossInterest = getBalance() * getTax();
        double netInterest = grossInterest - (grossInterest * getInterestCommission());
        deposit(netInterest);
    }

    @Override
    public void accountStatus() {
        System.out.println("\n===== ESTADO DE CUENTA =====");
        System.out.println("===== Cuenta de inversion =====");
        System.out.println("ID: " + id);
        System.out.println("Saldo: " + balance);
        System.out.println("Impuesto: " + getTax());
        System.out.println("Tasa interes por comision: " + interestCommission);
        System.out.println("============================\n");
    }

}
