import Homework16.Animal;
import Homework16.Eagle;
import Homework16.Shark;
import Homework16.Turtle;
import Task1808.*;
import org.w3c.dom.ls.LSOutput;
import tapshyrma1608.*;
import tapshyrma1608.Person;
import tapshyrma1608.Student;
import task14.Programmer;
import task14.Singer;

import javax.crypto.spec.PSource;
import java.util.*;
import static java.util.Collections.reverse;
import static java.util.Collections.synchronizedCollection;

public class Main {
    public static void main(String[] args) {

        //ChessItem[] chessItems = new ChessItem[10];
        Pawn pawn1= new Pawn(2,1,"White");
        Pawn pawn2= new Pawn(2,3,"White");
        Bishop bishop1= new Bishop(1,3,"White");
        Bishop bishop2= new Bishop(1,6,"White");
        Knight knight1= new Knight(1,2,"White");
        Knight knight2= new Knight(1,7,"White");
        Rook rook1 = new Rook(1,1,"White");
        Rook rook2 = new Rook(1,8,"White");
        Queen queen1= new Queen(1,5,"White");
        King king1 = new King(1,4,"White");


        Pawn pawn3= new Pawn(7,1,"black");
        Pawn pawn4= new Pawn(7,8,"black");
        Bishop bishop3= new Bishop(8,2,"black");
        Bishop bishop4= new Bishop(8,7,"black");
        Knight knight3= new Knight(8,2,"black");
        Knight knight4= new Knight(8,7,"black");
        Rook rook3 = new Rook(8,1,"black");
        Rook rook4 = new Rook(8,8,"black");
        Queen queen2= new Queen(8,4,"black");
        King king3 = new King(8,5,"black");

        ChessItem [] chessItems= {pawn1,pawn2,pawn3,pawn4,bishop1,bishop2,bishop3,bishop4,
                knight1,knight2,knight3,knight4,king1,king3,queen1,queen2,rook1,rook2,rook3,rook4};

        //printAction(chessItems);



}
public static void  method2 (ChessItem[] chessItems){
    for (ChessItem i: chessItems ) {
        if (i.getColor().equals("White")){
            i.draw();
            System.out.println("---------------------------------------");
        }

    }

}
public static void method1(ChessItem[] chessItems){
    for ( ChessItem i : chessItems ) {
        if (!(i instanceof King)){
            i.draw();
            System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
        }

    }
}
public static void method3(ChessItem[] chessItems){
    for ( ChessItem i:chessItems ) {
        if ( i.getX()==1){
            i.draw();
            System.out.println("----------*****----------");
        }


    }
}
public static void printAction(ChessItem[] chessItems){
    for ( ChessItem i: chessItems) {
        if (i.getColor().equals("White")){
            i.action();
            System.out.println("--------*****-------");
        }

    }
}
}

