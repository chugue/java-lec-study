package ex04.test.excercise;

class Song {
    String title;
    String artist;
    int length;

    public Song(String title, String artist, int length) {
        this.title = title;
        this.artist = artist;
        this.length = length;
    }

    public Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    public Song(String title) {
        this.title = title;
    }

    public Song() {
    }

}
public class SongTest {
    public static void main(String[] args) {
        Song s1 = new Song("Outward Bound", "Nana", 180);
        Song s2 = new Song("Jambalya", "Carpenters");
        Song s3 = new Song("Yesterday");
        Song s4 = new Song();
    }
}
