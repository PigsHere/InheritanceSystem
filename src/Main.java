import models.Parents;
import models.Son;

public class Main {
    public static void main(String[] args){

        Parents p = new Parents("Here","Royal Manor",5000000);

        System.out.println(p.caste);

        Son s = new Son("Here","Royal Manor",5000000, "Pigs");

        System.out.println(s.name + s.caste);
    }
}