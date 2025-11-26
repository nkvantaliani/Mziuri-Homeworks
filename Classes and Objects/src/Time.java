public class Time {
    int hours;
    int minutes;
    int seconds;

    Time(int hours, int minutes, int seconds){
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    void displayTime(){
        System.out.println(hours + ":" +minutes +":" + seconds);
    }
}
