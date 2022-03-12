package Models.commands.subcommands;
import Models.bank.Client;
import Services.ClientsService;
import Utils.GenerateRandom;
import Utils.ReadInput;

public class ClientsCmds {
    private GenerateRandom gr;
    private ClientsService clientsService;
    private ReadInput readInput;

    public ClientsCmds(GenerateRandom gr, ClientsService clientsService) {
        this.gr = gr;
        readInput = new ReadInput();
        this.clientsService = clientsService;
    }

    public void createClient() {
        String name = readInput.readString("Porfavor ingresa el nombre: ");
        double incomePerMonth = readInput.readDouble("Porfavor ingresa el ingreso mensual: ");
        Client client = new Client(name, gr.generateId(), incomePerMonth);
        clientsService.addClient(client);
        System.out.println("\nCliente creado: " + client);

    }

    public void showClients(){
        clientsService.getClienstMap().forEach((s, client) -> System.out.println(client));
    }

    public void unsubscribe(){}
}
