public class Music extends Playable{
    private String title;
    private double duration;
    private String genre;

    public Music(String title, double duration, String genre) {
        this.title = title;
        this.duration = duration;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void play(){
        System.out.println("playing" + title);
    }
    public void stop(){
        System.out.println("stopped" + title);
    }

    public void displayInfo() {
        System.out.println("music: " + title + ", " + duration + " sec, Genre: " + genre);
    }
}
