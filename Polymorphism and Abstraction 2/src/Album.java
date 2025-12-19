import java.util.ArrayList;
import java.util.List;

public class Album {
    private String name;
    private double releaseYear;
    private List<Music> musics;

    public Album(String name, double releaseYear) {
        this.name = name;
        this.releaseYear = releaseYear;
        this.musics = new ArrayList<>();
    }
    public void addMusic(Music music) {
        musics.add(music);
    }
    public void removeMusic(Music music) {
        musics.remove(music);
    }
    public List<Music> getMusics() {
        return musics;
    }

    public void displayInfo() {
        System.out.println("album: " + name + " (" + releaseYear + ")");
        for (int i = 0; i < musics.size(); i++) {
            musics.get(i).displayInfo();
        }
    }
}
