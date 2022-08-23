package Homework18;

import java.util.Arrays;

public class Flat implements UtilityPayable {
    private Person [] family;

    public Flat(Person [] family){
        this.family=family;
    }

    public Person[] getFamily() {
        return family;
    }

    @Override
    public void payUtilities() {
        System.out.println("---We pay for utilities---");
    }

    @Override
    public String toString() {
        return "Flat{" +
                "family=" + Arrays.toString(family) +
                '}';
    }
}
