import Models.BankAccount;
import Models.Customer;
import Models.InvestmentAccount;
import Models.SavingsAccount;
import Services.ProductManagerService;

public class ProductManagerServiceTest {
    public static void main(String[] args) {
        Customer customer = new Customer("Andre Iniesta", "12345", 30000);
        ProductManagerService productManagerService = new ProductManagerService();

        SavingsAccount sa = new SavingsAccount(customer.getIncomePerMoth());
        InvestmentAccount ia = new InvestmentAccount(customer.getIncomePerMoth(), 0.05);

        productManagerService.addProduct(customer, sa);
        productManagerService.addProduct(customer, ia);

    }
}
