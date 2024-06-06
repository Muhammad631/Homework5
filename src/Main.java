public class Main {
    public static void main(String[] args) {
        Car c = new BMW();
        c.start();
        c.stop();

        System.out.println("----------------------------");

        Car l = new Lexus();
        l.start();
        l.stop();

        System.out.println("----------------------------");
        System.out.println("----------------------------");
        Lexus lex = new Lexus();
        lex.stop();
        lex.start();
        lex.speed();
    }
}
interface Vehicle {
    void start();
}

interface Car extends Vehicle {
    default void stop() {
        System.out.println("Car Stopped");
    }
}
