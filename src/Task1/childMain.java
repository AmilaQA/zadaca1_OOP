package Task1;

import java.util.Date;

public class childMain {
    public static void main(String[] args) {
        System.out.println("Task 1");
        System.out.println("\n");
        Child child1 = new Child("Mustafa", 6, new Date(2017, 4, 25));
        System.out.println(child1.getName() + " will be " + child1.futureAge(5) + " in five years");
        if (child1.isAdult(child1.getAge())) {
            System.out.println("The child is adult!");
        } else System.out.println("The child is not an adult! ");

    }
}
