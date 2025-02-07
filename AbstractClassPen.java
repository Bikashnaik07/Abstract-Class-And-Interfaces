abstract class Pen{
    abstract void  write();
    abstract void refill();
}
class fountainPen extends Pen{
    public void changeNib(){
        System.out.println("I'm method change Nib");
    }
    public void write(){
        System.out.println("I'm method write");
    }
    public void refill(){
        System.out.println("I'm method refill");
    }
}
public class AbstractClassPen {
    public static void main(String[] args) {
        fountainPen obj=new fountainPen();
        obj.changeNib();
        obj.write();
        obj.refill();
    }
}
