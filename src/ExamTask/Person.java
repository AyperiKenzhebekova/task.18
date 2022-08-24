package ExamTask;

import java.util.Scanner;

public class Person  {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private int age;
    private String phoneNumber;


    public Person(int id,String firstName,String lastName,String email,int age,String phoneNumber) {
        this.id = id;
        this.firstName=firstName;
        this.lastName=lastName;
        this.email=email;
        this.age=age;
        this.phoneNumber=phoneNumber;
    }

    public static void work( ) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("At jazynyz:");
        String name = scanner.nextLine();
        if (name == scanner.nextLine()) {
            timetable();}
     }
    public static void  timetable(){
        Scanner scanner1= new Scanner(System.in);
        System.out.println("San beriniz ");
        int san= scanner1.nextInt();
        if(san ==1 ){
            System.out.println(" Monday kunu Bankta  ishteit");
        }else if(san==2){
            System.out.println(" Tuesday kunu magazinde ishteit");
        } else if (san==3) {
            System.out.println("Wednesday kunu 5ke cheyin univerde ishteit");
        } else if (san ==4) {
            System.out.println("Thursday kunu 7ge magazinde cheyin ishteit");
        } else if (san==5) {
            System.out.println("Friday kunu bazarda ishteit");
        } else if (san==6) {
            System.out.println("Saturday kunu  es alat");
        } else if (san==7) {
            System.out.println("Sunday kunu es alat");
        }else {
            System.out.println("Myndai kun jok");
        }

    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        if (email.startsWith("@")){
        this.email = email;
    }else {
            System.out.println("@ жок кайрадан текшериниз");
    }
   }

    public void setAge(int age) {
        if (age > 0 && age < 110) {
            this.age = age;
        } else {
            System.out.println(" Ters san beruugo jana jok jash beruugo bolboit");
        }
    }
    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber.startsWith("+996")){
        this.phoneNumber = phoneNumber;}
        else {
            System.out.println("Kyrgyz nomerin beriniz");}
    }


    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
