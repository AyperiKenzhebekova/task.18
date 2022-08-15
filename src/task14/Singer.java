package task14;

public class Singer extends Person {
    private String bandName;

    public Singer(String bandName,String name, String designation){
        super(name,designation);
        this.bandName=bandName;
    }
    public void singing (){
        System.out.println("I'm singer and I sing jazz songs");
    }
    public void playGuitar(){
        System.out.println("I'm a singer and I play on a guitar");
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }

    public String getBandName() {
        return bandName;
    }

    @Override
    public String toString() {
        return "Singer{" +"name='"+getName()+'\''+"designation='"+getDesignation()+'\''+
                "bandName='" + bandName + '\'' +
                '}';
    }
}
