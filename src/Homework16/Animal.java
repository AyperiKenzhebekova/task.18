package Homework16;

public class Animal {

    public String animal(){
        return " I'm an animal";
    }

    @Override
    public String toString() {
        Class c = getClass();
        return c.toString();
    }
}
