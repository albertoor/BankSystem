package Models.bank;

public class SavingsAccount extends BankAccount{
    private static final double INTEREST_RATE = 0.16;

    public SavingsAccount(double balance, String id) {
        super(balance, id);
    }

    public void withdrawal(double amount) {
        super.withdrawal(amount);
    }

    public void deposit(double amount){
        double interest = amount * INTEREST_RATE / 100;
        super.deposit(amount - interest);
    }


    @Override
    public void accountStatus() {
        System.out.println("\n===== ESTADO DE CUENTA =====");
        System.out.println("===== Cuenta de ahorro =====");
        System.out.println("ID: " + id);
        System.out.println("Saldo: " + balance);
        System.out.println("Tasa interes por deposito: " + INTEREST_RATE);
        System.out.println("============================\n");
    }
}
