package MikulHealth;

public class HomeAddress {
    private String country;
    private String state;
    private String city;
    private String streetName;
    private String streetNumber;

//    public HomeAddress(String country, String state, String city, String streetName, String streetNumber) {
//        this.country = country;
//        this.state = state;
//        this.city = city;
//        this.streetName = streetName;
//        this.streetNumber = streetNumber;
//    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
    }
}
