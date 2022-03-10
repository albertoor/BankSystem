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

        productManagerService.addProduct(customer, ia);
        productManagerService.addProduct(customer, sa);

        System.out.println(productManagerService.getProducts(customer.getId()).size());

    }
}
