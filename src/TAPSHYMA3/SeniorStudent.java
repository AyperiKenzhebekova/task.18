package TAPSHYMA3;

public class SeniorStudent extends Student {
    private String favoriteSubject;
    private int numberofClassmates;
    private int examMark;

    public SeniorStudent(String favoriteSubject, int numberofClassmates,int examMark){
        this.numberofClassmates=numberofClassmates;
        this.favoriteSubject=favoriteSubject;
        this.examMark=examMark;
    }
    public String getFavoriteSubject(){
        return favoriteSubject;
    }
    public int getNumberofClassmates(){
        return numberofClassmates;
    }
    public int getExamMark(){
        return examMark;
    }
}

