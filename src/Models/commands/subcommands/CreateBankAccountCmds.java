package Models.commands.subcommands;

import Models.bank.*;
import Services.ClientsService;
import Services.ProductManagerService;
import Utils.GenerateRandom;
import Utils.ReadInput;

public class CreateBankAccountCmds {
    private GenerateRandom gr;
    private ClientsService clientsService;
    private ProductManagerService productManagerService;
    private ReadInput readInput;

    public CreateBankAccountCmds(GenerateRandom gr, ClientsService clientsService, ProductManagerService productManagerService) {
        this.gr = gr;
        this.clientsService = clientsService;
        readInput = new ReadInput();
        this.productManagerService = productManagerService;
    }

    public void createSavingAccountCmd(){
        boolean validId = false;
        do {
            System.out.print("Ingresa el id del cliente: ");
            String id = System.console().readLine();
            validId = clientsService.userExist(id);
            if (validId) {
                double balance = readInput.readDouble("Ingrese el salario: ");
                SavingsAccount savingsAccount = new SavingsAccount(balance, gr.generateId());
                Client client = clientsService.findId(id);
                productManagerService.addProduct(client,savingsAccount);
                System.out.println("\nCuenta creada: " + savingsAccount.getId() + "\n");
            } else {
                System.err.println("Id no valido");
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
                double balance = readInput.readDouble("Ingrese el salario: ");
                double interestToCourt = readInput.readDouble("Ingrese el interes al corte:" );
                double interestCommssion = readInput.readDouble("Ingrese el interes de comision: ");

                InvestmentAccount investmentAccount = new InvestmentAccount(balance, gr.generateId(), interestToCourt, interestCommssion );
                Client client = clientsService.findId(id);

                productManagerService.addProduct(client,investmentAccount);

                System.out.println("\nCuenta creada: " + investmentAccount.getId() + "\n");

            } else {
                System.err.println("Id no valido");
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
                double balance = readInput.readDouble("Ingrese el salario");
                CheckingAccount checkingAccount = new CheckingAccount(balance, gr.generateId());
                Client client = clientsService.findId(id);
                productManagerService.addProduct(client,checkingAccount);
                System.out.println("\nCuenta creada: " +checkingAccount.getId() + "\n");
            } else {
                System.err.println("Id no valido");
            }
        } while (!validId);
    }

    public void createCreditCardAccountCmd(){
        boolean validId = false;
        do {
            System.out.print("Ingresa el id del cliente: ");
            String id = System.console().readLine();
            validId = clientsService.userExist(id);
            if (validId) {
                Client client = clientsService.findId(id);
                double balance = readInput.readDouble("Ingrese el salario:");
                double lineOfCredit = readInput.readDouble("Ingresar la linea de credito: ");

                CreditCardAccount creditCardAccount = new CreditCardAccount(balance, gr.generateId(), lineOfCredit);
                productManagerService.addProduct(client, creditCardAccount);

                System.out.println("\nTarjeta de credito creada: " + creditCardAccount.getId() + "\n");

            } else {
                System.err.println("Id no valido");
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
