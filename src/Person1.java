public class Person1 {
    private String name;
    private int age;
    private  String gender;

    public Person1(String name, int age, String gender){
        this.name=name;
        this.age=age;
        this.gender=gender;
    }
     public Person1(){

     }
    public String getGender(){
        return gender;
    }

    @Override
    public String toString() {
        return "Person1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
