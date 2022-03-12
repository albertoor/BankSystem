package Models.commands.subcommands;


import Models.bank.BankAccount;
import Models.bank.CreditCardAccount;
import Models.bank.InvestmentAccount;
import Services.ProductManagerService;

public class PropsCmds {
    private InvestmentAccount investmentAccount;
    private CreditCardAccount creditCardAccount;
    private ProductManagerService productManagerService;

    public PropsCmds(ProductManagerService productManagerService) {
        this.productManagerService = productManagerService;
    }

    public void setNewWithdrawalCommision() {
        System.out.print("Ingresa id cliente: ");
        String clientId = System.console().readLine();
        System.out.print("Ingresa id cuenta inversion: ");
        String bankAccountId = System.console().readLine();
        BankAccount bankAccount = productManagerService.findBankAccountById(clientId, bankAccountId);

        if (bankAccount instanceof InvestmentAccount) {
            System.out.println( "Comisio de retiro actual: " + ((InvestmentAccount) bankAccount).getInterestCommission());
            System.out.print("Ingres la nueva comision de retiro: ");
            double newWithdrawalCommission = Double.parseDouble(System.console().readLine());
            ((InvestmentAccount) bankAccount).setInterestCommission(newWithdrawalCommission);
            System.out.println("Nueva comision de retiro: " + ((InvestmentAccount) bankAccount).getInterestCommission());
        } else {
            System.out.println("No es una cuenta de inversion");
        }
    }

    public void setNewInteresToCourt(){
        System.out.print("Ingresa id cliente: ");
        String clientId = System.console().readLine();
        System.out.print("Ingresa id cuenta inversion: ");
        String bankAccountId = System.console().readLine();
        BankAccount bankAccount = productManagerService.findBankAccountById(clientId, bankAccountId);

        if (bankAccount instanceof InvestmentAccount) {
            System.out.println( "Comision de interest de corte: " + ((InvestmentAccount) bankAccount).getInterestToCourt());
            System.out.print("Ingres la nueva comision de retiro: ");
            double newInterestCourt = Double.parseDouble(System.console().readLine());
            ((InvestmentAccount) bankAccount).setInterestToCourt(newInterestCourt);
            System.out.println("Nuevo interest de corte: " + ((InvestmentAccount) bankAccount).getInterestToCourt());
        } else {
            System.out.println("No es una cuenta de inversion");
        }
    }

    public void setNewLineOfCredit(){
        System.out.print("Ingresa id cliente: ");
        String clientId = System.console().readLine();
        System.out.print("Ingresa id cuenta inversion: ");
        String bankAccountId = System.console().readLine();
        BankAccount bankAccount = productManagerService.findBankAccountById(clientId, bankAccountId);

        if (bankAccount instanceof CreditCardAccount) {
            System.out.println( "Linea de credito actual: " + ((CreditCardAccount) bankAccount).getLineOfCredit());
            System.out.print("Ingres la nueva comision de retiro: ");
            double newLineCredit = Double.parseDouble(System.console().readLine());
            ((CreditCardAccount) bankAccount).setLineOfCredit(newLineCredit);
            System.out.println("Nuevo interest de corte: " + ((CreditCardAccount) bankAccount).getLineOfCredit());
        } else {
            System.out.println("No es una cuenta de inversion");
        }
    }
}
