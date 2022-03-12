package Models.commands;

import Interfaces.Command;
import Models.commands.subcommands.MovementsAccountsCmds;
import Models.commands.subcommands.PropsCmds;
import Services.ProductManagerService;

public class PropsCommand implements Command {

    private PropsCmds propsCmds;

    public PropsCommand(ProductManagerService productManagerService) {
        propsCmds = new PropsCmds(productManagerService);
    }

    @Override
    public void runCommand() {
        String command;
        do {
            displaySubMenu();
            command = System.console().readLine();
            switch (command) {
                case "comision-retiro":
                    propsCmds.setNewWithdrawalCommision();
                    break;
                case "interes-corte":
                    propsCmds.setNewInteresToCourt();
                    break;
                case "linea-max-credito":
                    propsCmds.setNewLineOfCredit();
                    break;
                case "regresar":
                    break;
            }
        } while (!"regresar".equalsIgnoreCase(command));
    }

    @Override
    public void displaySubMenu() {
        System.out.println("\n- comision-retiro");
        System.out.println("- interes-corte");
        System.out.println("- linea-credito");
        System.out.println("- regresar");
        System.out.printf("\nPropiedades>_ ");
    }
}
