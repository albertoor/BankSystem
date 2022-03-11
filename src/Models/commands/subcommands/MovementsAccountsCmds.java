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
    public void makeDeposit(){}

    // retiro
    public void makeWithdrawal() {
        String bankAccountId = System.console().readLine();
//        productManagerService.findBankAccountById(bankAccountId);
    }

    // corte
    public void makeCut() {}

    // cargo
    public void makeChare(){}
}
