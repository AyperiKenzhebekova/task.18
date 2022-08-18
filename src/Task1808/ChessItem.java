package Task1808;

public abstract class ChessItem {
    private int x;
    public int y;
    public String color;
    public int value;

    public ChessItem(int x,int y,int value,String color) {
        this.x = x;
        this.y=y;
        this.color=color;
        this.value=value;
    }

    public  void draw(){
        System.out.println("x= "+getX());
        System.out.println("y= "+getY());
        System.out.println("value= "+getValue());
        System.out.println("color= "+ getColor());

    }
    public  void action(){

    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getColor() {
        return color;
    }

    public int getValue() {
        return value;
    }
}
