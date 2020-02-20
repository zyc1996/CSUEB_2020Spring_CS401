package com.company;

import org.junit.Test;

import java.io.FileNotFoundException;
import java.util.Scanner;

import static org.junit.Assert.assertEquals;

/**
 * this is a test class for Menu class
 *
 * @author Yucheng Zheng
 * @version 1.0
 * @since Jan. 28, 2020
 **/
public class MenuTest {
    /**
     * An AddressBook object for testing
     */
    private AddressBook testAB = new AddressBook();
    /**
     * an AddreesEntry object for testing
     */
    private AddressEntry testAE = new AddressEntry("Lynne", "Grewe", "123 3rd Ave",
            "Hayward",
            "Ca",
            28666,
            "lynne.grewe@csueastbay.edu",
            "510-885-4167");
    /**
     * an AddreesEntry object for testing
     */
    private AddressEntry testAE2 = new AddressEntry("Jack",
            "Christian",
            "Saint Lane",
            "Londo",
            "GA",
            24523,
            "Jackchrist@yahoo.com",
            "734-325-2335");

    /**
     * nothing to really test here, besides correctly printing the hard coded Strings onto console
     */
    @Test
    public void menuList() {
        Menu.menuList();
    }

    /**
     * this will load a file via user input, in our case we will use data.txt
     * and we will be checking the first matching Entry, if it matches, it passes
     *
     * @throws FileNotFoundException
     */
    @Test
    public void loadingFromFile() throws FileNotFoundException {
        /**
         * userInput holds file name
         */
        String userInput = "data.txt";
        /**
         * a scanner that passes input into method
         */
        Scanner sc = new Scanner(userInput);
        Menu.loadingFromFile(testAB, sc);
        assertEquals(testAE.toString(), testAB.getAE(0).toString());

    }

    /**
     * this will load a file via user input, in our case we will use data.txt
     * and we will be checking the first matching Entry, if it matches, it passes
     *
     * @throws FileNotFoundException
     */
    @Test
    public void loadingFromFile2() throws FileNotFoundException {
        /**
         * userInput holds file name
         */
        String userInput = "data2.txt";
        /**
         * a scanner that passes input into method
         */
        Scanner sc = new Scanner(userInput);
        Menu.loadingFromFile(testAB, sc);
        assertEquals(testAE2.toString(), testAB.getAE(0).toString());

    }

    /**
     * test to if addition gives the same entry object as the manual input
     * with exact same attributes, if yes then passes
     */
    @Test
    public void addition() {
        /**
         * a pre made string for input test
         */
        String userInput = "Lynne/Grewe/123 3rd Ave/Hayward/Ca/28666/lynne.grewe@csueastbay.edu/510-885-4167";
        /**
         * a scanner that passes input into method
         */
        Scanner sc = new Scanner(userInput);
        sc.useDelimiter("/");
        Menu.addition(testAB, sc);
        assertEquals(testAE.toString(), testAB.getAE(0).toString());
    }

    /**
     * test to if addition gives the same entry object as the manual input
     * with exact same attributes, if yes then passes
     */
    @Test
    public void addition2() {
        /**
         * a pre made string for input test
         */
        String userInput = "Jack/Christian/Saint Lane/Londo/GA/24523/Jackchrist@yahoo.com/734-325-2335";
        /**
         * a scanner that passes input into method
         */
        Scanner sc = new Scanner(userInput);
        sc.useDelimiter("/");
        Menu.addition(testAB, sc);
        assertEquals(testAE2.toString(), testAB.getAE(0).toString());
    }

    /**
     * Loads a file with some entries and removes one, runs the find method if it returns
     * "no matching entry found" then it passes
     * @throws FileNotFoundException
     */
    @Test
    public void removal() throws FileNotFoundException {
        /**
         * a pre made string for input test that invokes multiple methods
         */
        String userInput = "data2.txt/Amberwood/1/y/Amber";
        /**
         * a scanner that passes input into method
         */
        Scanner sc = new Scanner(userInput);
        sc.useDelimiter("/");
        Menu.loadingFromFile(testAB, sc);
        Menu.removal(testAB, sc);
        Menu.findEntry(testAB, sc);
    }

    /**
     * Loads a file with some entries and removes one, runs the find method if it returns
     * "no matching entry found" then it passes, same data, different removal item this time
     * @throws FileNotFoundException
     */
    @Test
    public void removal2() throws FileNotFoundException {
        /**
         * a pre made string for input test that invokes multiple methods
         */
        String userInput = "data2.txt/Hobbison/1/y/Hobbi";
        /**
         * a scanner that passes input into method
         */
        Scanner sc = new Scanner(userInput);
        sc.useDelimiter("/");
        Menu.loadingFromFile(testAB, sc);
        Menu.removal(testAB, sc);
        Menu.findEntry(testAB, sc);
    }

