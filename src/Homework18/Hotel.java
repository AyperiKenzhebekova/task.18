package Homework18;

import java.util.Arrays;

public class Hotel implements RentPayable {
    private Person[] family;

    public Hotel(Person[] family){
        this.family=family;
    }
    @Override
    public void payRent(){
        System.out.println(" ---We pay for rent---");
    }

    public Person[] getFamily() {
        return family;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "family=" + Arrays.toString(family) +
                '}';
    }
}
