public class Lexus implements Car {
    @Override
    public void start() {
        System.out.println("Lexus Car Stopped");
    }

    @Override
    public void stop() {
        System.out.println("Lexus Car Stopped");
    }

    public void speed() {
        System.out.println("Lexus Car Speed 250mph");
    }
}