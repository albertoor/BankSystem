import models.Customer;

public class Main {
    public static void main(String[] args) {

        Customer customer = new Customer("juan petra", "12345", 14500.0);
        System.out.println(customer.toString());
//        SystemTerminal systemTerminal = new SystemTerminal();
//        systemTerminal.startTerminal();
    }
}
