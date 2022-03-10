package Models.commands;

import Interfaces.Command;
import Models.commands.subcommands.CreateBankAccountCmds;
import Utils.GenerateRandom;

public class CreateAccountCommand implements Command{

    private GenerateRandom gr;
    private CreateBankAccountCmds createBankAccountCmds;

    public CreateAccountCommand(GenerateRandom gr) {
        this.gr = gr;
        createBankAccountCmds = new CreateBankAccountCmds(gr);
    }

    @Override
    public void runCommand() {
        String command;
        do {
            displaySubMenu();
            command = System.console().readLine();
            switch (command) {
                case "ahorro":
                    createBankAccountCmds.createSavingAccountCmd();
                    break;
                case "inversion":
                    createBankAccountCmds.createInvestmentAccountCmd();
                    break;
                case "cheques":
                    createBankAccountCmds.createCheckingAccountCmd();
                    break;
                case "regresar":
                    break;
            }
        } while (!"regresar".equalsIgnoreCase(command));
    }


    @Override
    public void displaySubMenu() {
        System.out.println("\n- ahorro");
        System.out.println("- inversion");
        System.out.println("- cheques");
        System.out.println("- regresar");
        System.out.printf("\nCrear cuentas>_ ");
    }
}
