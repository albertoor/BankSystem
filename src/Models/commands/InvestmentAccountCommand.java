package Models.commands;

import Interfaces.Command;
import Models.bank.InvestmentAccount;
import Utils.GenerateRandom;

public class InvestmentAccountCommand implements Command {

    private GenerateRandom gr;

    public InvestmentAccountCommand(GenerateRandom gr) {
        this.gr = gr;
    }

    @Override
    public void runCommand() {
        System.out.println("Ingresa el balance: ");
        double balance = Double.parseDouble(System.console().readLine());
        InvestmentAccount investmentAccount = new InvestmentAccount(balance, gr.generateId(), 0.05);
        System.out.println("Cuenta creada");
        investmentAccount.accountStatus();
    }
}
