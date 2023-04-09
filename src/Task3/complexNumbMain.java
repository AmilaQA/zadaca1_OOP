package Task3;

public class complexNumbMain {
    public static void main(String[] args) {
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

