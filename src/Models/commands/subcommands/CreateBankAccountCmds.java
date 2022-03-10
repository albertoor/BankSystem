package Models.commands.subcommands;

import Models.bank.CheckingAccount;
import Models.bank.InvestmentAccount;
import Models.bank.SavingsAccount;
import Utils.GenerateRandom;

public class CreateBankAccountCmds {
    private GenerateRandom gr;

    public CreateBankAccountCmds(GenerateRandom gr) {
        this.gr = gr;
    }

    public void createSavingAccountCmd(){
        System.out.print("Ingrese el id del cliente: ");
        String id = System.console().readLine();
        System.out.print("Ingrese el salario: ");
        double balance = Double.parseDouble(System.console().readLine());
        SavingsAccount savingsAccount = new SavingsAccount(balance, gr.generateId());
        System.out.println("Cuenta creada");
        savingsAccount.accountStatus();
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
