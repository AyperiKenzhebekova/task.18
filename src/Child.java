public class Child  extends Person1{
    private String sadik;
    private String parentsName;

    public Child (String sadik, String parentsName,String name,int age,String gender){
        super();
        this.sadik= sadik;
        this.parentsName=parentsName;

    }
    public String getSadik(){
        return sadik;
    }
    public String getParentsName(){
        return parentsName;
    }

    @Override
    public String toString() {
        return "Child{" +
                "sadik='" + sadik + '\'' +
                ", parentsName='" + parentsName + '\'' +
               super.toString();
    }
}
