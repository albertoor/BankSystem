package Models.bank;

public class CreditCardAccount extends BankAccount{

    private double lineOfCredit;
    private double maxLineCredit;

    public CreditCardAccount(double balance, String id, double lineOfCredit, double maxLineCredit) {
        super(balance, id);
        this.lineOfCredit = lineOfCredit;
        this.maxLineCredit = maxLineCredit;
    }

    public double getMaxLineCredit() {
        return maxLineCredit;
    }

    public void setMaxLineCredit(double maxLineCredit) {
        this.maxLineCredit = maxLineCredit;
    }

    public double getLineOfCredit() {
        return lineOfCredit;
    }

    public void setLineOfCredit(double lineOfCredit) {
        this.lineOfCredit = lineOfCredit;
    }

    // Pay credit card
    public void deposit(double amount){
        super.deposit(amount);
    }

    public void withdrawal(double amount) {
        if (balance - amount < lineOfCredit * -1)
            System.out.println("Linea de credito insuficiente");
        else
            super.withdrawal(amount);
    }

    @Override
    public void accountStatus() {
        System.out.println("\n===== ESTADO DE CUENTA =====");
        System.out.println("===== Tarjeta de Credito =====");
        System.out.println("ID: " + id);
        System.out.println("Saldo: " + balance);
        System.out.println("Linea de crédito: " + lineOfCredit);
        System.out.println("============================\n");
    }

}
