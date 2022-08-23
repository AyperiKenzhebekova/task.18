package Tasks;

public class Coffee {
    private String name;
    private String countryOfOrigin;
    private int amountOfCoffee;
    private int amountOfMilk;

      public void coffeeIsReady(){
         System.out.println("Sizdin coffee dayar!");
    }

     public void setName(String name) {
        this.name = name;
    }

     public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    public void setAmountOfCoffee(int amountOfCoffee) {
        this.amountOfCoffee = amountOfCoffee;
    }

  public  void setAmountOfMilk(int amountOfMilk) {
        this.amountOfMilk = amountOfMilk;
    }

    public String getName() {
        return name;
    }

     public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public int getAmountOfCoffee() {
        return amountOfCoffee;
    }

     public int getAmountOfMilk() {
        return amountOfMilk;
    }

    @Override
    public String toString() {
        return "Coffee{" +
                "name='" + name + '\'' +
                ", countryOfOrigin='" + countryOfOrigin + '\'' +
                ", amountOfCoffee=" + amountOfCoffee +
                ", amountOfMilk=" + amountOfMilk +
                '}';
    }
}


