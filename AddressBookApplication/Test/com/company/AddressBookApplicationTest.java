package com.company;

import org.junit.Test;

import static org.junit.Assert.*;
/**
 * this is a test class for AddressBookApplication class
 *
 * @author Yucheng Zheng
 * @version 1.0
 * @since Jan. 28, 2020
 **/
public class AddressBookApplicationTest {
    /** An addressbook object for testing
     *
     */
    private AddressBook testAB = new AddressBook();

    /** the first test reads from data.txt, if passed successfully it should have 2 entries
     * in the object array, and should return entry count as 2
     * @throws Exception
     */
    @Test
    public void initTest1() throws Exception{
        /**
         * a string that holds file name
         */
        String file1 = "data.txt";
        /**
         * an integer that hold expected total entry count value
         */
        int entryCount = AddressBookApplication.init(file1,testAB);
        assertEquals(2, entryCount);
    }
    /** the second test reads from data2.txt, this time if passed successfully it should
     * return with 3 entries instead of 2
     * @throws Exception
     */
    @Test
    public void initTest2() throws Exception{
        /**
         * a string that holds file name
         */
        String file2 = "data2.txt";
        /**
         * an integer that hold expected total entry count value
         */
        int entryCount = AddressBookApplication.init(file2,testAB);
        assertEquals(3,entryCount);
    }

}