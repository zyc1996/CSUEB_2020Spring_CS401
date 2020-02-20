package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * this is a test class for AddressEntry class
 *
 * @author Yucheng Zheng
 * @version 1.0
 * @since Jan. 28, 2020
 **/
public class AddressEntryTest {
    /**
     * an AddreesEntry object for testing
     */
    private AddressEntry testAE = new AddressEntry("Jack", "Christian", "Saint Lane", "Londo", "GA", 24523, "Jackchrist@yahoo.com", "734-325-2335");
    /**
     * an AddreesEntry object for testing
     */
    private AddressEntry testAE2 = new AddressEntry("Link", "Gratman", "Halo ct", "Ceaster", "NY", 84523, "Linkthegreat@gmail.com", "643-675-4362");
    /**
     * an AddreesEntry object for testing
     */
    private AddressEntry testAE3 = new AddressEntry("Lynne", "Grewe", "123 3rd Ave",
            "Hayward",
            "Ca",
            28666,
            "lynne.grewe@csueastbay.edu",
            "510-885-4167");

    /**
     * pass an existing addressEntry object and see if it outputs the same string
     */
    @Test
    public void testToString() {
        assertEquals("Jack Christian | Saint Lane | Londo | GA | 24523 | Jackchrist@yahoo.com | 734-325-2335", testAE.toString());
    }

    /**
     * 2nd test toString with a different object
     */
    @Test
    public void testToString2() {
        assertEquals("Link Gratman | Halo ct | Ceaster | NY | 84523 | Linkthegreat@gmail.com | 643-675-4362", testAE2.toString());
    }

    /**
     * pass an existing addressEntry object and see if it outputs the same first name
     */
    @Test
    public void getFirstName() {
        assertEquals("Jack", testAE.getFirstName());
    }

    /**
     * pass an existing addressEntry object and see if it outputs the same first name 2
     */
    @Test
    public void getFirstName2() {
        assertEquals("Link", testAE2.getFirstName());
    }

    /**
     * pass an existing addressEntry object and see if it outputs the same last name
     */
    @Test
    public void getLastName() {
        assertEquals("Christian", testAE.getLastName());
    }

    /**
     * pass an existing addressEntry object and see if it outputs the same last name 2
     */
    @Test
    public void getLastName2() {
        assertEquals("Gratman", testAE2.getLastName());
    }

    /**
     * pass an existing addressEntry object and see if it outputs the same street name
     */
    @Test
    public void getStreet() {
        assertEquals("Saint Lane", testAE.getStreet());
    }

    /**
     * pass an existing addressEntry object and see if it outputs the same street name 2
     */
    @Test
    public void getStreet2() {
        assertEquals("Halo ct", testAE2.getStreet());
    }

    /**
     * pass an existing addressEntry object and see if it outputs the same city name
     */
    @Test
    public void getCity() {
        assertEquals("Londo", testAE.getCity());
    }

    /**
     * pass an existing addressEntry object and see if it outputs the same city name 2
     */
    @Test
    public void getCity2() {
        assertEquals("Ceaster", testAE2.getCity());
    }

    /**
     * pass an existing addressEntry object and see if it outputs the same state name
     */
    @Test
    public void getState() {
        assertEquals("GA", testAE.getState());
    }

    /**
     * pass an existing addressEntry object and see if it outputs the same state name 2
     */
    @Test
    public void getState2() {
        assertEquals("NY", testAE2.getState());
    }

    /**
     * pass an existing addressEntry object and see if it outputs the same zip code
     */
    @Test
    public void getZip() {
        assertEquals(24523, testAE.getZip());
    }

    /**
     * pass an existing addressEntry object and see if it outputs the same zip code 2
     */
    @Test
    public void getZip2() {
        assertEquals(84523, testAE2.getZip());
    }

    /**
     * pass an existing addressEntry object and see if it outputs the same phone number
     */
    @Test
    public void getPhone() {
        assertEquals("734-325-2335", testAE.getPhone());
    }

