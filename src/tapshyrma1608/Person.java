package tapshyrma1608;

public class Person {
    private String name;
    private int age;

     public Person(String name,int age){
         this.name=name;
         this.age=age;
     }
     public Person(){
     }
     public void iAmAble(){
         System.out.println(" I am person and I am able to walk");
     }



    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
