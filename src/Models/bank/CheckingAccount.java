package Models.bank;

public class CheckingAccount extends BankAccount {

    private double withdrawalFee;

    public CheckingAccount(double balance, String id) {
        super(balance, id);
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
        System.out.println("Estado de Cuenta de Cheques No. " + id);
        System.out.println("Balance: " + balance);
    }

}
