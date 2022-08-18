package tapshyrma1608;

public class Dancer {
    private String name;
    private int age;

    public Dancer(String name, int age){
        this.name=name;
        this.age=age;
    }
    public Dancer(){

    }
    public void dance(){
        System.out.println(" I am a dancer and I can dance");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Dancer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
