package hw3;

public class Computer {
    private String country;
    private String brand;
    private double price;
    private boolean hasWarranty;

    public Computer(String country, String brand, boolean hasWarranty, double price) {
        this.country = country;
        this.brand = brand;
        this.hasWarranty = hasWarranty;
        this.price = price;
    }
    public void displayComputer(){
        System.out.println(country);
        System.out.println(brand);
        System.out.println(price);
        System.out.println(hasWarranty);
    }
    public class Monitor{
        private double diagonal;
        private String resolution;
        private double hertz;

        public Monitor(double diagonal, String resolution, double hertz) {
            this.diagonal = diagonal;
            this.resolution = resolution;
            this.hertz = hertz;
        }
        public void displayMonitor(){
            System.out.println(diagonal);
            System.out.println(resolution);
            System.out.println(hertz);
        }

    }
    public class Motherboard{
        private int ramSlots;
        private String ramType;
        private int fsbSpeed;

        public Motherboard(int ramSlots, String ramType, int fsbSpeed) {
            this.ramSlots = ramSlots;
            this.ramType = ramType;
            this.fsbSpeed = fsbSpeed;
        }
        public void displayMotherboard(){
            System.out.println(ramSlots);
            System.out.println(ramType);
            System.out.println(fsbSpeed);
        }
}   }

