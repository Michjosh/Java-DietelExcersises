package NoteBook;

import java.util.Date;

public class Entry {
    private int entryId;
    String entryTitle;
    String entryBody;
    private Date entryDate;

    public Entry( int entryId, String entryTitle, String entryBody, Date entryDate) {
        this.entryId = entryId;
        this.entryTitle = entryTitle;
        this.entryBody = entryBody;
        this.entryDate = entryDate;
    }

    public int getEntryId() {
        return entryId;
    }

    public String getEntryTitle() {
        return entryTitle;
    }

    public String getEntryBody() {
        return entryBody;
    }

    public Date getEntryDate() {
        return entryDate;
    }
    @Override
    public String toString(){
        return String.format("""
                =============================
                Entry Number: %s
                Entry Title: %s
                Entry Body: %s
                Entry Date: %s
                =============================
                """
                , entryId, entryTitle, entryBody, entryDate);
    }
}
