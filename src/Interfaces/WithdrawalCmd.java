package Interfaces;

import Models.bank.CheckingAccount;
import Models.bank.InvestmentAccount;
import Models.bank.SavingsAccount;

public interface WithdrawalCmd {
    void makeWithdrawalInvestment(InvestmentAccount investmentAccount);
    void makeWithdrawalChecking(CheckingAccount checkingAccount);
    void makeWithdrawalSaving(SavingsAccount savingsAccount);
}