    /**
     * Will load in a file and see if a matching entry of the read in will display
     * after calling the find method
     * @throws FileNotFoundException
     */
    @Test
    public void findEntry() throws FileNotFoundException {
        /**
         * a pre made string for input test that invokes multiple methods
         */
        String userInput = "data2.txt/Hobbi";
        /**
         * a scanner that passes input into method
         */
        Scanner sc = new Scanner(userInput);
        sc.useDelimiter("/");
        Menu.loadingFromFile(testAB, sc);
        Menu.findEntry(testAB, sc);
    }

    /**
     * Will load in a file and see if a matching entry of the read in will display
     * after calling the find method, calling a different entry
     * @throws FileNotFoundException
     */
    @Test
    public void findEntry2() throws FileNotFoundException {
        /**
         * a pre made string for input test that invokes multiple methods
         */
        String userInput = "data2.txt/Ambe";
        /**
         * a scanner that passes input into method
         */
        Scanner sc = new Scanner(userInput);
        sc.useDelimiter("/");
        Menu.loadingFromFile(testAB, sc);
        Menu.findEntry(testAB, sc);
    }

    /**
     * this is more of a test of the .list() method in the AddressBook Class
     * nothing to really test bestsides confirming console entry
     */
    @Test
    public void displayList() {
        /**
         * a pre made string for input test
         */
        String userInput = "Jack/Christian/Saint Lane/Londo/GA/24523/Jackchrist@yahoo.com/734-325-2335";
        /**
         * a scanner that passes input into method
         */
        Scanner sc = new Scanner(userInput);
        sc.useDelimiter("/");
        Menu.addition(testAB, sc);
        Menu.displayList(testAB);
    }

    /**
     * calling the function will return a true boolean and a goodbye message in console
     */
    @Test
    public void exitProgram() {
        assertEquals(true, Menu.exitProgram());
    }

    /**
     * this will return a string
     * for the first name attribute
     */
    @Test
    public void prompt_FirstName() {
        /**
         * a pre made string for input test
         */
        String userInput = "firstName";
        /**
         * a scanner that passes input into method
         */
        Scanner sc = new Scanner(userInput);
        assertEquals(userInput, Menu.prompt_FirstName(sc));
    }

    /**
     * this will return a string
     * for the last name attribute
     */
    @Test
    public void prompt_LastName() {
        /**
         * a pre made string for input test
         */
        String userInput = "lastName";
        /**
         * a scanner that passes input into method
         */
        Scanner sc = new Scanner(userInput);
        assertEquals(userInput, Menu.prompt_FirstName(sc));
    }

    /**
     * this will return a string
     * for the street name attribute
     */
    @Test
    public void prompt_Street() {
        /**
         * a pre made string for input test
         */
        String userInput = "streetName";
        /**
         * a scanner that passes input into method
         */
        Scanner sc = new Scanner(userInput);
        assertEquals(userInput, Menu.prompt_FirstName(sc));
    }

    /**
     * this will return a string
     * for the city name attribute
     */
    @Test
    public void prompt_City() {
        /**
         * a pre made string for input test
         */
        String userInput = "cityName";
        /**
         * a scanner that passes input into method
         */
        Scanner sc = new Scanner(userInput);
        assertEquals(userInput, Menu.prompt_FirstName(sc));
    }

    /**
     * this will return a string
     * for the state name attribute
     */
    @Test
    public void prompt_State() {
        /**
         * a pre made string for input test
         */
        String userInput = "stateName";
        /**
         * a scanner that passes input into method
         */
        Scanner sc = new Scanner(userInput);
        assertEquals(userInput, Menu.prompt_FirstName(sc));
    }

    /**
     * this will return an integer
     * for the zip code attribute
     */
    @Test
    public void prompt_Zip() {
        /**
         * a pre made string for input test
         */
        String userInput = "12345";
        /**
         * a scanner that passes input into method
         */
        Scanner sc = new Scanner(userInput);
        assertEquals(userInput, Menu.prompt_FirstName(sc));
    }

    /**
     * pass a integer string to the method and if returns true then it passes
     */
    @Test
    public void numCheck() {
        /**
         * a pre made string for input test
         */
        String userInput = "252435";
        assertEquals(true, Menu.numCheck(userInput));
    }

    /**
     * pass a integer string to the method and if returns true then it passes
     * testing with a different integer string
     */
    @Test
    public void numCheck2() {
        /**
         * a pre made string for input test
         */
        String userInput = "398324";
        assertEquals(true, Menu.numCheck(userInput));
    }

    /**
     * this will return a string
     * for the phone number attribute
     */
    @Test
    public void prompt_Telephone() {
        /**
         * a pre made string for input test
         */
        String userInput = "xxx-yyy-zzzz";
        /**
         * a scanner that passes input into method
         */
        Scanner sc = new Scanner(userInput);
        assertEquals(userInput, Menu.prompt_FirstName(sc));
    }

    /**
     * this will return a string
     * for the email address attribute
     */
    @Test
    public void prompt_Email() {
        /**
         * a pre made string for input test
         */
        String userInput = "someEmail@gmail.com";
        /**
         * a scanner that passes input into method
         */
        Scanner sc = new Scanner(userInput);
        assertEquals(userInput, Menu.prompt_FirstName(sc));
    }
}