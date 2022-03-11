package Models.commands;

import Interfaces.Command;
import Models.bank.BankAccount;
import Models.commands.subcommands.MovementsAccountsCmds;
import Services.ProductManagerService;

public class MovementsAccountsCommand implements Command {
    private ProductManagerService productManagerService;
    private MovementsAccountsCmds movementsAccountsCmds;

    public MovementsAccountsCommand(ProductManagerService productManagerService) {
        this.productManagerService = productManagerService;
        movementsAccountsCmds = new MovementsAccountsCmds(productManagerService);
    }

    @Override
    public void runCommand() {
        System.out.print("Ingresa el ID de la cuenta: ");
        String id = System.console().readLine();
//        BankAccount bankAccount = productManagerService.findBankAccountById(id);
//
//        if (bankAccount != null) {
//            String command;
//            do {
//                displaySubMenu();
//                command = System.console().readLine();
//                switch (command) {
//                    case "retiro":
//                        System.out.println("Retiro");
//                        movementsAccountsCmds.makeWithdrawal(bankAccount);
//                        break;
//                    case "cargo":
//                        System.out.println("Cargo");
//                        break;
//                    case "corte":
//                        System.out.println("Corte");
//                    case "deposito":
//                        System.out.println("Deposito");
//                        break;
//                }
//            } while (!"regresar".equalsIgnoreCase(command));
//        } else {
//            System.out.println("Cuenta no encontrada");
//        }
    }

    @Override
    public void displaySubMenu() {
        System.out.println("\n- retiro");
        System.out.println("- cargo");
        System.out.println("- corte");
        System.out.println("- deposito");
        System.out.printf("\nMovimientos>_ ");
    }
}
