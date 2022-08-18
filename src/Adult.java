public class Adult extends Person1 {
     private int numberOfChild;
     private boolean marriage;
     private int salary;

     public Adult(int numberOfChild, boolean marriage, int salary,String name,int age,String gender){
         super();
         this.numberOfChild=numberOfChild;
         this.salary=salary;
         this.marriage= marriage;
     }

    public int getNumberOfChild() {
        return numberOfChild;
    }
    public boolean getMarriage(){
         return marriage;
    }

    public int getSalary(){
         return salary;
    }

    @Override
    public String toString() {
        return "Adult{" +
                "numberOfChild=" + numberOfChild +
                ", marriage=" + marriage +
                ", salary=" + salary + super.toString();

    }
}
