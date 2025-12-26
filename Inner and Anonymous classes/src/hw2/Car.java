package hw2;

public class Car {
    private String maker;
    private String model;
    private String licensePlate;

    public Car(String maker, String model, String licensePlate) {
        this.maker = maker;
        this.model = model;
        this.licensePlate = licensePlate;
    }
    public void displayCar(){
        System.out.println(maker);
        System.out.println(model);
        System.out.println(licensePlate);
    }
    public class Engine{
        private String fuelType;
        private int cylinderCount;
        private int resource;

        public Engine(String fuelType, int cylinderCount, int resource) {
            this.fuelType = fuelType;
            this.cylinderCount = cylinderCount;
            this.resource = resource;
        }

        public int getResource() {
            return resource;
        }

        public void displayEngine(){
            System.out.println(fuelType);
            System.out.println(cylinderCount);
            System.out.println(resource);

        }
    }
}
