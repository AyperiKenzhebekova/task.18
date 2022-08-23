import Homework18.Dormitory;
import Homework18.Flat;
import Homework18.Hotel;
import Homework18.Person;


public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Nuraiym");
        Person person2 = new Person("Nuris");
        Person person3 = new Person("Zhazgul");
        Person person4 = new Person("Bakai");
        Person person5 = new Person("Aliya");
        Person person6 = new Person("Syimyk");
        Person person7 = new Person("Aidana");
        Person person8 = new Person("Adilet");

        Person[] familyinFlat = {person1, person2, person3};
        Person[] familyinDormitory = {person4, person5, person6};
        Person[] familyinHotel = {person7, person8};

        Flat flat= new Flat(familyinFlat);
        Dormitory dormitory= new Dormitory(familyinDormitory);
        Hotel hotel= new Hotel(familyinDormitory);


        System.out.println("Number of Dormitory residents: " + familyinDormitory.length);
        dormitory.payRent();
        for (Person i : familyinDormitory) {
            System.out.println(i.getName());
        }
        System.out.println("Number of people who live in flat: " + familyinFlat.length);
        flat.payUtilities();
        for (Person i : familyinFlat) {
            System.out.println(i.getName());
        }
        System.out.println("Number of people who live in the hotel: " + familyinHotel.length);
        hotel.payRent();
        for (Person i : familyinHotel) {
            System.out.println(i.getName());

        }


    }
}


















