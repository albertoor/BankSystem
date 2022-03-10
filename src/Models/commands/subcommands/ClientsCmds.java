package Models.commands.subcommands;

import Models.bank.Client;
import Services.ClientsService;
import Utils.GenerateRandom;

public class ClientsCmds {
    private GenerateRandom gr;
    private ClientsService clientsService;

    public ClientsCmds(GenerateRandom gr, ClientsService clientsService) {
        this.gr = gr;
        this.clientsService = clientsService;
    }

    public void createClient(){
        System.out.print("Porfavor ingresa el nombre del cliente: ");
        String name = System.console().readLine();
        System.out.println("Porfavor ingresa el ingreso mensual: ");
        double incomePerMoth =  Double.parseDouble(System.console().readLine());
        Client customer = new Client(name, gr.generateId(), incomePerMoth);
        System.out.println("Cliente creado: ");
        System.out.println(customer);
        clientsService.addClient(customer);
        System.out.println(clientsService.getClienstMap());
    }

    public void showClient(){}

    public void unsubscribe(){}
}
