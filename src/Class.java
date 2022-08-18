public class Class {
    private int number;
    private String name;
    private int[] massive;


    public Class(int number, String name,int[]massive){
        this.name=name;
        this.number=number;
        this.massive=massive;

    }
    public int getNumber(){
        return number;
    }
    public String getName(){
        return name;
    }

    public int[] getMassive() {
        return massive;
    }
}
