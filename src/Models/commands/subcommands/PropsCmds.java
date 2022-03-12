package Models.commands.subcommands;


import Models.bank.BankAccount;
import Models.bank.CheckingAccount;
import Models.bank.CreditCardAccount;
import Models.bank.InvestmentAccount;
import Services.ProductManagerService;
import Utils.ReadInput;

public class PropsCmds {
    private ProductManagerService productManagerService;
    private ReadInput readInput = new ReadInput();

    private static final String ID_MSG = "Ingresa id cliente: ";
    private static final String ID_ACCOUNT_MSG = "Ingresa id de cuenta de inversion: ";
    private static final String ID_ACCOUNT_CREDIT_MSG = "Ingresa id de cuenta de credito: ";

    public PropsCmds(ProductManagerService productManagerService) {
        this.productManagerService = productManagerService;
    }

    public void setNewWithdrawalCommision() {
        String clientId = readInput.readString(ID_MSG);
        String bankAccountId = readInput.readString(ID_ACCOUNT_MSG);
        BankAccount bankAccount = productManagerService.findBankAccountById(clientId, bankAccountId);

        if (bankAccount != null) {
            if (bankAccount instanceof InvestmentAccount) {
                System.out.println( "Comisio de retiro actual: " + ((InvestmentAccount) bankAccount).getInterestCommission());
                double newWithdrawalCommission = readInput.readDouble("Ingrese la nueva comision de retiro: ");
                ((InvestmentAccount) bankAccount).setInterestCommission(newWithdrawalCommission);
                System.out.println("Nueva comision de retiro: " + ((InvestmentAccount) bankAccount).getInterestCommission());
            } else {
                System.out.print("No es una cuenta de inversion");
            }
        } else {
            System.out.println("No hay cuenta");
        }
    }

    public void setNewInteresToCourt(){
        String clientId = readInput.readString(ID_MSG);
        String bankAccountId = readInput.readString(ID_ACCOUNT_MSG);
        BankAccount bankAccount = productManagerService.findBankAccountById(clientId, bankAccountId);

        if (bankAccount != null) {
            if (bankAccount instanceof CheckingAccount) {
                System.out.println( "Comision de interest de corte: " + ((CheckingAccount) bankAccount).getWithdrawalFee());
                double newInterestCourt = readInput.readDouble("Ingrese el nuevo interes de corte: ");
                ((CheckingAccount) bankAccount).setWithdrawalFee(newInterestCourt);
                System.out.println("Nuevo interest de corte: " + ((CheckingAccount) bankAccount).getWithdrawalFee());
            } else {
                System.out.println("No es una cuenta de inversion");
            }
        } else {
            System.out.println("No hay cuenta");
        }
    }

    public void setNewLineOfCredit(){
        String clientId = readInput.readString(ID_MSG);
        String bankAccountId = readInput.readString(ID_ACCOUNT_CREDIT_MSG);
        BankAccount bankAccount = productManagerService.findBankAccountById(clientId, bankAccountId);

        if (bankAccount != null ){
            if (bankAccount instanceof CreditCardAccount) {
                System.out.println( "Linea de credito actual: " + ((CreditCardAccount) bankAccount).getLineOfCredit());
                double newLineCredit = readInput.readDouble("Ingrese la nueva linea de credito: ");
                ((CreditCardAccount) bankAccount).setLineOfCredit(newLineCredit);
                System.out.println("Nueva liena de credito: " + ((CreditCardAccount) bankAccount).getLineOfCredit());
            } else {
                System.out.println("No es una cuenta de inversion");
            }
        } else {
            System.out.println("No hay cuenta");
        }
    }
}
