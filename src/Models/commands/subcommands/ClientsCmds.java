package Models.commands.subcommands;
import Models.bank.Client;
import Services.ClientsService;
import Services.ProductManagerService;
import Utils.GenerateRandom;
import Utils.ReadInput;

public class ClientsCmds {
    private GenerateRandom gr;
    private ClientsService clientsService;
    private ReadInput readInput;
    private ProductManagerService productManagerService;

    public ClientsCmds(GenerateRandom gr, ClientsService clientsService, ProductManagerService productManagerService) {
        this.gr = gr;
        readInput = new ReadInput();
        this.clientsService = clientsService;
        this.productManagerService = productManagerService;
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

    public void unsubscribe(){
        String id = readInput.readString("Ingresa el id: ");
        Client client = clientsService.findId(id);
        if (client != null) {
            boolean can = productManagerService.canCancel(client);
            if (can) {
                System.out.println("Canelacion autorizada");
            } else {
                System.out.println("Canelacion denegada");
            }
        } else {
            System.out.println("Usuario no existe");
        }
    }
}
