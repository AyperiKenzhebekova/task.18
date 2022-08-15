package task14;

public class Dancer extends Person {
    private String groupName;

    public Dancer(String groupName,String name,String designation){
        super(name,designation);
        this.groupName=groupName;
    }
    public void dancing(){
        System.out.println("I'm a dancer and I dance");
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getGroupName() {
        return groupName;
    }

    @Override
    public String toString() {
        return "Dancer{" +"name='"+getName()+'\''+"designation='"+getDesignation()+'\''+
                "groupName='" + groupName + '\'' +
                '}';
    }
}
