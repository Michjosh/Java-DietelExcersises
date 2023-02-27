import MobilePhoneBook.PhoneBook;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertNotNull;

public class PhoneBookTest {

    private static PhoneBook phoneBook;

    @BeforeEach
    public void Setup(){
        phoneBook = new PhoneBook("mike", "1234");
        phoneBook.createContact("Michael", "070693210006",
                "michaelkejoshua@gmail.com", "Iwaya");
    }

    @Test
    void testThatPhoneBookExist(){
        assertNotNull(phoneBook);
    }

    @Test
    void testThatContactCanBeCreated(){
        assertEquals(1, phoneBook.countContacts());
    }

    @Test
    void testThatContactsCanBeViewed(){
        phoneBook = new PhoneBook("mike", "1234");
        phoneBook.createContact("Michael", "07069310006",
                "michaelkejoshua@gmail.com", "Iwaya");
        String expected = """
                =============================
                 Name: Michael
                 Number: 07069310006
                 EmailAddress: michaelkejoshua@gmail.com
                 HomeAddress: Iwaya
                =============================
                """;
        assertEquals(expected, phoneBook.findContacts(1).toString());
    }

    @Test
    void testThatContactsCanBeEdited(){
        phoneBook.editContact(1, "Ike", "098023456765",
                "mceyokonkwo@gmail.com", "Iwaya");
        String expected = """
                =============================
                 Name: Ike
                 Number: 098023456765
                 EmailAddress: mceyokonkwo@gmail.com
                 HomeAddress: Iwaya
                =============================
                """;
        assertEquals(expected, phoneBook.findContacts(1).toString());

    }
    @Test
    void testThatContactCanBeDeleted(){
        phoneBook.createContact("Joshua", "070693210006",
                "michaelkejoshua@gmail.com", "Iwaya");
        phoneBook.deleteContact(2);
        assertEquals(1, phoneBook.countContacts());

    }

    @Test
    void testThatContactCanBeFoundByName(){
        phoneBook = new PhoneBook("mike", "1234");
        phoneBook.createContact( "Michael", "07069310006",
                "michaelkejoshua@gmail.com", "Iwaya");
        phoneBook.searchContact("Michael");
        String expected = """
                =============================
                 Name: Michael
                 Number: 07069310006
                 EmailAddress: michaelkejoshua@gmail.com
                 HomeAddress: Iwaya
                =============================
                """;
        assertEquals(expected, phoneBook.findContacts(1).toString());
    }
}
