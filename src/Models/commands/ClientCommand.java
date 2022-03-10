package Models.commands;

import Interfaces.Command;
import Models.bank.Customer;
import Utils.GenerateRandom;

public class ClientCommand implements Command {

    @Override
    public void runCommand() {
        GenerateRandom gr = new GenerateRandom();
        int randomId = gr.generateId();
        System.out.print("Porfavor ingresa el nombre del cliente: ");
        String name = System.console().readLine();
        System.out.println("Porfavor ingresa el ingreso mensual: ");
        double incomePerMoth =  Double.parseDouble(System.console().readLine());
        Customer customer = new Customer(name, Integer.toString(randomId), incomePerMoth);
        System.out.println("Cliente creado: ");
        System.out.println(customer);
    }
}
