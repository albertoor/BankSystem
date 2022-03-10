package Models.commands;

import Interfaces.Command;
import Models.commands.subcommands.ClientsCmds;
import Services.ClientsService;
import Utils.GenerateRandom;

public class ClientsMenuCommand implements Command {
    private GenerateRandom gr;
    private ClientsService clientsService;
    private ClientsCmds clientsCmds;

    public ClientsMenuCommand(GenerateRandom gr) {
        this.gr = gr;
        clientsService = new ClientsService();
        clientsCmds = new ClientsCmds(gr, clientsService);
    }

    @Override
    public void runCommand() {
        String command;
        do {
            displaySubMenu();
            command = System.console().readLine();
            switch (command) {
                case "crear-cliente":
                    clientsCmds.createClient();
                    break;
                case "ver-clientes":
                    clientsCmds.showClient();
                    break;
                case "dar-baja":
                    clientsCmds.unsubscribe();
                    break;
            }
        } while (!"regresar".equalsIgnoreCase(command));
    }

    @Override
    public void displaySubMenu() {
        System.out.println("\nClientes>_");
        System.out.println("- crear-cliente");
        System.out.println("- ver-clientes");
        System.out.println("- dar-baja");
        System.out.println("- regresar\n");
    }
}
