package TAPSHYMA3;

import java.util.Random;
import java.util.Scanner;

public class Student {
    private String name;
    private int age;
    private String hobby;
    private String gender;
    private String classTeacher;
    private double gpa;

    public Student(String name, int age, String hobby, String gender, String classTeacher,double gpa){
        Random random= new Random();
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.hobby=hobby;
        this.classTeacher=classTeacher;
        this.gpa= random.nextDouble(10,101);
    }
    public Student(){}
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getGender(){
        return gender;
    }
    public String getHobby(){
        return hobby;
    }
    public String getClassTeacher(){
        return classTeacher;
    }
    public double getGpa(){
        return gpa;
    }
}
