package ExamTask;

import java.util.Arrays;

public abstract class House {
    private int id;
    private String name;
    private String address;
    private int price;
    private int year;


    public House(int id,String name,String address,int price,int year ) {
        this.id = id;
        this.price=price;
        this.address=address;
        this.name=name;

    }

    public void city(){
        System.out.println(address+ "shaarynda jashait");
    }
    public void electricity(){
        System.out.println("Elektr togu ar bir adam "+(150*5)+"toloshu kerek ");
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        if ((name.contains("r,o,b,m,w,h"))){
        this.name = name;
        }else{
            System.out.println(" Ui kabyl alynbait bizdin shart boyouncha");
        }

    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPrice(int price) {
        if (price>70000){
        this.price = price;
        }else{
            System.out.println("baasy tuura kelbeit");
        }
    }

    public void setYear(int year) {
        if(year<2015){
        this.year = year;
        }else{
            System.out.println("Sizdin uiunuz eski");
        }
    }

    //public void setPersons(Person[] persons) {
       // this.persons = persons;
    //}

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getPrice() {
        return price;
    }

    public int getYear() {
        return year;
    }



    @Override
    public String toString() {
        return "House{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", price=" + price +
                ", year=" + year +
              //  ",  +
                '}';
    }
}
