import java.util.ArrayList;
import java.util.List;

public class Artist {
    private String name;
    private List<Album> albums;
    private List<Music> songs;

    public Artist(String name) {
        this.name = name;
        this.albums = new ArrayList<>();
        this.songs = new ArrayList<>();
    }
    public void addAlbum(Album album) {
        albums.add(album);
        songs.addAll(album.getMusics());
    }

    public void removeAlbum(Album album) {
        albums.remove(album);
        songs.removeAll(album.getMusics());
    }

    public List<Album> getAlbums() {
        return albums;
    }

    public List<Music> getSongs() {
        return songs;
    }

    public void displayInfo() {
        System.out.println("artist: " + name);
        for (int i = 0; i < albums.size(); i++) {
            albums.get(i).displayInfo();
        }
    }
}
