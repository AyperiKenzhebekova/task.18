public class Person {

    public String name ;
    public int age;
    public double weight;
    public String citizenship;
    public Laptop laptop= new Laptop();

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", citizenship='" + citizenship + '\'' +
                ", laptop=" + laptop +
                '}';
    }
}
