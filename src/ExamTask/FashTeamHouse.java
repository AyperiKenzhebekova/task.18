package ExamTask;

public class FashTeamHouse extends House {
    public FashTeamHouse(int id, String name, String address, int price, int year) {
        super(id, name, address, price, year);
    }
       @Override
    public void city(){
        System.out.println(getAddress() + " shaarynda jashait");
    }@Override
    public void electricity(){
        System.out.println("Elektr togu ar bir adam "+ (150*9)+ " toloshu kerek ");
    }

    @Override
    public String toString() {
        return "FashTeamHouse{"+"id="+getId()+", name='"+getName()+ '\'' +
                ", address='" + getAddress() + '\'' +
                ", price=" + getPrice() +
                ", year=" + getYear() +
                //  ",  +
                '}';
    }
}
