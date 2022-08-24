import ExamTask.*;
import ExamTask.Person;
import Homework18.Dormitory;
import Homework18.Flat;
import Homework18.Hotel;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Person person1= new Person(12345,"Nuris","Bakytov","@bakytov",16,"+9961236458");
        Person person2= new Person(12234,"Aidai","Almazova","@aidaiaidai",24,"+996589615");
        Person person3= new Person(487965,"Almaz","Bakytov","@almaz01",21,"+99698745632");
        Person person4= new Person(147856,"Nuray","Sadykova","@nn0125",14,"+9962314569");
        Person person5= new Person(456987,"Daniyar","Usonov","@daniyar25",16,"+996521345");
        Person person6= new Person(458932,"Asan","Abylov","@asan78",36,"+996589321");
        Person person7= new Person(78965,"Eldiyar","Asanov","@elddd5",17,"+996589647");
        Person person8= new Person(123654,"Argen","Abdymomunov","@argen47",18,"+996584712");
        Person person9= new Person(789654,"Aidana","Almazova","@aaaa89",75,"+996563214");
        Person person10= new Person(789651,"Bektur","Almazov","@nurs9",15,"+996563214");
        Person person11= new Person(789652,"Beka","Almazov","@nurs8",18,"+9965636214");
        Person person12= new Person(789653,"Nargiza","Almazov","@nurs7",74,"+996563214");
        Person person13= new Person(789655,"Nuriza","Almazova","@nurs6",36,"+9965639214");
        Person person14= new Person(789656,"Bakyt","Almazov","@nurs5",12,"+996563214");
        Person person15= new Person(789657,"Altynbek","Almazov","@nurs4",35,"+996563214");
        Person person16= new Person(789658,"Meerim","Almazov","@nurs3",47,"+9965632884");
        Person person17= new Person(789659,"Meka","Bekturova","@nurs2",25,"+996563214");
        Person person18= new Person(7896510,"Lola","Saitova","@nurs1",15,"+996563214");
        Person person19= new Person(7896511,"Kanat","Almazov","@nurs00",55,"+996563214");
        Person person20= new Person(789645,"Aslan","Alymov","@nurs01",13,"+996563214");
        Person person21= new Person(7896889,"jake","Janybekov","@nurs02",48,"+996563214");
        Person person22= new Person(789678,"Nuur","Alimova","@nurs03",18,"+996563218");
        Person person23= new Person(78962,"Marina","lll","@nurs04",14,"+9965632194");
        Person person24= new Person(78965,"Andrei","Petrov","@nurs05",18,"+996563214");
        Person person25= new Person(789645,"Askar","Aibekov","@nurs06",96,"+996563414");
        Person person26= new Person(78968,"Arlen","ALimov","@nurs07",47,"+996563214");
        Person person27= new Person(78964,"Bakyt","Sadykov","@nurs08",35,"+9965635214");
        Person person28= new Person(7896894,"Mairam","Eje","@nurs809",25,"+996563214");
        Person person29= new Person(7896784,"Naari","Maripova","@nari45",19,"+9964563214");
        Person person30= new Person(789894,"Nuri","eldiyarov","@nuri478",26,"+996563214");



        House crazyHouse= new CrazyHouse(12345,"Elitehouse","Bishkek",80000,2018);
        House fashTeamHouse= new FashTeamHouse(456887,"Baitash","Karakol",200000,2021);
        House starHouse= new StarHouse(89563,"Asman","Tokmok",2019,2013);
        House vipHouse= new VipHouse(14789,"Sk","Osh",890000,2021);

        /*Person.work();
        Person.timetable();
        Person.work();
        Person.timetable();
        Person.work();
        Person.timetable();*/


       Person[] crazyHouses= {person1, person2, person3, person4, person5, person6, person7,person8};
       Person[] starHouses={person9,person10,person11,person12,person13,person14,person15,person16};
       Person[] fashTeamHouses={person17,person18,person19,person20,person21,person22,person23,person24,person25};
       Person[] vipHouses={person26,person27,person28,person29,person30};

        System.out.println(" -----VIP House---- ");
        for (Person i: vipHouses) {
            System.out.println(i);
        }
        System.out.println(vipHouse);
       System.out.println("Adamdardyn sany : "+vipHouses.length);
       vipHouse.electricity();
       vipHouse.city();

        System.out.println("---FashTeamHouse---");
        for (Person i: fashTeamHouses) {
            System.out.println(i);
        }
        System.out.println("Adamdardyn sany : "+fashTeamHouses.length);
        fashTeamHouse.city();
        fashTeamHouse.electricity();

        System.out.println("---Star House---");
        for (Person i: starHouses) {
            System.out.println(i);
        }
        System.out.println(starHouse);
        System.out.println("Adamdardyn sany: "+starHouses.length);
        starHouse.city();
        starHouse.electricity();

        System.out.println("---Crazy House---");
        for (Person i:crazyHouses) {
            System.out.println(i);
        }
        System.out.println("Adamdardyn sany: "+crazyHouses.length);
        crazyHouse.city();
        crazyHouse.electricity();







    }
}


















