package Services;

import Models.bank.*;

import javax.xml.crypto.dsig.spec.HMACParameterSpec;
import java.util.*;
import java.util.stream.Collectors;

public class ProductManagerService {
    // Products by cliente id
    private Map<String, List<BankAccount>> productsMap = new HashMap<>();

    public ProductManagerService() {
    }

    public Map<String, List<BankAccount>> getProductsMap() {
        return productsMap;
    }

    public void addProduct(Client client, BankAccount product) {
        List<BankAccount> products = productsMap.get(client.getId());
        if (products == null) {
            products = new ArrayList<>();
            productsMap.put(client.getId(), products);
        }
        if (product instanceof CreditCardAccount) {
            double incomeMonthly = client.getIncomePerMoth();
            double lineCredit = ((CreditCardAccount) product).getLineOfCredit();
            if (lineCredit > incomeMonthly * ((CreditCardAccount) product).getMaxLineCredit()) {
                System.out.println("Linea de credito excesiva para este cliente");
                return;
            }
        }
        if (product instanceof InvestmentAccount) {
            boolean valid = products.stream().anyMatch(CheckingAccount.class::isInstance);
            if (valid) {
                System.out.println("No se agrego la cuenta de Inversion, debes tener una cuneta de cheques primero");
                products.add(product);
            } else {
                System.out.println("Se agrego la cuenta de Inversion");
            }
        } else {
            products.add(product);
        }
    }

    public List<BankAccount> getProducts(String customerId) {
        List<BankAccount> products = productsMap.get(customerId);
        if (products == null)
            System.out.println("El cliente no tiene productos asignados");
        return products;
    }

    public BankAccount findBankAccountById(String clientId, String bankAccountId) {
        List<BankAccount> list = productsMap.get(clientId);
        if (list == null) {
            return null;
        }
        return list.stream().
            filter(product -> product.getId().equals(bankAccountId)).
            findFirst().orElse(null);
    }

    public boolean canCancel(Client client) {
        List<BankAccount> products = getProducts(client.getId());
        boolean result = true;
        for (BankAccount ba : products) {
            if (ba.getBalance() != 0.0) {
                result = false;
                ba.accountStatus();
            }
        }
        return result;
    }
}
