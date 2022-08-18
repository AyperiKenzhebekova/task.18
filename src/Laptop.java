public class Laptop {
    public int memory= 512;
    public String brand= "HP";
    public String color=" grey";
    public double weight= 1.50;
    public int ram= 8;
    public int price;

    @Override
    public String toString() {
        return "\n Laptop{" +
                "memory=" + memory +
                ", brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                ", ram=" + ram +
                ", price=" + price +
                '}';
    }
}
