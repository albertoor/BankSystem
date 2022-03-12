package Models.commands;

import Interfaces.Command;
import Models.bank.BankAccount;
import Models.commands.subcommands.MovementsAccountsCmds;
import Services.ProductManagerService;
import Utils.ReadInput;

import java.util.Objects;

public class MovementsAccountsCommand implements Command {
    private ProductManagerService productManagerService;
    private MovementsAccountsCmds movementsAccountsCmds;
    private ReadInput readInput = new ReadInput();

    public MovementsAccountsCommand(ProductManagerService productManagerService) {
        this.productManagerService = productManagerService;
        movementsAccountsCmds = new MovementsAccountsCmds();
    }

    @Override
    public void runCommand() {
        String clientId = readInput.readString("Ingresa el ID del cliente: ");
        String bankAccountId = readInput.readString("Ingresa el ID de la cuenta: ");
        BankAccount bankAccount = productManagerService.findBankAccountById(clientId, bankAccountId);

        String command;

            if (bankAccount != null) {
                do {
                    displaySubMenu();
                    command = System.console().readLine();
                    switch (command) {
                        case "retiro":
                            movementsAccountsCmds.withdrawal(bankAccount);
                            break;
                        case "cargo":
                            movementsAccountsCmds.charge(bankAccount);
                            break;
                        case "corte":
                            movementsAccountsCmds.court(bankAccount);
                            break;
                        case "deposito":
                            movementsAccountsCmds.deposit(bankAccount);
                            break;
                        case "regresar":
                            break;
                    }
                } while (!"regresar".equalsIgnoreCase(command) && bankAccount != null);
            } else {
                System.out.println("No existe");
            }
    }

    @Override
    public void displaySubMenu() {
        System.out.println("\n- retiro (todas las cuentas, excepto Tarjeata de credito)");
        System.out.println("- cargo (todas las cuentas)");
        System.out.println("- corte (solo cuentas de inversion)");
        System.out.println("- deposito (todas las cuentas)");
        System.out.println("- regresar");
        System.out.printf("\nMovimientos>_ ");
    }
}
