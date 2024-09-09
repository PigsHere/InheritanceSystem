package models;

public class Parents extends GrandParents{
    public String house;
    int bankBalance;

    public Parents(String caste,String house, int bankBalance) {
        super(caste);
        this.house = house;
        this.bankBalance = bankBalance;
    }
}
