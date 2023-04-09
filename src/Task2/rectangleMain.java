package Task2;

public class rectangleMain {
    public static void main(String[] args) {
        System.out.println("Task 2");
        System.out.println("\n");

        Rectangle rectangle1 = new Rectangle(3, 5);
        System.out.println("The circumference of rectangle is going to be " + rectangle1.getCircumference() + " and the area is " + rectangle1.getArea());
        if (rectangle1.isSquare()) {
            System.out.println("The rectangle is square!");
        } else System.out.println("The rectangle is not square! ");
    }
}
