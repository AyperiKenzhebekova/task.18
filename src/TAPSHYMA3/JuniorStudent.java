package TAPSHYMA3;

public class JuniorStudent extends Student {
    private String levelofknowledge;
    private  String character;

    public JuniorStudent(String levelofknowledge, String character){
        super();
        this.levelofknowledge=levelofknowledge;
        this.character=character;

    }
    public String getLevelofknowledge(){
        return levelofknowledge;
    }
    public String getCharacter(){
        return character;
    }

}
