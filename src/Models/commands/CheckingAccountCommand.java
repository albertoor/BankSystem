package Models.commands;

import Interfaces.Command;
import Models.bank.CheckingAccount;
import Utils.GenerateRandom;

public class CheckingAccountCommand implements Command {
    private GenerateRandom gr;

    public CheckingAccountCommand(GenerateRandom gr) {
        this.gr = gr;
    }

    @Override
    public void runCommand() {
        System.out.println("Ingresa el balance: ");
        double balance = Double.parseDouble(System.console().readLine());
        CheckingAccount checkingAccount = new CheckingAccount(5000, gr.generateId());
        System.out.println("Cuenta creada");
        checkingAccount.accountStatus();
    }
}
