package com.company;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * The AddressBook class is a class that serves as an AddressBook object
 * with various methods and attributes
 *
 * @author Yucheng Zheng
 * @version 1.0
 * @since Jan. 28, 2020
 **/
public class AddressBook {
    /**
     * addressEntryList is an arraylist that holds AddressEntry Objects
     */
    private ArrayList<AddressEntry> addressEntryList;
    /**
     * this is a counter for how many addresses currently in the addressbook arraylist
     */
    int addressCount;

    /**
     * this is the constructor for the AddressBook class
     */
    public AddressBook() {
        addressEntryList = new ArrayList<AddressEntry>();
        addressCount = 0;
    }

    /**
     * list method iterate through addressEntryList and for each item call
     * toString and print it out
     */
    public void list() {
        /** an iterator that is used to traverse the whole list
         *
         */
        Iterator it = addressEntryList.iterator();
        if (addressCount == 0) {
            System.out.println("Nothing");
        }
        /** an integer that counts the logical current position of entry
         *
         */
        int index = 1;
        while (it.hasNext()) {
            System.out.println(index + ": " + it.next().toString());
            index++;
        }
    }

    /**
     * add new addressEntry object to the addressEntryList
     *
     * @param ae an AddressEntry object
     */
    public void add(AddressEntry ae) {
        addressEntryList.add(ae);
        addressCount++;
    }

    /**
     * a getter method for addressCount
     *
     * @return the number of address currently in the addressbook
     */
    public int getAddressCount() {
        return addressCount;
    }

    /**
     * a method that removes an addressbook entry from the addressbook list
     * by the user's given last name
     */
    public void removal(AddressEntry ae) {
        addressEntryList.remove(ae);
        addressCount--;
    }

    /**
     * a method that returns an addressEntry by their index
     */
    public AddressEntry getAE(int index) {
        return addressEntryList.get(index);
    }
}
