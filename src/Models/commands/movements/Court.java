package Models.commands.movements;

import Models.bank.InvestmentAccount;

public class Court {

    public void makeCourtInvestment(InvestmentAccount investmentAccount) {
        System.out.println("Balance actual: " + investmentAccount.getBalance());
        System.out.println("Aplicando corte a Cuenta de inversion " + investmentAccount.getId() + "...");
        investmentAccount.applyCut();
        System.out.println("Nuevo Balance: " + investmentAccount.getBalance());
    }
}
