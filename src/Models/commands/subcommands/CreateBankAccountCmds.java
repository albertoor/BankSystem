package Models.commands.subcommands;

import Models.bank.CheckingAccount;
import Models.bank.Client;
import Models.bank.InvestmentAccount;
import Models.bank.SavingsAccount;
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
                Client client = clientsService.getUserById(id);
                System.out.println(client.toString());
                productManagerService.addProduct(client,savingsAccount);
                System.out.println(productManagerService.getProducts(id));
            } else {
                System.out.println("Id no valido");
            }
        } while (!validId);
    }

    public void createInvestmentAccountCmd(){
        System.out.println("Ingresa el balance: ");
        double balance = Double.parseDouble(System.console().readLine());
        InvestmentAccount investmentAccount = new InvestmentAccount(balance, gr.generateId(), 0.05);
        System.out.println("Cuenta creada");
        investmentAccount.accountStatus();
    }

    public void createCheckingAccountCmd() {
        System.out.println("Ingresa el balance: ");
        double balance = Double.parseDouble(System.console().readLine());
        CheckingAccount checkingAccount = new CheckingAccount(5000, gr.generateId());
        System.out.println("Cuenta creada");
        checkingAccount.accountStatus();
    }
}
