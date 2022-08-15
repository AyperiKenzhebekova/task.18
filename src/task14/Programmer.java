package task14;

public class Programmer extends Person {
    private String companyName;

    public Programmer(String companyName, String name, String designation) {
        super(name, designation);
        this.companyName = companyName;

    }

    public void code() {
        System.out.println("I'm  a programmer and I code");
    }

    public void setCompanyName(String companyName) {

        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    @Override
    public String toString() {
        return "Programmer{" +"name='"+getName()+'\''+",designation="+getDesignation()+'\''+
                "companyName='" + companyName + '\'' +
                '}';
    }
}





