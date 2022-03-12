package Models.commands.subcommands;

import Models.bank.BankAccount;
import Models.bank.CheckingAccount;
import Models.bank.InvestmentAccount;
import Models.bank.SavingsAccount;
import Models.commands.movements.Charge;
import Models.commands.movements.Court;
import Models.commands.movements.Deposit;
import Models.commands.movements.Withdrawal;
import Services.ProductManagerService;

public class MovementsAccountsCmds {

    private ProductManagerService productManagerService;
    private Withdrawal withdrawal;
    private Deposit deposit;
    private Charge charge;
    private Court court;

    public MovementsAccountsCmds(ProductManagerService productManagerService) {
        this.productManagerService = productManagerService;
        withdrawal = new Withdrawal();
        deposit = new Deposit();
        charge = new Charge();
        court = new Court();
    }

    public void withdrawal(BankAccount bankAccount) {
        if(bankAccount instanceof InvestmentAccount)
            withdrawal.makeWithdrawalInvestment((InvestmentAccount) bankAccount);
        else if (bankAccount instanceof SavingsAccount)
            withdrawal.makeWithdrawalSaving((SavingsAccount) bankAccount);
        else if (bankAccount instanceof CheckingAccount)
            withdrawal.makeWithdrawalChecking((CheckingAccount) bankAccount);
    }

    public void deposit(BankAccount bankAccount) {
        if(bankAccount instanceof InvestmentAccount)
            deposit.makeDepositInvestment((InvestmentAccount) bankAccount);
        else if (bankAccount instanceof SavingsAccount)
            deposit.makeDepositSaving((SavingsAccount) bankAccount);
        else if (bankAccount instanceof CheckingAccount)
            deposit.makeDepositChecking((CheckingAccount) bankAccount);
    }

    public void charge(BankAccount bankAccount) {
        if(bankAccount instanceof InvestmentAccount)
            charge.makeChargeInvestment((InvestmentAccount) bankAccount);
        else if (bankAccount instanceof SavingsAccount)
            charge.makeChargeSaving((SavingsAccount) bankAccount);
        else if (bankAccount instanceof CheckingAccount)
            charge.makeChargeChecking((CheckingAccount) bankAccount);
    }

    public void court(BankAccount bankAccount) {
        if(bankAccount instanceof InvestmentAccount)
            charge.makeChargeInvestment((InvestmentAccount) bankAccount);
        else
            System.out.println("No es una cuenta de inversion o tarjeta de credito");
    }

}
