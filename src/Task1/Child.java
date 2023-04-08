package Task1;

import java.util.Date;

public class Child { // naziv klase

    private String name; // atributi
    private int age;
    private double weight;
    private Date dateOfBirth;

public Child(String name, int age, Date dateOfBirth) { // prvi konstruktor
this.name = name;
this.age = age;
this.dateOfBirth = dateOfBirth;
}
public Child () { // drugi konstruktor - prazan konstruktor

}
public void setName() { // setter
    this.name = name;
}
public void setWeight() {
    this.weight = weight;
}
public void setAge() {
    this.age = age;
}
public void setDateOfBirth() {
    this.dateOfBirth = dateOfBirth;
}
public String getName() {return name;} // getteri
    public int getAge() {return age;}
    public double getWeight() {return weight;}
    public Date getDateOfBirth() {return dateOfBirth;}

    public int futureAge (int numb) {
    return (numb + this.getAge());
    }
    public boolean isAdult(int age) {
    if(age>=18)
        return true;
    else return false;
    }

 //   public Task1.Child(String name, int age, double weight, Date dateOfBirth) { // treci konstruktor
 //       this.name = name;
 //       this.age = age;
 //       this.weight = weight;
 //       this.dateOfBirth = dateOfBirth;
            }


