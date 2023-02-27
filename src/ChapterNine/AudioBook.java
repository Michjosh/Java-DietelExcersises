package ChapterNine;

public class AudioBook extends Book{

    private int bookSize;
    private int playLength;
    private String playback;
    private String artisteName;

    public AudioBook(String title, int yearPublication, String authorsName, int bookSize, int playLength, String playback, String artisteName) {
        super(title, yearPublication, authorsName);
        this.bookSize = bookSize;
        this.playLength = playLength;
        this.playback = playback;
        this.artisteName = artisteName;
    }

    public int getBookSize() {
        return bookSize;
    }

    public void setBookSize(int bookSize) {
        this.bookSize = bookSize;
    }

    public int getPlayLength() {
        return playLength;
    }

    public void setPlayLength(int playLength) {
        this.playLength = playLength;
    }

    public String getPlayback() {
        return playback;
    }

    public void setPlayback(String playback) {
        this.playback = playback;
    }

    public String getArtisteName() {
        return artisteName;
    }

    public void setArtisteName(String artisteName) {
        this.artisteName = artisteName;
    }

    @Override
    public String toString() {
        return super.toString() + ", Size: " + bookSize + "MB, Length: " + playLength + "min, Artist: " + artisteName;
    }
}
