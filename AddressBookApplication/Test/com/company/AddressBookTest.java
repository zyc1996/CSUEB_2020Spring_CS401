package com.company;

import org.junit.Test;

import static org.junit.Assert.*;
/**
 * this is a test class for AddressBook class
 *
 * @author Yucheng Zheng
 * @version 1.0
 * @since Jan. 28, 2020
 **/
public class AddressBookTest {
    /**
     * an AddreesEntry object for testing
     */
    private AddressEntry testAE = new AddressEntry("Jack" ,"Christian","Saint Lane", "Londo","GA", 24523,"734-325-2335","Jackchrist@yahoo.com");
    /**
     * an AddreesEntry object for testing
     */
    private AddressEntry testAE2 = new AddressEntry("Link", "Gratman", "Halo ct", "Ceaster", "NY",84523,"643-675-4362","Linkthegreat@gmail.com");
    /**
     * constructor test, if returns the same object with 0 list count then function passes
     */
    @Test
    public void AddressBook(){
        /**
         * An AddressBook object for testing
         */
        AddressBook testAB = new AddressBook();
        assertEquals(0,testAB.getAddressCount());
    }
    /**
     * constructor test, if returns the same object with incremental list count then function passes
     */
    @Test
    public void AddressBook2(){
        /**
         * An AddressBook object for testing
         */
        AddressBook testAB = new AddressBook();
        testAB.add(testAE);
        assertEquals(1,testAB.getAddressCount());
        assertEquals(testAE,testAB.getAE(0));
    }

    /**
     * running this will outputs 2 lines of the same object addressEntry onto console
     */
    @Test
    public void list() {
        /**
         * An AddressBook object for testing
         */
        AddressBook testAB = new AddressBook();
        testAB.add(testAE);
        testAB.add(testAE);
        testAB.list();

    }
    /**
     * running this will outputs 2 lines of the different object addressEntry onto console
     */
    @Test
    public void list2() {
        /**
         * An AddressBook object for testing
         */
        AddressBook testAB = new AddressBook();
        testAB.add(testAE);
        testAB.add(testAE2);
        testAB.list();
    }

    /**
     * pretty much the same as the constructor test, to verify that there is a new
     * object added to the list
     */
    @Test
    public void add() {
        /**
         * An AddressBook object for testing
         */
        AddressBook testAB = new AddressBook();
        testAB.add(testAE);
        assertEquals(1,testAB.getAddressCount());
        assertEquals(testAE,testAB.getAE(0));
    }

    /**
     * the same test added with a different object
     */
    @Test
    public void add2() {
        /**
         * An AddressBook object for testing
         */
        AddressBook testAB = new AddressBook();
        testAB.add(testAE);
        testAB.add(testAE2);
        assertEquals(2,testAB.getAddressCount());
        assertEquals(testAE2,testAB.getAE(1));
    }

    /**
     * when u initiate an addressbook, it should have 0 entries, this passes if it returns 0
     */
    @Test
    public void getAddressCount() {
        /**
         * An AddressBook object for testing
         */
        AddressBook testAB = new AddressBook();
        assertEquals(0,testAB.getAddressCount());
    }

    /**
     * looping 5 same entries into the addressbook, this passes if it returns 5
     */
    @Test
    public void getAddressCount2() {
        /**
         * An AddressBook object for testing
         */
        AddressBook testAB = new AddressBook();
        for(int i = 0; i < 5; i++){
            testAB.add(testAE);
        }
        assertEquals(5,testAB.getAddressCount());
    }

    /**
     * adds and deletes the same entries, passes if list count is 0
     */
    @Test
    public void removal() {
        /**
         * An AddressBook object for testing
         */
        AddressBook testAB = new AddressBook();
        testAB.add(testAE);
        testAB.removal(testAE);
        assertEquals(0,testAB.getAddressCount());
    }
    /**
     * adds 2 different entries and deletes the first one, if the second entry remains then it passes
     */
    @Test
    public void removal2() {
        /**
         * An AddressBook object for testing
         */
        AddressBook testAB = new AddressBook();
        testAB.add(testAE);
        testAB.add(testAE2);
        testAB.removal(testAE);
        assertEquals(1,testAB.getAddressCount());
        assertEquals(testAE2,testAB.getAE(0));
    }

    /** if the object added matches with the first return by this method then passes
     *
     */
    @Test
    public void getAE() {
        /**
         * An AddressBook object for testing
         */
        AddressBook testAB = new AddressBook();
        testAB.add(testAE);
        assertEquals(testAE,testAB.getAE(0));
    }

    /**
     * addes 2 objects this time and ask for object in the 2nd position, if returns and matches
     * then method passes
     */
    @Test
    public void getAE2() {
        /**
         * An AddressBook object for testing
         */
        AddressBook testAB = new AddressBook();
        testAB.add(testAE);
        testAB.add(testAE2);
        assertEquals(testAE2,testAB.getAE(1));
    }
}