package Task2;

public class Rectangle {
    private double sideA;
    private double sideB;

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public void setSideA(double value) {
        this.sideA = value;
    }

    public void setSideB(double value) {
        this.sideB = value;
    }

    public double getSideA() {
        return this.sideA;
    }

    public double getSideB() {
        return this.sideB;
    }

    public double getCircumference() {
        return 2 * this.getSideA() + 2 * this.getSideB();
    }
    public double getArea() {
        return this.getSideA() * this.getSideB();
    }
    public boolean isSquare() {
       if (this.getSideA()==this.getSideB())
           return true;
       else return false;
    }
}
