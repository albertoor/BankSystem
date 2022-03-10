package Services;

import Models.bank.BankAccount;
import Models.bank.CheckingAccount;
import Models.bank.Client;
import Models.bank.InvestmentAccount;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductManagerService {
    private Map<String, List<BankAccount>> productsMap = new HashMap<>();

    public ProductManagerService(){}

    public Map<String, List<BankAccount>> getProductsMap() {
        return productsMap;
    }

    public void addProduct(Client customer, BankAccount product){
        List<BankAccount> products = productsMap.get(customer.getId());
        if (products == null) products = productsEmpty(customer.getId(), null);
        if (product instanceof InvestmentAccount) {
            boolean validInvAcc = haveInvestmentAccount(products);
            if (validInvAcc) products.add(product);
            else return;
        } else
            products.add(product);
    }

    public boolean haveInvestmentAccount(List products){
        boolean haveCheckingAccount = products.stream().allMatch(CheckingAccount.class::isInstance);
        if (haveCheckingAccount) {
            System.out.println("Se agrego la cuenta de Inversion");
        } else {
            System.out.println("No se agrego la cuenta de Inversion, debes tener una cuneta de cheques primero");
            return false;
        }
        return true;
    }


    public List<BankAccount> productsEmpty(String customerId, List<BankAccount> products){
        products = new ArrayList<>();
        productsMap.put(customerId, products);
        return products;
    }

    public List<BankAccount> getProducts(String customerId) {
        List<BankAccount> products = productsMap.get(customerId);
        if (products == null)
            System.out.println("El cliente no tiene productos asignados");
        return products;
    }

}
