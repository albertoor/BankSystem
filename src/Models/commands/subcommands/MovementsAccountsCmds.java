package Models.commands.subcommands;

import Models.bank.*;
import Models.commands.movements.Charge;
import Models.commands.movements.Court;
import Models.commands.movements.Deposit;
import Models.commands.movements.Withdrawal;
import Services.ProductManagerService;

public class MovementsAccountsCmds {
    private Withdrawal withdrawal;
    private Deposit deposit;
    private Charge charge;
    private Court court;

    public MovementsAccountsCmds() {
        withdrawal = new Withdrawal();
        deposit = new Deposit();
        charge = new Charge();
        court = new Court();
    }

    public void withdrawal(BankAccount bankAccount) {
        if(bankAccount instanceof InvestmentAccount) {
            bankAccount.accountStatus();
            withdrawal.makeWithdrawalInvestment((InvestmentAccount) bankAccount);
        } else if (bankAccount instanceof SavingsAccount) {
            bankAccount.accountStatus();
            withdrawal.makeWithdrawalSaving((SavingsAccount) bankAccount);
        } else if (bankAccount instanceof CheckingAccount) {
            bankAccount.accountStatus();
            withdrawal.makeWithdrawalChecking((CheckingAccount) bankAccount);
        }

    }

    public void deposit(BankAccount bankAccount) {
        if(bankAccount instanceof InvestmentAccount) {
            bankAccount.accountStatus();
            deposit.makeDepositInvestment((InvestmentAccount) bankAccount);
        } else if (bankAccount instanceof SavingsAccount) {
            bankAccount.accountStatus();
            deposit.makeDepositSaving((SavingsAccount) bankAccount);
        } else if (bankAccount instanceof CheckingAccount) {
            bankAccount.accountStatus();
            deposit.makeDepositChecking((CheckingAccount) bankAccount);
        } else if (bankAccount instanceof CreditCardAccount) {
            bankAccount.accountStatus();
            deposit.makeDepositCredit((CreditCardAccount) bankAccount);
        }
    }

    public void charge(BankAccount bankAccount) {
        if(bankAccount instanceof InvestmentAccount){
            bankAccount.accountStatus();
            charge.makeChargeInvestment((InvestmentAccount) bankAccount);
        } else if (bankAccount instanceof SavingsAccount) {
            bankAccount.accountStatus();
            charge.makeChargeSaving((SavingsAccount) bankAccount);
        } else if (bankAccount instanceof CheckingAccount) {
            bankAccount.accountStatus();
            charge.makeChargeChecking((CheckingAccount) bankAccount);
        } else if (bankAccount instanceof CreditCardAccount) {
            bankAccount.accountStatus();
            charge.makeChargeCredit((CreditCardAccount) bankAccount);
        }
    }

    public void court(BankAccount bankAccount) {
        if(bankAccount instanceof InvestmentAccount)
            court.makeCourtInvestment((InvestmentAccount) bankAccount);
        else
            System.out.println("No es una cuenta de inversion");
    }

}
