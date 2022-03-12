package Utils;

public class ReadInput {

    public ReadInput() {}

    public double readDouble(String promp)  {
        boolean validNumber = false;
        double input = 0.0;
        while (!validNumber) {
            try {
                System.out.print(promp);
                input = Double.parseDouble(System.console().readLine());
                validNumber = true;
            } catch (NumberFormatException err) {
                System.err.println("No ingresaste un numero valido");
            }
        }
        return input;
    }

    public String readString(String promp)  {
        System.out.print(promp);
        String input = System.console().readLine();
        return input;
    }
}
