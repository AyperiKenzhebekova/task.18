package TAPSHYMA3;

public class School {
    private String city;
    private String  school;
    private int yearOfFoundation;
    private String principalsName;
    private int numberOfTeachers;
    private Student[]student= new Student[70];

    public School(String city, String school, String principalsName, int yearOfFoundation, int numberOfTeachers,int[]student){
        this.city= city;
        this.school=school;
        this.principalsName=principalsName;
        this.numberOfTeachers=numberOfTeachers;
        this.yearOfFoundation=yearOfFoundation;
        this.student= new Student[70];
    }
    public String getCity() {
        return city;
    }
    public String getSchool(){
        return school;
    }
    public String getPrincipalsName(){
        return principalsName;
    }
    public int getYearOfFoundation(){
        return yearOfFoundation;
    }
    public int getNumberOfTeachers(){
        return numberOfTeachers;
    }
}
