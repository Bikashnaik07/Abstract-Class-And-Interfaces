abstract class Telephone {
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}
class SmartTelephone extends Telephone {
    @Override
    void ring() {
        System.out.println("SmartTelephone is ringing...");
    }
    @Override
    void lift() {
        System.out.println("Call is lifted on SmartTelephone.");
    }
    @Override
    void disconnect() {
        System.out.println("Call is disconnected on SmartTelephone.");
    }
}

public class QuesTelephone {
    public static void main(String[] args) {
        Telephone myPhone = new SmartTelephone();
        myPhone.ring();
        myPhone.lift();
        myPhone.disconnect();
    }
}
