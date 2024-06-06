public class BMW implements Car {
    @Override
    public void start() {
        System.out.println("BMW Car Started");
    }

    @Override
    public void stop() {
        System.out.println("BMW Car Stopped");
    }
}