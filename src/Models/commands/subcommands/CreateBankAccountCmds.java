package Models.commands.subcommands;

import Models.bank.*;
import Services.ClientsService;
import Services.ProductManagerService;
import Utils.GenerateRandom;

public class CreateBankAccountCmds {
    private GenerateRandom gr;
    private ClientsService clientsService;
    private ProductManagerService productManagerService;

    public CreateBankAccountCmds(GenerateRandom gr, ClientsService clientsService, ProductManagerService productManagerService) {
        this.gr = gr;
        this.clientsService = clientsService;
        this.productManagerService = productManagerService;
    }

    public void createSavingAccountCmd(){
        boolean validId = false;
        do {
            System.out.print("Ingresa el id del cliente: ");
            String id = System.console().readLine();
            validId = clientsService.userExist(id);
            if (validId) {
                System.out.print("Ingrese el salario: ");
                double balance = Double.parseDouble(System.console().readLine());
                SavingsAccount savingsAccount = new SavingsAccount(balance, gr.generateId());
                Client client = clientsService.findId(id);
                System.out.println(client.toString());
                productManagerService.addProduct(client,savingsAccount);

                System.out.println("Cuenta creada: " + savingsAccount.getId());
            } else {
                System.out.println("Id no valido");
            }
        } while (!validId);
    }

    public void createInvestmentAccountCmd(){
        boolean validId = false;
        do {
            System.out.print("Ingresa el id del cliente: ");
            String id = System.console().readLine();
            validId = clientsService.userExist(id);
            if (validId) {
                System.out.print("Ingrese el salario: ");
                double balance = Double.parseDouble(System.console().readLine());
                InvestmentAccount investmentAccount = new InvestmentAccount(balance, gr.generateId(), 0.08);
                Client client = clientsService.findId(id);
                System.out.println(client.toString());
                productManagerService.addProduct(client,investmentAccount);

                System.out.println("Cuenta creada: " + investmentAccount.getId());

            } else {
                System.out.println("Id no valido");
            }
        } while (!validId);
    }

    public void createCheckingAccountCmd() {
        boolean validId = false;
        do {
            System.out.print("Ingresa el id del cliente: ");
            String id = System.console().readLine();
            validId = clientsService.userExist(id);
            if (validId) {
                System.out.print("Ingrese el salario: ");
                double balance = Double.parseDouble(System.console().readLine());
                CheckingAccount savingsAccount = new CheckingAccount(balance, gr.generateId());
                Client client = clientsService.findId(id);
                System.out.println(client.toString());
                productManagerService.addProduct(client,savingsAccount);
            } else {
                System.out.println("Id no valido");
            }
        } while (!validId);
    }

    public void getUserAccounsCmd(){
        System.out.print("Ingresa el id del usuario: ");
        String id = System.console().readLine();
        for (BankAccount ba : productManagerService.getProducts(id)) {
            ba.accountStatus();
        }
    }

}
