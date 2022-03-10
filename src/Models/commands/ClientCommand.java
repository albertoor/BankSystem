package Models.commands;

import Interfaces.Command;
import Models.bank.Client;
import Services.ClientsService;
import Utils.GenerateRandom;

public class ClientCommand implements Command {

    private GenerateRandom gr;
    private ClientsService clientsService;

    public ClientCommand(GenerateRandom gr, ClientsService clientsService) {
        this.gr = gr;
        this.clientsService = clientsService;

    }

    @Override
    public void runCommand() {
        System.out.print("Porfavor ingresa el nombre del cliente: ");
        String name = System.console().readLine();
        System.out.println("Porfavor ingresa el ingreso mensual: ");
        double incomePerMoth =  Double.parseDouble(System.console().readLine());
        Client customer = new Client(name, Integer.toString(gr.generateId()), incomePerMoth);
        System.out.println("Cliente creado: ");
        System.out.println(customer);
        clientsService.addClient(customer);
        System.out.println(clientsService.getClienstMap());
    }

    public void showClientAdded(){
        System.out.println("Clientes agregados");
        clientsService.getClienstMap().forEach((s, client) -> System.out.println(client));
    }
}
