package Models.commands.subcommands;

import Models.bank.BankAccount;
import Models.bank.CheckingAccount;
import Models.bank.InvestmentAccount;
import Models.bank.SavingsAccount;
import Services.ProductManagerService;

public class MovementsAccountsCmds {

    private ProductManagerService productManagerService;
    private Withdrawal withdrawal;

    public MovementsAccountsCmds(ProductManagerService productManagerService) {
        this.productManagerService = productManagerService;
        withdrawal = new Withdrawal();
    }

    public void withdrawal(BankAccount bankAccount) {
        if(bankAccount instanceof InvestmentAccount)
            withdrawal.makeWithdrawalInvestment((InvestmentAccount) bankAccount);
        else if (bankAccount instanceof SavingsAccount)
            withdrawal.makeWithdrawalSaving((SavingsAccount) bankAccount);
        else if (bankAccount instanceof CheckingAccount)
            withdrawal.makeWithdrawalChecking((CheckingAccount) bankAccount);
    }
}
