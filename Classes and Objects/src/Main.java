public class Main {
    public static void main(String[] args) {
        Book obj = new Book("unknown title", "unknown author", 1);
        obj.displayBookInfo();

        Rectangle recObj = new Rectangle(3,4);
        System.out.println(recObj.perimeter());
        System.out.println(recObj.area());
        System.out.println(recObj.diagonal());
        System.out.println(recObj.isSquare());

        Time timeObj = new Time(2,34,24);
        timeObj.displayTime();
    }
}