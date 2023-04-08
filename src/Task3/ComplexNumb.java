package Task3;

public class ComplexNumb {
    private int realPart;
    private int imaginaryPart;

    public ComplexNumb() {

    }

    public ComplexNumb(int realPart, int imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public void setRealPart(int realPart) {
        this.realPart = realPart;
    }

    public void setImaginaryPart(int imaginaryPart) {
        this.imaginaryPart = imaginaryPart;
    }

    public int getRealPart() {
        return this.realPart;
    }

    public int getImaginaryPart() {
        return this.imaginaryPart;
    }

    public int Re() {
        return this.getRealPart();
    }

    public int Im() {
        return this.getImaginaryPart();
    }

    public ComplexNumb complexAdd(ComplexNumb z1) {
        return new ComplexNumb(this.realPart + z1.realPart, this.imaginaryPart + z1.imaginaryPart);
    }

    public ComplexNumb complexSubtract(ComplexNumb z1) {
        return new ComplexNumb(this.realPart - z1.realPart, this.imaginaryPart - z1.imaginaryPart);
    }

    public void printComplex() {
        if (this.getRealPart() != 0 && this.getImaginaryPart() == 0) {
            System.out.println(this.getRealPart());
        } else if (this.getRealPart() == 0 && this.getImaginaryPart() != 0) {
            System.out.println(this.getImaginaryPart());
        } else if (this.getRealPart() == 0 && this.getImaginaryPart() == 0) {
            System.out.println("0");
        }
        else System.out.println(this.getRealPart() + " + " + this.getImaginaryPart() + "i");
    }

}
