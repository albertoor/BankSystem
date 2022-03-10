package Services;

import Models.bank.Client;

import java.util.HashMap;
import java.util.Map;

public class ClientsService {
    private Map<String, Client> clientsMap;

    public ClientsService(){
        clientsMap = new HashMap<>();
    }

    public void addClient(Client client) {
        if (client != null)
            clientsMap.put(client.getId(), client);
    }

    public Map<String, Client> getClienstMap() {
        if (clientsMap.size() == 0)
            System.out.println("No hay clientes");
        return clientsMap;
    }

    public boolean userExist(String clientId){
        return clientsMap.containsKey(clientId);
    }

    public Client getUserById(String clientId) {
        return clientsMap.get(clientId);
    }
}
