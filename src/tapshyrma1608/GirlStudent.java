package tapshyrma1608;

public class GirlStudent extends Student{
    private String favSubject;
    private String teamMate;

    public GirlStudent(String name, int age, String schoolName, int grade, String favSubject, String teamMate) {
        super(name, age, schoolName, grade);
        this.favSubject = favSubject;
        this.teamMate= teamMate;
    }


    public void iLovetoDo(){
        System.out.println("I love to play a piano");
    }

    public String getFavSubject() {
        return favSubject;
    }

    public String getTeamMate() {
        return teamMate;
    }
}
