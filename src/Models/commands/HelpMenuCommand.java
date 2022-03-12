package Models.commands;

import Interfaces.Command;

public class HelpMenuCommand implements Command {
    @Override
    public void runCommand() {
        System.out.println("\nMenu Principal");
        System.out.println("- ayuda");
        System.out.println("- clientes");
        System.out.println("- crear-cuenta");
        System.out.println("- estados");
        System.out.println("- movimientos");
        System.out.println("- propiedades");
        System.out.println("- salir\n");
    }

    @Override
    public void displaySubMenu() {}
}
