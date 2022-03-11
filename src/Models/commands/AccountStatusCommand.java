package Models.commands;

import Interfaces.Command;
import Models.bank.BankAccount;
import Services.ProductManagerService;

import java.util.List;

public class AccountStatusCommand implements Command {
    private ProductManagerService productManagerService;

    public AccountStatusCommand(ProductManagerService productManagerService) {
        this.productManagerService = productManagerService;
    }

    @Override
    public void runCommand() {
        System.out.print("Ingresa ID cliente: ");
        String id = System.console().readLine();
        List<BankAccount> products = productManagerService.getProducts(id);
        if (products != null) {
            System.out.println("Estado de cuenta de usuario: " + id);
            for(BankAccount bankAccount : products)
                bankAccount.accountStatus();
        }
    }

    @Override
    public void displaySubMenu() {}
}
