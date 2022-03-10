import Models.commands.*;
import Services.ClientsService;
import Utils.GenerateRandom;

import java.util.Objects;

public class SystemTerminal {
    private static final String PROP_USERNAME = "username";
    private static final String PROP_PASSWORD = "password";
    private static final byte TRY_LIMIT = 3;

    public SystemTerminal() {}

    // Function to start my terminal
    protected void startTerminal() {
        String username, password;
        byte tryCount = 0;
        boolean isLoggedIn;
        System.out.println("Login...");
        do {
            System.out.print("username: ");
            username = System.console().readLine();
            System.out.print("password: ");
            password = new String(System.console().readPassword());
            isLoggedIn = checkCredentials(username, password);

            if (!isLoggedIn) {
                System.err.println("Incorrect username or password\n\n");
                tryCount++;
            }
        } while (!isLoggedIn && tryCount < TRY_LIMIT);
        if (isLoggedIn) {
            System.out.printf("Successfully logged in as %s%n", username);
            runCommandListener();
        }
        else
            System.out.println("You have reached your attempts limit");
        System.out.println("PROGRAM END");
    }

    /**
     *
     * @param username username input to validate
     * @param password password input to validate
     * @return
     */
    private static boolean checkCredentials(String username, String password) {
        try {
            PropertyHandler.load("/application-default.properties", "application.properties");
            boolean areCredentialsValid = Objects.equals(username, PropertyHandler.getStringProperty(PROP_USERNAME)) &&
                Objects.equals(password, PropertyHandler.getStringProperty(PROP_PASSWORD));
            PropertyHandler.persist();
            return areCredentialsValid;
        } catch (Exception e) {
            System.out.printf("%s: %s%n", e.getClass().getName(), e.getMessage());
        }
        return false;
    }

    // Funciton to listener a command a handler action to execute
    private static void runCommandListener(){
        String command;
        GenerateRandom gr = new GenerateRandom();
        ClientsService clientsService = new ClientsService();
        ClientCommand clientCommand = new ClientCommand(gr, clientsService);
        CreateAccountMenu createAccountMenu = new CreateAccountMenu(gr);
        HelpCommand helpCommand = new HelpCommand();

        do {
            System.out.printf("Bienvenido!");
            System.out.printf(">_ ");
            command = System.console().readLine();
            switch (command) {
                case "ayuda":
                    helpCommand.runCommand();
                    break;
                case "crear-cliente":
                    clientCommand.runCommand();
                    break;
                case "ver-clientes":
                    clientCommand.showClientAdded();
                    break;
                case "crear-cuenta":
                    createAccountMenu.runCommand();
                    break;
                case "salir":
                    break;
                default:
                    System.err.printf("\"%s\" is not a recognized command%n", command);
            }
        } while (!"salir".equalsIgnoreCase(command));
    }
}
