package Models.commands;

import Interfaces.Command;
import Models.bank.SavingsAccount;
import Utils.GenerateRandom;

public class SavingsAccountCommand implements Command {
    private GenerateRandom gr;

    public SavingsAccountCommand(GenerateRandom gr) {
        this.gr = gr;
    }

    @Override
    public void runCommand() {
        System.out.print("Ingrese el id del cliente: ");
        String id = System.console().readLine();
        System.out.print("Ingrese el salario: ");
        double balance = Double.parseDouble(System.console().readLine());
        SavingsAccount savingsAccount = new SavingsAccount(balance, Integer.toString(gr.generateId()));
        System.out.println("Cuenta creada");
        savingsAccount.accountStatus();
    }
}
