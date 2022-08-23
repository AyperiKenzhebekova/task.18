package interfacee;

public interface Walkable {
    public static final String word= "Hello world";

    public abstract void walk();

    public default void method(){
        System.out.println(word);
    }
     public static void fuu(){
         System.out.println("Java 7");
     }
}
