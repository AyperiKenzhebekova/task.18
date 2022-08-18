package tapshyrma1608;

public class BoyStudent extends Student {
    private String hobby;
    private String phobia;

    public BoyStudent(String name, int age, String schoolName, int grade, String hobby, String phobia) {
        super(name, age, schoolName, grade);
        this.hobby = hobby;
        this.phobia=phobia;
    }
    public void iHatetoDo(){
        System.out.println("I hate reading books");
    }

    public String getHobby() {
        return hobby;
    }

    public String getPhobia() {
        return phobia;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public void setPhobia(String phobia) {
        this.phobia = phobia;
    }
}
