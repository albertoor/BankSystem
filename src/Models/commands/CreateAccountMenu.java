package Models.commands;

import Interfaces.Command;
import Utils.GenerateRandom;

public class CreateAccountMenu implements Command {

    private GenerateRandom gr;
    private CheckingAccountCommand checkingAccountCommand;
    private InvestmentAccountCommand investmentAccountCommand;
    private SavingsAccountCommand savingsAccountCommand;

    public CreateAccountMenu(GenerateRandom gr) {
        this.gr = gr;
    }

    @Override
    public void runCommand() {
        String command;
        do {
            System.out.println("\n- ahorro");
            System.out.println("- inversion");
            System.out.println("- cheques");
            System.out.println("- regresar");
            System.out.printf("\nCrear cuentas>_ ");
            command = System.console().readLine();
            switch (command) {
                case "ahorro":
                    savingsAccountCommand = new SavingsAccountCommand(gr);
                    savingsAccountCommand.runCommand();
                    break;
                case "inversion":
                    investmentAccountCommand = new InvestmentAccountCommand(gr);
                    investmentAccountCommand.runCommand();
                    break;
                case "cheques":
                    checkingAccountCommand = new CheckingAccountCommand(gr);
                    checkingAccountCommand.runCommand();
                    break;
                case "regresar":
                    break;
            }
        } while (!"regresar".equalsIgnoreCase(command));
    }
}
