package Entities;

public class Address {
    private String streetAddress;
    private String city;
    private String zipcode;
    private String country;

    public Address(String streetAddress, String city, String zipcode, String country) {
        this.streetAddress = streetAddress;
        this.city = city;
        this.zipcode = zipcode;
        this.country = country;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
