import Task1.Child;
import Task2.Rectangle;
import Task3.ComplexNumb;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        System.out.println("\n");
        Child child1 = new Child("Mustafa", 6, new Date(2017, 4, 25));
        System.out.println(child1.getName() + " will be " + child1.futureAge(5) + " in five years");
        if (child1.isAdult(child1.getAge())) {
            System.out.println("The child is adult!");
        } else System.out.println("The child is not an adult! ");

        System.out.println("Task 2");
        System.out.println("\n");

        Rectangle rectangle1 = new Rectangle(3, 5);
        System.out.println("The circumference of rectangle is going to be " + rectangle1.getCircumference() + " and the area is " + rectangle1.getArea());
        if (rectangle1.isSquare()) {
            System.out.println("The rectangle is square!");
        } else System.out.println("The rectangle is not square! ");

        System.out.println("Task 3");
        System.out.println("\n");

        ComplexNumb complexNumb1 = new ComplexNumb(2, 4);
        ComplexNumb complexNumb2 = new ComplexNumb(1, 3);

        ComplexNumb complexNumb3 = complexNumb1.complexAdd(complexNumb2);
        System.out.println("The sum of numbers added is " + complexNumb3.getRealPart() + " + " + complexNumb3.getImaginaryPart() + "i");

        ComplexNumb complexNumb4 = complexNumb1.complexSubtract(complexNumb2);
        System.out.println("The subtract of numbers is " + complexNumb4.getRealPart() + " + " + complexNumb4.getImaginaryPart() + "i");

        complexNumb1.printComplex();
    }


}
