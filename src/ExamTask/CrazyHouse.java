package ExamTask;

public class CrazyHouse extends House{

    public CrazyHouse(int id, String name, String address, int price, int year) {
        super(id, name, address, price, year);
    }
    @Override
    public void city(){
        System.out.println(getAddress() + " shaarynda jashait");
    }@Override
    public void electricity(){
        System.out.println("Elektr togu ar bir adam "+ (150*8)+ " toloshu kerek ");
    }

    @Override
    public String toString() {
        return "CrazyHouse{"+"id="+getId()+", name='"+getName()+ '\'' +
                ", address='" + getAddress() + '\'' +
                ", price=" + getPrice() +
                ", year=" + getYear() +
                //  ",  +
                '}';
    }
}
