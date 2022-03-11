package Services;

import Models.bank.BankAccount;
import Models.bank.CheckingAccount;
import Models.bank.Client;
import Models.bank.InvestmentAccount;

import javax.xml.crypto.dsig.spec.HMACParameterSpec;
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

    public void addProduct(Client client, BankAccount product){
        List<BankAccount> products = productsMap.get(client.getId());
        if (products == null){
            products = new ArrayList<>();
            productsMap.put(client.getId(), products);
        }
        if (product instanceof  InvestmentAccount) {
            boolean f = products.stream().anyMatch(CheckingAccount.class::isInstance);
            if (f) {
                System.out.println("YES");
                products.add(product);
            } else {
                System.out.println("NO");
            }
        }else{
            products.add(product);
        }
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

    public static void main(String[] args) {
        Client client = new Client("Beto", "12323", 90500);
        ProductManagerService pms = new ProductManagerService();

        CheckingAccount checking = new CheckingAccount(4500, "324");
        InvestmentAccount investment = new InvestmentAccount(5000, "1213", 0.5);


        pms.addProduct(client,investment);
        pms.addProduct(client, checking);


//        System.out.println(pms.getProducts(client.getId()));

    }

}
