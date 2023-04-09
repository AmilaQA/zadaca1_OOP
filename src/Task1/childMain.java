package Task1;

import java.util.Date;

public class childMain {
    public static void main(String[] args) {
        System.out.println("Task 1");
        System.out.println("\n");
        Child child1 = new Child("Mustafa", 6, new Date(2017, 4, 25)); // kreiranje novog djeteta npr u tabeli
        System.out.println(child1.getName() + " will be " + child1.futureAge(5) + " in five years"); //pozivanje funkcije iz child calsse za racunanje future age
        if (child1.isAdult(child1.getAge())) { // pozivanje funkcije za punoljetnost
            System.out.println("The child is adult!");
        } else System.out.println("The child is not an adult! ");

    }
}
