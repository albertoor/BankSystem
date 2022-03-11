package Interfaces;

import Models.bank.CheckingAccount;
import Models.bank.InvestmentAccount;
import Models.bank.SavingsAccount;

public interface ChargeCmd {
    void makeChargeSaving(SavingsAccount savingsAccount);
    void makeChargeInvestment(InvestmentAccount investmentAccount);
    void makeChargeChecking(CheckingAccount checkingAccount);
}
