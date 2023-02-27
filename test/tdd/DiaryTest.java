import NoteBook.Diary;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static org.testng.AssertJUnit.assertEquals;

public class DiaryTest {
    private static final LocalDateTime dateTime = LocalDateTime.now();

    private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss a");


    private static Diary eBook;
    @BeforeEach
    public void StartWithThis(){
        eBook = new Diary();
        eBook.createEntry("Myday", "Thank God for today");
    }
    @Test
    public void testThatEntryCanBeCreated(){
        assertEquals(1, eBook.countEntries());
    }

    @Test
    public void testThatEntriesCanBeViewed(){
       String expected = String.format("""
               =================================
               Entry ID: 1
               Entry Title: My day
               Entry Body: Thank God for today
               Entry Date/Time: %s
               =================================""", dateTime.format(formatter));
        assertEquals(1, eBook.countEntries());
    }

    @Test
    public void testThatEntriesCanBeDeleted(){
        eBook.deleteEntry(1);
        assertEquals(0, eBook.countEntries());
    }

    @Test
    public void testThatEntriesCanBeCounted(){
        eBook.countEntries();
        assertEquals(1, eBook.countEntries());
    }

    @Test
    public void testThatEntriesCanBeEdited(){
        eBook.editEntry(1, "I Love the Lord", "I love the lord so much");
        eBook.viewEntry(1);
        assertEquals(1, eBook.countEntries());
    }
}
