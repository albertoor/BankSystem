package Services;

import Models.BankAccount;
import Models.Customer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductManagerService {
    private Map<String, List<BankAccount>> productsMap = new HashMap<>();

    public ProductManagerService(){}

    public void addProduct(Customer customer, BankAccount bankAccount){
        List<BankAccount> products = productsMap.get(customer.getId());
        if (products == null) {
            products = new ArrayList<>();
            productsMap.put(customer.getId(), products);
        }
        products.add(bankAccount);
    }

    public List<BankAccount> getProducts(String customerId) {
        List<BankAccount> products = productsMap.get(customerId);
        if (products == null)
            System.out.println("El cliente no tiene productos asignados");
        return products;
    }

}
