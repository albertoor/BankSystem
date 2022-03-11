package Models.commands;

import Interfaces.Command;
import Models.commands.subcommands.CreateBankAccountCmds;
import Services.ClientsService;
import Services.ProductManagerService;
import Utils.GenerateRandom;

public class CreateAccountMenuCommand implements Command{

    private GenerateRandom gr;
    private CreateBankAccountCmds createBankAccountCmds;
    private ClientsService clientsService;
    private ProductManagerService productManagerService;

    public CreateAccountMenuCommand(GenerateRandom gr, ClientsService clientsService, ProductManagerService productManagerService) {
        this.gr = gr;
        this.clientsService = clientsService;
        this.productManagerService = productManagerService;
        createBankAccountCmds = new CreateBankAccountCmds(gr, clientsService, productManagerService);
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
                case "cuentas-user-id":
                    createBankAccountCmds.getUserAccounsCmd();
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
