import Models.CheckingAccount;
import Models.InvestmentAccount;
import Utils.GenerateRandom;

public class Main {
    public static void main(String[] args) {
        GenerateRandom generateRandom = new GenerateRandom();
        System.out.println(generateRandom.generateId());
    }
}
