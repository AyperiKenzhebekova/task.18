package Task1808;

public class Sedan extends Car{
    public Sedan(String model,String color,String maxSpeed) {
        //super(model,color,maxSpeed);
    }
    @Override
    public  void gas(){
        System.out.println(" Sedan makes gas");
    }
    @Override
    public void brake(){
        System.out.println(" Sedan makes brake");
    }
}
