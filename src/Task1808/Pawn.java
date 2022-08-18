package Task1808;

public class Pawn extends ChessItem {

    public Pawn(int x, int y, String color) {
        super(x, y,1, color);
    }
    @Override
    public  void draw(){
        super.draw();
    }
    @Override
    public void action(){
        System.out.println(" Pawn tuz ele jurot");
    }
}
