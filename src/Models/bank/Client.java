package Models.bank;

public class Client {
    private String name;
    private String id;
    private double incomePerMoth;

    public Client(String name, String id, double incomePerMoth) {
        this.name = name;
        this.id = id;
        this.incomePerMoth = incomePerMoth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getIncomePerMoth() {
        return incomePerMoth;
    }

    public void setIncomePerMoth(double incomePerMoth) {
        this.incomePerMoth = incomePerMoth;
    }

    @Override
    public String toString() {
        return "Customer{" +
            "name='" + name + '\'' +
            ", id='" + id + '\'' +
            ", incomePerMoth=" + incomePerMoth +
            '}';
    }
}