    /**
     * pass an existing addressEntry object and see if it outputs the same phone number 2
     */
    @Test
    public void getPhone2() {
        assertEquals("643-675-4362", testAE2.getPhone());
    }

    /**
     * pass an existing addressEntry object and see if it outputs the same email
     */
    @Test
    public void getEmail() {
        assertEquals("Jackchrist@yahoo.com", testAE.getEmail());
    }

    /**
     * pass an existing addressEntry object and see if it outputs the same email 2
     */
    @Test
    public void getEmail2() {
        assertEquals("Linkthegreat@gmail.com", testAE2.getEmail());
    }

    /**
     * pass values to a setter and see if getter returns the correct value
     */
    @Test
    public void setFirstName() {
        testAE.setFirstName("Sheep");
        assertEquals("Sheep", testAE.getFirstName());
    }

    /**
     * pass values to a setter and see if getter returns the correct value
     */
    @Test
    public void setLastName() {
        testAE.setLastName("Meow");
        assertEquals("Meow", testAE.getLastName());
    }

    /**
     * pass values to a setter and see if getter returns the correct value
     */
    @Test
    public void setStreet() {
        testAE.setStreet("Hoop st");
        assertEquals("Hoop st", testAE.getStreet());
    }

    /**
     * pass values to a setter and see if getter returns the correct value
     */
    @Test
    public void setCity() {
        testAE.setCity("DoggoLand");
        assertEquals("DoggoLand", testAE.getCity());
    }

    /**
     * pass values to a setter and see if getter returns the correct value
     */
    @Test
    public void setState() {
        testAE.setState("PA");
        assertEquals("PA", testAE.getState());
    }

    /**
     * pass values to a setter and see if getter returns the correct value
     */
    @Test
    public void setZip() {
        testAE.setZip(94252);
        assertEquals(94252, testAE.getZip());
    }

    /**
     * pass values to a setter and see if getter returns the correct value
     */
    @Test
    public void setPhone() {
        testAE.setPhone("935-325-6432");
        assertEquals("935-325-6432", testAE.getPhone());
    }

    /**
     * pass values to a setter and see if getter returns the correct value
     */
    @Test
    public void setEmail() {
        testAE.setEmail("HippySheep@gmail.com");
        assertEquals("HippySheep@gmail.com", testAE.getEmail());
    }

    /**
     * since the add method in addressbook uses the comparator
     * create a test addressbook and pass 2 objects for it to add in descending
     * order, when finish adding it should be in ascending order, compare first name
     * entry for both address if returns a positive integer then the test passes
     */
    @Test
    public void testComparator() {
        /**
         * an address book object for testing purpose
         */
        AddressBook testAB = new AddressBook();
        testAB.add(testAE2);
        testAB.add(testAE);
        /** a boolean for assert test
         *
         */
        Boolean bool = testAB.getAE(1).getFirstName().compareTo(testAB.getAE(0).getFirstName()) > 0;
        assertTrue("Second Entry is smaller than first entry, after compare will return a positive integer", bool);

    }

    /**
     * create a test addressbook and pass 3 objects for it to add in descending
     * order, when finish adding it should be in ascending order, compare first name
     * entry for both address if returns a positive integer then the test passes
     * note: testAE is smaller than testAE2 is smaller testAE3
     */
    @Test
    public void testComparator2() {
        /**
         * an address book object for testing purpose
         */
        AddressBook testAB = new AddressBook();
        testAB.add(testAE3);
        testAB.add(testAE2);
        testAB.add(testAE);
        /** a boolean for assert test
         *
         */
        Boolean bool = testAB.getAE(2).getFirstName().compareTo(testAB.getAE(0).getFirstName()) > 0;
        assertTrue("Third added Entry is smaller than first added entry, after compare will return a positive integer", bool);
        bool = testAB.getAE(2).getFirstName().compareTo(testAB.getAE(1).getFirstName()) > 0;
        assertTrue("Third added Entry is smaller than second added entry, after compare will return a positive integer", bool);

    }
}