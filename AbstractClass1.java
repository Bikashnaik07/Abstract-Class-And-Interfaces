abstract class Phone1{
    abstract void on();
}
class SmartPhone1 extends Phone {
    void on() {
        System.out.println("Turning on...");
    }
public static void main(String [] args){
        Phone obj = new SmartPhone();
        obj.on();
    }
}  