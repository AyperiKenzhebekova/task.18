public class Dog {
    private String name;
    private int age;
    private String color;
    private String gender;
    void setName(String name){
        this.name=name;
    }
    String getName(){
        return name;
    }
    void setAge (int age){
        this.age=age;
    }
    int getAge(){
        return age;
    }
    void setColor(String color){
        this.color=color;
    }
    String getColor(){
        return color;
    }
    void setGender(String gender){
        this.gender=gender;
    }
    String getGender(){
        return gender;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
