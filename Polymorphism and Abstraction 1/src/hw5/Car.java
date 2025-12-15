package hw5;

public class Car implements Moves,Turns{

    @Override
    public void start() {
        System.out.println("car started");
    }

    @Override
    public void stop() {
        System.out.println("car stopped");
    }

    @Override
    public void left() {
        System.out.println("car turned left");
    }

    @Override
    public void right() {
        System.out.println("car turned right");
    }
}
