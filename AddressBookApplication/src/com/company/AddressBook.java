package com.company;

import java.util.ArrayList;
import java.util.Collections;
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
     * calls the sort method after to sort by alphabetical order of first name
     *
     * @param ae an AddressEntry object
     */
    public void add(AddressEntry ae) {
        addressEntryList.add(ae);
        addressCount++;
        Collections.sort(addressEntryList,AddressEntry.firstNameComp);
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
     * @param ae an address entry
     */
    public void removal(AddressEntry ae) {
        addressEntryList.remove(ae);
        addressCount--;
    }

    /**
     * a method that returns an addressEntry by their index
     * @param index the index to find an entry in the addressbook
     * @return the address entry found
     */
    public AddressEntry getAE(int index) {
        return addressEntryList.get(index);
    }
}
