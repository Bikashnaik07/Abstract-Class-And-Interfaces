class Monkey{
    public void jump(){
        System.out.println("jump");
    }
    public void bite(){
        System.out.println("bite");
    }
}
interface BasicAnimal{
    void eat();
    void sleep();
}
class Human extends Monkey implements BasicAnimal{
    public void eat(){
        System.out.println("eat");
    }
    public void sleep(){
        System.out.println("sleep");
    }
}

public class ClassMonkey {
    public static void main(String[] args) {
        Monkey obj = new Human();
        obj.jump();
        obj.bite();
        BasicAnimal obj1=new Human();
        obj1.eat();
        obj1.sleep();
    }
}
