package Interfaces;

import Models.bank.CheckingAccount;
import Models.bank.InvestmentAccount;
import Models.bank.SavingsAccount;

public interface DepositCmd {
    void makeDepositChecking(CheckingAccount checkingAccount);
    void makeDepositSaving(SavingsAccount savingsAccount);
    void makeDepositInvestment(InvestmentAccount investmentAccount);
}
