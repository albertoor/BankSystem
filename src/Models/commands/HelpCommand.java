package Models.commands;

import Interfaces.Command;

public class HelpCommand implements Command {
    @Override
    public void runCommand() {
        System.out.println("\nMenu Principal");
        System.out.println("- ayuda");
        System.out.println("- clientes");
        System.out.println("- crear-cuenta");
        System.out.println("- dar-baja-cuenta");
        System.out.println("- modificar-configuraciones");
        System.out.println("- modificar-propiedades");
        System.out.println("- salir\n");
    }
}
