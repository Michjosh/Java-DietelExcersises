package ChapterNine;
/*(Book Hierarchy) Books can come in various formats, like paper books, audio books, ebooks,
etc. Create a generic class Book that has as common attributes the title, the year of publication,
and the author. The constructor of this class should instantiate all three attributes. Override the
toString method of class Book that returns a string that contains the values of its attributes. Create
a subclass PrintBook that extends Book with attributes Publisher and ISBN. Create another subclass
AudioBook which has the book’s size (in MB), its play length and the playback artist’s name as attributes.
Both PrintBook and AudioBook classes override the toString method inherited from
Book. Write a Java application to demonstrate the usage of this hierarchy.*/

public class Book {
    private String title;
    private int yearPublication;
    private String authorsName;

    public Book(String title, int yearPublication, String authorsName) {
        this.title = title;
        this.yearPublication = yearPublication;
        this.authorsName = authorsName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYearPublication() {
        return yearPublication;
    }

    public void setYearPublication(int yearPublication) {
        this.yearPublication = yearPublication;
    }

    public String getAuthorsName() {
        return authorsName;
    }

    public void setAuthorsName(String authorsName) {
        this.authorsName = authorsName;
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Year: " + yearPublication + ", Author: " + authorsName;
    }
}
