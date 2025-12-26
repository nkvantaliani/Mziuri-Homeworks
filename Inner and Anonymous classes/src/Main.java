import hw1.University;
import hw2.Car;
import hw3.Computer;
import hw4.Notification;
import hw5.Library;
public class Main {
    public static void main(String[] args) {
        University uni = new University("Free uni", false, 9);
        University.Student student = uni.new Student("nata", "kvata",16,93.2,"00000000000",2);
        uni.display();
        student.displayStudent();

        Car[] cars = new Car[3];
        Car.Engine[] engines = new Car.Engine[3];
        cars[0] = new Car("ar vici", "mankana", "AB-000-BC");
        engines[0] = cars[0].new Engine("hmmm", 4, 1500);
        cars[1] = new Car("ar vici", "mankana", "AB-000-BC");
        engines[1] = cars[1].new Engine("hmmm", 4, 1500);
        cars[2] = new Car("ar vici", "mankana", "AB-000-BC");
        engines[2] = cars[2].new Engine("hmmm", 4, 100000);

        Car maxCar = cars[0];
        Car.Engine maxEngine = engines[0];

        for (int i = 1; i < engines.length; i++) {
            if (engines[i].getResource() > maxEngine.getResource())  {
                maxEngine = engines[i];
                maxCar = cars[i];
            }
        }
        maxCar.displayCar();
        maxEngine.displayEngine();

        Computer computer = new Computer("china", "lenovo",true,3000);
        Computer.Monitor monitor = computer.new Monitor(24, "1920x1080", 160);
        Computer.Motherboard motherboard = computer.new Motherboard(4, "DDR4", 3200);
        computer.displayComputer();
        monitor.displayMonitor();
        motherboard.displayMotherboard();


        Notification sms = new Notification("Nata", "Mimi", "Hi") {
            @Override
            public void send() {
                System.out.println("sender" + sender);
                System.out.println("receiver: " + receiver);
                System.out.println("message: " + message);
            }

            @Override
            public void receive() {
                System.out.println("receiver: " + receiver);
            }
        };
        sms.send();
        sms.receive();

        Library library = new Library(1, "Library");
        library.printInfo();
    }

}
