package Models.commands;

import Interfaces.Command;
import Models.bank.BankAccount;
import Services.ClientsService;
import Services.ProductManagerService;

import java.util.List;

public class AccountStatusCommand implements Command {
    private ProductManagerService productManagerService;
    private ClientsService clientsService;

    public AccountStatusCommand(ProductManagerService productManagerService, ClientsService clientsService) {
        this.clientsService = clientsService;
        this.productManagerService = productManagerService;
    }

    @Override
    public void runCommand() {
        System.out.print("Ingresa ID cliente: ");
        String id = System.console().readLine();
        boolean idExist = clientsService.userExist(id);

        if (idExist) {
            List<BankAccount> products = productManagerService.getProducts(id);
            if (products != null) {
                System.out.println("Estado de cuenta de usuario: " + id);
                for(BankAccount bankAccount : products)
                    bankAccount.accountStatus();
            }
        }else{
            System.err.println("Usuario no existe");
        }
    }

    @Override
    public void displaySubMenu() {}
}
