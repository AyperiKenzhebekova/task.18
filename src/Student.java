public class Student {
    private String name;
    private String surname;
    private int age;
    private String address;

    void setName(String word){
        name=word;
    }
    void setAge(int number){
        if (number>0){
        age=number;
    }
        else{System.out.println("Student 0don kichine bolo albayt");}
    }
void setSurname(String word2){
        surname=word2;
}
void setAddress(String word3){
        address=word3;
}
public String getName(){
        return name;
}
public String getSurname(){
        return surname;
}
public int getAge(){
        return age;
}
 public String getAddress(){
        return address;
}
}
