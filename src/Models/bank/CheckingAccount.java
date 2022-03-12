package Models.bank;

public class CheckingAccount extends BankAccount {

    private double withdrawalFee;

    public CheckingAccount(double balance, String id, double withdrawalFee) {
        super(balance, id);
        this.withdrawalFee = withdrawalFee;
    }

    public double getWithdrawalFee() {
        return withdrawalFee;
    }

    public void setWithdrawalFee(double withdrawalFee) {
        this.withdrawalFee = withdrawalFee;
    }

    public void deposit(double amount){
        super.deposit(amount);
    }

    @Override
    public void withdrawal(double amount) {
        double totalAmount = amount + withdrawalFee;
        super.withdrawal(totalAmount);
    }

    @Override
    public void accountStatus() {
        System.out.println("\n===== ESTADO DE CUENTA =====");
        System.out.println("===== Cuenta de cheques =====");
        System.out.println("ID: " + id);
        System.out.println("Saldo: " + balance);
        System.out.println("Interes de retiro: " + withdrawalFee);
        System.out.println("============================\n");
    }

}
