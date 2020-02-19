package com.company;

/**
 * The AddressEntry class is a class that defines AddressEntry Objects
 *
 * @author Yucheng Zheng
 * @version 1.0
 * @since Jan. 28, 2020
 **/
public class AddressEntry {
    /**
     * holds the value of first name
     */
    private String firstName;
    /**
     * holds the value of last name
     */
    private String lastName;
    /**
     * holds the value of street address
     */
    private String street;
    /**
     * holds the value of city address
     */
    private String city;
    /**
     * holds the value of state name
     */
    private String state;
    /**
     * holds the value of zip number
     */
    private int zip;
    /**
     * hold the value of phone number
     */
    private String phone;
    /**
     * hold the value of email address
     */
    private String email;

    /**
     * AddressEntry serves as a constructor that accepts all the class's listed
     * attribute to form an AddressEntry object
     *
     * @param firstName all parameters are received attributes
     * @param lastName
     * @param street
     * @param city
     * @param state
     * @param zip
     * @param phone
     * @param email
     * @returns nothing
     */
    public AddressEntry(String firstName, String lastName, String street, String city, String state, int zip, String phone, String email) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phone = phone;
        this.email = email;
    }

    /**
     * to string converts all the AddressEntry object attributes into a string
     *
     * @return a string with a list of this AddressEntry object attributes
     */
    public String toString() {
        return firstName + " " + lastName + " | " + street + " | " + city + " | " + state + " | " + zip + " | " + phone + " | " + email;
    }

    /**
     * various system generated setters and getters for each class attribute
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * various system generated setters and getters for each class attribute
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * various system generated setters and getters for each class attribute
     */
    public void setStreet(String street) {
        this.street = street;
    }

    /**
     * various system generated setters and getters for each class attribute
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * various system generated setters and getters for each class attribute
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * various system generated setters and getters for each class attribute
     */
    public void setZip(int zip) {
        this.zip = zip;
    }

    /**
     * various system generated setters and getters for each class attribute
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * various system generated setters and getters for each class attribute
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * various system generated setters and getters for each class attribute
     */

    public String getFirstName() {
        return firstName;
    }

    /**
     * various system generated setters and getters for each class attribute
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * various system generated setters and getters for each class attribute
     */
    public String getStreet() {
        return street;
    }

    /**
     * various system generated setters and getters for each class attribute
     */
    public String getCity() {
        return city;
    }

    /**
     * various system generated setters and getters for each class attribute
     */
    public String getState() {
        return state;
    }

    /**
     * various system generated setters and getters for each class attribute
     */
    public int getZip() {
        return zip;
    }

    /**
     * various system generated setters and getters for each class attribute
     */
    public String getPhone() {
        return phone;
    }

    /**
     * various system generated setters and getters for each class attribute
     */
    public String getEmail() {
        return email;
    }

}
