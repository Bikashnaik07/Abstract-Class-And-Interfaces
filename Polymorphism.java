import java.util.Arrays;
interface Interface1{
    default void Interface1meth1(){
        System.out.println("I'm a default method1 from Interface1");
        Interface1meth2();
    }
    private void Interface1meth2(){
        System.out.println("I'm a default method2 from Interface1");
    }
    void Interface1meth3();

    void Interface1meth4();
}
interface Interface2{
    String[] Interface2meth1();
    void Interface2meth2(String parameter);
}
class MainClass{
    void classMeth1(int parameter){
        System.out.println("I'm a normal method1 from MainClass with parameter:"+ parameter);
    }
    void classMeth2(){
        System.out.println("I'm a normal method1 from MainClass without parameter");
    }
}
class SubClass extends MainClass implements Interface1, Interface2{
    public void Interface1meth3(){
        System.out.println("I'm a abstract method3 from Interface1");
    }
    public void Interface1meth4(){
        System.out.println("I'm a abstract method4 from Interface1");
    }

    public String[] Interface2meth1(){
        String[] Interface2meth1={"yo","bo","ko","ro"};
        System.out.println("I'm an implemented Array of string method:"+Arrays.toString(Interface2meth1));
        return Interface2meth1;
    }
    public void Interface2meth2(String parameter){
        System.out.println("I'm a abstract method3 from Interface2 with parameter:"+parameter);
    }
}
public class Polymorphism {
    public static void main(String[] args) {
        SubClass obj=new SubClass();
        obj.Interface1meth1();
        obj.Interface1meth3();
        obj.Interface1meth4();
        obj.Interface2meth1();
        obj.Interface2meth2("ok");
        obj.classMeth1(34646);
        obj.classMeth2();
    }
}
