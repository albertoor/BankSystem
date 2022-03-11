package Models.commands.subcommands;

import Models.bank.BankAccount;
import Models.bank.SavingsAccount;
import Services.ProductManagerService;

public class MovementsAccountsCmds {

    private ProductManagerService productManagerService;

    public MovementsAccountsCmds(ProductManagerService productManagerService) {
        this.productManagerService = productManagerService;
    }

    // deposito (deposito a mi tarjeta, como deposito en efectivo)
    public void makeDeposit(BankAccount bankAccount){}

    // retiro
    public void makeWithdrawal(BankAccount bankAccount) {
        String bankAccountId = System.console().readLine();
//        productManagerService.findBankAccountById(bankAccountId);
    }

    // corte
    public void makeCut(BankAccount bankAccount) {}

    // cargo
    public void makeChare(BankAccount bankAccount){}
}
