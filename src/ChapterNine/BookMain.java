package ChapterNine;

public class BookMain {
    public static void main(String[] args) {
        PrintBook printBook = new PrintBook("The GoodBook", 2023,
                "Michael Joshua", "Rophe", 1234);

        AudioBook audioBook = new AudioBook("The Word", 102,
                "Holyghost", 250, 8*60+17, "yes", "Jesus Christ");

        System.out.println(printBook);
        System.out.println();
        System.out.println(audioBook);
    }
}
