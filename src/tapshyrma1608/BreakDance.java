package tapshyrma1608;

public class BreakDance extends  Dancer{
    public BreakDance(String name, int age) {
        super(name, age);
    }

    @Override
    public void dance(){
        System.out.println(" I am break dancer and I can dance break dances");
    }
}
