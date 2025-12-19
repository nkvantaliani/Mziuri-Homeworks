public class Main {
    public static void main(String[] args) {

        Music m1 = new Music("Nights", 300, "pop");
        Music m2 = new Music("Ivy", 320, "pop");

        Album album1 = new Album("Blond", 2016);
        album1.addMusic(m1);
        album1.addMusic(m2);

        Artist artist = new Artist("Frank Ocean");
        artist.addAlbum(album1);

        MusicLibrary library = new MusicLibrary();
        library.addArtist(artist);

        Music found = library.searchMusic("Nights");
        if (found != null) {
            found.play();
            found.stop();
        }

        Music random = library.giveRandomMusic();
        if (random != null) {
            System.out.println("random music:");
            random.displayInfo();
        }
        library.displayInfo();
    }
}
