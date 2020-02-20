package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * The AddressBookApplication class represents a generic address book that has
 * the ability to store entry for personal address and other information
 *
 * @author Yucheng Zheng
 * @version 1.0
 * @since Jan. 28, 2020
 **/
public class AddressBookApplication {
    /**
     * this is the main function that serves most of the user interaction
     * and other methods calling
     * @param args main function
     * @throws FileNotFoundException if file not found
     */
    public static void main(String[] args) throws FileNotFoundException {
        /** the initialization of an empty addressbook array for the use
         * of the application
         * */
        AddressBook addressBook = new AddressBook();
        /** a boolean method that initialize at false, to prevent menu loop
         * from exiting until user tells the application so
         */
        boolean quit = false;
        /**standard scanner to read user input
         *
         */
        Scanner input = new Scanner(System.in);

        /** the main loop that executes the application
         * */
        while (!quit) {
            Menu.menuList();

            /** a temporary string that holds input
             *
             */
            String temp = input.next();
            /** a char for the switch statement that leads to different
             * methods for the application, converting user input to upper case
             * */
            char option = Character.toUpperCase(temp.charAt(0));

            switch (option) {
                case 'A': {
                    Menu.loadingFromFile(addressBook, input);
                    break;
                }
                case 'B': {
                    Menu.addition(addressBook,input);
                    break;
                }
                case 'C': {
                    Menu.removal(addressBook,input);
                    break;
                }
                case 'D': {
                    Menu.findEntry(addressBook,input);
                    break;
                }
                case 'E': {
                    Menu.displayList(addressBook);
                    break;
                }
                case 'F': {
                    quit = Menu.exitProgram();
                    break;
                }
                default: {
                    System.out.println("Invalid input");
                }
            }
        }

    }

    /**
     * init method use scanner and string tokens to slice up the readin string
     * and put into the initialization of addressbook object
     *
     * @param fileName the name of file to perform I/O from
     * @param ab       the address book array
     * @return how many addresses has been read in
     * @throws FileNotFoundException if it is not found, the try catch in the other function block handles it
     */
    public static int init(String fileName, AddressBook ab) throws FileNotFoundException {

        /** read in serves as the file I/O for this method, and will be used with
         * scanner sc to parse lines within the file
         * */
        File readin = new File("C:\\Users\\yuche\\Desktop\\School Files\\CSUEB\\Spring2020\\CS 401\\CSUEB_2020Spring_CS401\\AddressBookApplication\\src\\com\\company\\" + fileName);
        /** scans the read in file
         * */
        Scanner sc = new Scanner(readin);
        /** count how many address(es) has been read in
         * */
        int readinCounter = 0;

        /** this is a loop that continues to read from the file and parse up
         * individual components to form an AddressBook object, then is added
         * to the addressbook array that was passed to this method
         * */
        while (sc.hasNextLine()) {
            String firstName, lastName, street, city, state, phone, email;
            int zip;
            firstName = sc.nextLine();
            lastName = sc.nextLine();
            street = sc.nextLine();
            city = sc.nextLine();
            state = sc.nextLine();
            zip = Integer.parseInt(sc.nextLine());
            email = sc.nextLine();
            phone = sc.nextLine();
            AddressEntry readinEntry = new AddressEntry(firstName, lastName, street, city, state, zip, email, phone);
            ab.add(readinEntry);
            readinCounter++;
        }
        sc.close();
        return readinCounter;
    }
}
