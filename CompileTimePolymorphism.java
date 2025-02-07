class AddMethods{
    static int addMethod(int a, int b){
        return (a+b);
    }
    static int addMethod(int a, int b, int c){
        return (a+b+c);
    }
    static double addMethod(double a, double b){
        return (a+b);
    }
}

public class CompileTimePolymorphism {
    public static void main(String[] args) {
        System.out.println("Addition of two integers:"+AddMethods.addMethod(12,56));
        System.out.println("Addition of three integers:"+AddMethods.addMethod(23,6,8));
        System.out.println("addition of two decimal numbers:"+AddMethods.addMethod(23.5,45.3));
    }
}
