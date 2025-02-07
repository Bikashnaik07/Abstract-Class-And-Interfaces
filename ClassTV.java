interface TVRemote{
    void buttons();
}
interface SmartTVRemote extends TVRemote{
    void screenTouch();
}
class Remote implements SmartTVRemote{
    public void buttons(){
        System.out.println("Have buttons");
    }
    public void screenTouch(){
        System.out.println("Have TouchScreen");
    }
}

public class ClassTV {
    public static void main(String[] args) {
        Remote obj =new Remote();
        obj.buttons();
        obj.screenTouch();
    }
}