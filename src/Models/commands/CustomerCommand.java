package Models.commands;

import Interfaces.Command;
import Models.bank.Customer;
import Utils.GenerateRandom;

public class CustomerCommand implements Command {

    private GenerateRandom gr;

    public CustomerCommand(GenerateRandom gr) {
        this.gr = gr;
    }

    @Override
    public void runCommand() {
        System.out.print("Porfavor ingresa el nombre del cliente: ");
        String name = System.console().readLine();
        System.out.println("Porfavor ingresa el ingreso mensual: ");
        double incomePerMoth =  Double.parseDouble(System.console().readLine());
        Customer customer = new Customer(name, Integer.toString(gr.generateId()), incomePerMoth);
        System.out.println("Cliente creado: ");
        System.out.println(customer);
    }
}
