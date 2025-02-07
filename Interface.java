// Interface to define general bicycle actions
interface Bicycle {
    int MAX_SPEED = 50;  // constant representing the max speed of a bicycle
    void reduceSpeed(int amount);  // abstract method for slowing down
    void increaseSpeed(int amount);  // abstract method for speeding up
}

// Interface to define horn sounds for bicycles
interface HornSystem {
    void honkCheerful();  // abstract method for cheerful honk
    void honkWarning();   // abstract method for warning honk
}

// Class ElectricCycle implementing both Bicycle and HornSystem interfaces
class ElectricCycle implements Bicycle, HornSystem {
    // Custom method for this class, not part of any interface
    void displayModel() {
        System.out.println("Electric Cycle Model: EcoSpeed 3000");
    }

    // Implementing the reduceSpeed method from the Bicycle interface
    public void reduceSpeed(int amount) {
        System.out.println("Slowing down by " + amount + " km/h.");
    }

    // Implementing the increaseSpeed method from the Bicycle interface
    public void increaseSpeed(int amount) {
        System.out.println("Speeding up by " + amount + " km/h.");
    }

    // Implementing the honkCheerful method from the HornSystem interface
    public void honkCheerful() {
        System.out.println("Beep Beep! Have a great day!");
    }

    // Implementing the honkWarning method from the HornSystem interface
    public void honkWarning() {
        System.out.println("Honk Honk! Watch out!");
    }
}

public class Interface {
    public static void main(String[] args) {
        ElectricCycle myCycle = new ElectricCycle();

        // Using the implemented methods from Bicycle and HornSystem interfaces
        myCycle.reduceSpeed(15);
        myCycle.increaseSpeed(25);

        // Accessing constant from the Bicycle interface
        System.out.println("Maximum allowed speed: " + Bicycle.MAX_SPEED + " km/h");

        // Calling horn methods implemented from HornSystem interface
        myCycle.honkCheerful();
        myCycle.honkWarning();

        // Additional functionality specific to ElectricCycle class
        myCycle.displayModel();
    }
}
