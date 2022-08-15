package task14;

public class Person {
    private String name;
    private String designation;

    public Person(String name, String designation){
        this.name=name;
        this.designation=designation;
    }
    public Person(){

    }
    public  void learn(){
        System.out.println("I'm a person and I'm learn");
    }
    public void eat(){
        System.out.println("I'm a person and I eat");
    }
    public void walk(){
        System.out.println("I'm a person and I walk");
    }

    public String getName() {
        return name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                '}';
    }
}
