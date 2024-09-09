package models;

public class Son extends Parents{
    public String name = "Pigs";

    public Son(String caste, String house, int bankBalance, String name) {
        super(caste, house, bankBalance);
        this.name = name;
    }
}
