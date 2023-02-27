package MobilePhoneBook;

import java.util.ArrayList;
import java.util.Date;

public class PhoneBook {

    private String userName;
    private String password;

    private int contactId = 1;
    private final ArrayList <Contacts> contacts;


    public PhoneBook(String userName, String password){
        this.userName = userName;
        this.password = password;
        contacts = new ArrayList<>();
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public void createContact(String contactName, String phoneNumber, String emailAddress, String homeAddress) {
    Contacts contact = new Contacts(contactId, contactName, phoneNumber, emailAddress, homeAddress, new Date());
    animatedDisplay("Creating Contact");
    contacts.add(contact);
    contactId++;
    }
    public int countContacts(){
        animatedDisplay("Counting");
        System.out.println(contacts.size());
        return contacts.size();

    }

    public void editContact(int contactIdNumber, String newContactName, String newContactNumber, String newEmailAddress,String newHomeAddress) {
        animatedDisplay("Editing");
        try {
            for (Contacts contact : contacts) {
                if (contactId == contactIdNumber) System.out.println(); contact.setContactNumber(newContactNumber);
                contact.setContactName(newContactName); contact.setEmailAddress(newEmailAddress); contact.setHomeAddress(newHomeAddress);
                    System.out.println("Contact has been edited");
                    return;

            }throw new IllegalArgumentException("Wrong Contact Number");
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
    }

    public void viewContacts() {
        animatedDisplay("Loading");
        try {
            if (contacts.isEmpty()) {
                throw new Exception("No Contact to display");
            }
            for (Contacts contacts1 : contacts) {
                System.out.println(contacts1.toString());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public Contacts findContacts(int contactNumber) {
        return contacts.get(contactNumber - 1);
    }

    public void deleteContact(int contactIdNumber) {
        animatedDisplay("Deleting");
        try {
            for (Contacts contacts1 : contacts) {
                if (contacts1.getContactIdNumber() == contactIdNumber) {
                    contacts.remove(contactIdNumber-1);
                    System.out.println("Contact has been deleted.");
                    return;
                }
            }
            throw new Exception("No Contact found");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void searchContact(String contactName) {
        animatedDisplay("Searching");
        try {
            for (Contacts contacts1 : contacts) {
                if (contacts1.getContactName().equalsIgnoreCase(String.valueOf(contactName))) {
                    System.out.println(contacts1);
                    return;
                }
            }
            throw new Exception("No Contact found");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
    public void animatedDisplay(String action){
        System.out.print(action);
        for (int i = 0; i < 3; i++) {
            System.out.print(">>");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println();
    }
}
