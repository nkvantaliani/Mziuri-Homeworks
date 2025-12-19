import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MusicLibrary {
    private List<Artist> artists;
    private List<Album> albums;
    private List<Music> songs;

    public MusicLibrary() {
        this.artists = new ArrayList<>();
        this.albums = new ArrayList<>();
        this.songs = new ArrayList<>();
    }
    public void addArtist(Artist artist) {
        artists.add(artist);
        albums.addAll(artist.getAlbums());
        songs.addAll(artist.getSongs());
    }
    public void addAlbum(Album album) {
        albums.add(album);
        songs.addAll(album.getMusics());
    }

    public void addSong(Music music) {
        songs.add(music);
    }
    public Music searchMusic(String title) {
        for (int i = 0; i < songs.size(); i++) {
            Music m = songs.get(i);
            if (m.getTitle().equalsIgnoreCase(title)) {
                return m;
            }
        }
        return null;
    }
    public Music giveRandomMusic() {
        if (songs.isEmpty()) {
            return null;
        }

        Random rand = new Random();
        int index = rand.nextInt(songs.size());

        for (int i = 0; i < songs.size(); i++) {
            if (i == index) {
                return songs.get(i);
            }
        }
        return null;
    }

    public void displayInfo() {
        for (int i = 0; i < artists.size(); i++) {
            artists.get(i).displayInfo();
        }
    }
}
