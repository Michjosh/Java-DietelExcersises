package NoteBook;

import java.util.ArrayList;
import java.util.Date;

public class Diary {
    private ArrayList<Entry> entries;
    private String userName = "mymy";
    private String password = "1234";

    private String action1 ="Loading";
    int entryNumber = 1;
    public Diary() {
        entries = new ArrayList<>();
    }

    public void createEntry(String entryTitle, String entryBody) {
        animatedDisplay("Creating");
        Entry entry = new Entry(entryNumber, entryTitle, entryBody, new Date());
        entries.add(entry);
        entryNumber++;
    }
    public void viewEntry(int entryId) {
        animatedDisplay(action1);
        try {
            for (Entry entry : entries) {
                if (entry.getEntryId() == entryId) {
                    System.out.println("ID: " + entry.getEntryId());
                    System.out.println("Title: " + entry.getEntryTitle());
                    System.out.println("Body: " + entry.getEntryBody());
                    System.out.println("Date: " + entry.getEntryDate());
                    return;
                }
            }
            throw new Exception("Entry not found");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void viewAllEntries() {
        animatedDisplay(action1);
        try {
            if (entries.isEmpty()) {
                throw new Exception("No entries to display");
            }
            for (Entry entry : entries) {
                System.out.println(entry.toString());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void editEntry(int entryId, String newTitle, String newBody) {
        animatedDisplay("Editing");
        try {
            for (Entry entry : entries) {
                if (entry.getEntryId() == entryId) {
                    entry.entryTitle = newTitle;
                    entry.entryBody = newBody;
                    System.out.println("Entry has been successfully edited.");
                    return;
                }
            }
            throw new Exception("Entry not found");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public void deleteEntry(int entryId) {
        try {
            for (Entry entry : entries) {
                if (entry.getEntryId() == entryId) {
                    animatedDisplay("Deleting");
                    entries.remove(entry);
                    System.out.println("Entry has been successfully deleted.");
                    return;
                }
            }
            throw new Exception("Entry not found");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public int countEntries() {
        animatedDisplay("Counting");
        System.out.println(entries.size());
        return entries.size();
    }
    public void animatedDisplay(String action){
        System.out.print(action);
        for (int i = 0; i < 3; i++) {
            System.out.print(">>");
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println();
    }
    public String getUserName() {
        return userName;
    }
    public String setUserName(String userName) {
       return userName;
    }
    public String getPassword() {
        return password;
    }
    public String setPassword(String password) {
        return password;
    }
}
