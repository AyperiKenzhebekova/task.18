package Task1808;

public class Minivan extends Car{
    public Minivan(String color, String model, String maxSpeed) {
        //super(model,color,maxSpeed);

    }
    @Override
    public void gas(){
        System.out.println(" Minivan askes gas");
    }
    @Override
    public void brake(){
        System.out.println("Mini");
    }

}
