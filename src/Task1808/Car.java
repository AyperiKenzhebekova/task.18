package Task1808;

public abstract class Car {
    private String model;
    private String color;
    private String maxSpeed;



    public void Car(String model,String color, String maxSpeed) {
        this.model = model;
        this. color=color;
        this.maxSpeed=maxSpeed;
    }


    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public String getMaxSpeed() {
        return maxSpeed;
    }
    public  abstract void gas();
    public abstract void brake();
}
