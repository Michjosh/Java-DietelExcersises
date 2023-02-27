package MobilePhoneBook;

import java.util.Date;

public class Contacts {
    private String contactName;
    private String contactNumber;
    private String emailAddress;
    private String homeAddress;
    private Date creationDate;

    private int contactIdNumber;

    public Contacts(int contactIdNumber, String contactName, String contactNumber, String emailAddress, String homeAddress, Date creationDate) {
        this.contactIdNumber = contactIdNumber;
        this.contactName = contactName;
        this.contactNumber = contactNumber;
        this.emailAddress = emailAddress;
        this.homeAddress = homeAddress;
        this.creationDate = creationDate;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public int getContactIdNumber() {
        return contactIdNumber;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    @Override
    public String toString(){
        return String.format("""
                =============================
                 Contact ID: %s
                 Name: %s
                 Number: %s
                 EmailAddress: %s
                 HomeAddress: %s
                =============================
                """
                ,getContactIdNumber(), getContactName(), getContactNumber(), getEmailAddress(), getHomeAddress());
    }
}
