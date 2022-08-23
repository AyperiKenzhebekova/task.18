package Homework18;

public class Dormitory implements RentPayable {
    private Person[] family;

    public Dormitory(Person [] family){
        this.family=family;
    }
    public void payRent(){
        System.out.println("--- We live in dormitory and we pay for rent ---");
    }

    public Person[] getFamily() {
        return family;
    }

}
