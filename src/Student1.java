public class Student1 extends Person1 {
    private String school;
    private boolean relationship;

    public Student1(String school, Boolean relationship,String name,int age,String gender){
        super();
        this.school= school;
        this.relationship=relationship;
    }
    public String getSchool(){
        return school;
    }
    public Boolean getRelationship(){
        return relationship;
    }

    @Override
    public String toString() {
        return "Student1{" +
                "school='" + school + '\'' +
                ", relationship=" + relationship +
                super.toString();
    }
}
