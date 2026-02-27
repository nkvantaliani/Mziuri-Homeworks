package Hw3;

public class Engine {
    private String type;
    private int cylinders;
    private double volume;

    public Engine(String type, int cylinders, double volume) {
        this.type = type;
        this.cylinders = cylinders;
        this.volume = volume;
    }

    public String getType() {
        return type;
    }

    public int getCylinders() {
        return cylinders;
    }

    public double getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", cylinders=" + cylinders +
                ", volume=" + volume +
                '}';
    }
}
