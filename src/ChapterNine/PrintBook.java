package ChapterNine;

public class PrintBook extends Book{

    private String publisher;
    private int ISBN;

    public PrintBook(String title, int yearPublication, String authorsName, String publisher, int ISBN) {
        super(title, yearPublication, authorsName);
        this.publisher = publisher;
        this.ISBN = ISBN;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    @Override
    public String toString() {
        return super.toString() +  ", Publisher: " + publisher + ", ISBN: " + ISBN;
    }
}
