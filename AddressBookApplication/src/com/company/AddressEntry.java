package com.company;

import java.util.Comparator;

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
     * @param firstName a received attributes that makes up part of addressEntry
     * @param lastName  a received attributes that makes up part of addressEntry
     * @param street    a received attributes that makes up part of addressEntry
     * @param city      a received attributes that makes up part of addressEntry
     * @param state     a received attributes that makes up part of addressEntry
     * @param zip       a received attributes that makes up part of addressEntry
     * @param phone     a received attributes that makes up part of addressEntry
     * @param email     a received attributes that makes up part of addressEntry
     */
    public AddressEntry(String firstName, String lastName, String street, String city, String state, int zip, String email, String phone) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.email = email;
        this.phone = phone;
    }

    /**
     * a comparator method that assist the sort of entries
     */
    public static Comparator<AddressEntry> firstNameComp = new Comparator<AddressEntry>() {
        /**
         *  compare first name by alphabetical order and return values base on comparison
         * @param a1 the front addressEntry object
         * @param a2 the back addressEntry object
         * @return an integer that: if 1 is smaller than 2 returns -1; 1 equals 2 returns 0; if 1 is bigger than 2 returns 1
         */
        public int compare(AddressEntry a1, AddressEntry a2) {
            String entry1 = a1.getFirstName().toUpperCase();
            String entry2 = a2.getFirstName().toUpperCase();
            return entry1.compareTo(entry2);
        }
    };

    /**
     * to string converts all the AddressEntry object attributes into a string
     *
     * @return a string with a list of this AddressEntry object attributes
     */
    @Override
    public String toString() {
        return firstName + " " + lastName + " | " + street + " | " + city + " | " + state + " | " + zip + " | " + email + " | " + phone;
    }

    /**
     * various system generated setters and getters for each class attribute
     *
     * @param firstName a string containing firstname
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * various system generated setters and getters for each class attribute
     *
     * @param lastName a string containing lastname
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * various system generated setters and getters for each class attribute
     *
     * @param street a string containing street name
     */
    public void setStreet(String street) {
        this.street = street;
    }

    /**
     * various system generated setters and getters for each class attribute
     *
     * @param city a string containing city name
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * various system generated setters and getters for each class attribute
     *
     * @param state a string containing state name
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * various system generated setters and getters for each class attribute
     *
     * @param zip an integer containing zip code
     */
    public void setZip(int zip) {
        this.zip = zip;
    }

    /**
     * various system generated setters and getters for each class attribute
     *
     * @param phone a string containing phone number
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * various system generated setters and getters for each class attribute
     *
     * @param email a string containing email address
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * various system generated setters and getters for each class attribute
     *
     * @return first name string
     */

    public String getFirstName() {
        return firstName;
    }

    /**
     * various system generated setters and getters for each class attribute
     *
     * @return last name string
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * various system generated setters and getters for each class attribute
     *
     * @return street name string
     */
    public String getStreet() {
        return street;
    }

    /**
     * various system generated setters and getters for each class attribute
     *
     * @return city name string
     */
    public String getCity() {
        return city;
    }

    /**
     * various system generated setters and getters for each class attribute
     *
     * @return state name string
     */
    public String getState() {
        return state;
    }

    /**
     * various system generated setters and getters for each class attribute
     *
     * @return zip code integer
     */
    public int getZip() {
        return zip;
    }

    /**
     * various system generated setters and getters for each class attribute
     *
     * @return phone number string
     */
    public String getPhone() {
        return phone;
    }

    /**
     * various system generated setters and getters for each class attribute
     *
     * @return email string
     */
    public String getEmail() {
        return email;
    }

}
