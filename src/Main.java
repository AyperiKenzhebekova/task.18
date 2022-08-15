import org.w3c.dom.ls.LSOutput;
import task14.Dancer;
import task14.Person;
import task14.Programmer;
import task14.Singer;

import javax.crypto.spec.PSource;
import java.util.*;
import static java.util.Collections.reverse;
import static java.util.Collections.synchronizedCollection;

public class Main {
    public static void main(String[] args) {
        Person person1= new Person("Zulaika"," Manager");
        Programmer programmer= new Programmer("Amazon","Almaz","Fontend Dev");
        Dancer dancer= new Dancer("BlackPink","Rose","Dancer");
        Singer singer= new Singer("Pentatonix","Jessie","Singer");


        System.out.println(person1);
        person1.learn();
        person1.walk();
        person1.eat();
        System.out.println(programmer);
        programmer.code();
        System.out.println(dancer);
        dancer.dancing();
        System.out.println(singer);
        singer.singing();
        singer.playGuitar();


}
}

