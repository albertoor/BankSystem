package Services;

import Models.bank.Client;

import java.util.HashMap;
import java.util.Map;

public class ClientsService {
    private Map<String, Client> clienstMap;

    public ClientsService(){
        clienstMap = new HashMap<>();
    }

    public void addClient(Client client) {
        if (client != null)
            clienstMap.put(client.getId(), client);
    }

    public Map<String, Client> getClienstMap() {
        return clienstMap;
    }
}
