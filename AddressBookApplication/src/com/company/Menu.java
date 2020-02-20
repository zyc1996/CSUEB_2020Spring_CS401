package com.company;

import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * The menu class is a list of menu item methods that can be called by the
 * main AddressBookApplication, currently still under construction
 *
 * @author Yucheng Zheng
 * @version 1.0
 * @since Jan. 28, 2020
 **/

public class Menu {

    /**
     * a menu list that would be called repeatedly to display
     * available choice of methods
     */
    public static void menuList() {
        System.out.println("-------------------------------------");
        System.out.println("Please enter in your menu selection");
        System.out.println("a) Loading From File");
        System.out.println("b) Add an Entry");
        System.out.println("c) Remove an Entry");
        System.out.println("d) Find an Entry");
        System.out.println("e) Listing all Entry");
        System.out.println("f) Quit");
        System.out.println("-------------------------------------");
        System.out.print('>');
    }

    /**
     * a method that ask user for the file name and performs a I/O operation
     * to load the data into AddressEntry object and adds to the AddressBook
     *
     * @param ab    the addressBook arraylist
     * @param input the scanner for user input
     * @throws FileNotFoundException if file not found
     */
    public static void loadingFromFile(AddressBook ab, Scanner input) throws FileNotFoundException {
        System.out.println("Enter in file name:");
        System.out.print('>');

        /** a temporary string that holds input for file name
         *
         */
        String fileName = input.next();
        /** throws an exception if entered invalid file name
         *
         */
        try {
            /** this holds how many address(es) has been read in
             * */
            int addressCounter = AddressBookApplication.init(fileName, ab);
            System.out.println("Read in " + addressCounter + " new Address(es), successfully loaded, currently " + ab.getAddressCount());
        } catch (FileNotFoundException e) {
            System.out.println("There is no file found with the name of: " + fileName);
        }
    }

    /**
     * a method that ask user to input each individual attributes to form a
     * new AddressEntry object to be added to the AddressBook
     *
     * @param ab    the addressBook arraylist
     * @param input the scanner for user input
     */
    public static void addition(AddressBook ab, Scanner input) {
        /**create a new address entry to be added to the address book
         * */
        AddressEntry newAdd = new AddressEntry(prompt_FirstName(input), prompt_FirstName(input), prompt_Street(input), prompt_City(input), prompt_State(input), prompt_Zip(input), prompt_Telephone(input), prompt_Email(input));
        ab.add(newAdd);
        System.out.println("The following content has been added to your address Book:");
        System.out.println(newAdd.toString());
    }

    /**
     * a method that removes a selected AddressEntry from the existing
     * AddressBook array
     *
     * @param ab    the addressBook arraylist
     * @param input the scanner for user input
     */
    public static void removal(AddressBook ab, Scanner input) {
        if (ab.getAddressCount() == 0) {
            System.out.println("There are current no items in the Address book");
        } else {
            System.out.println("Enter in the Last Name of contact to remove");
            System.out.print('>');
            /**a string that holds the name of the entry that user wishes to remove
             * */
            String lastName = input.next();
            /**a temporary addressbook array that holds potential removal addressEntry objects
             * */
            AddressBook removeOption = new AddressBook();
            for (int i = 0; i < ab.addressCount; i++) {
                if (ab.getAE(i).getLastName().equals(lastName)) {
                    removeOption.add(ab.getAE(i));
                }
            }

            if (removeOption.getAddressCount() != 0) {
                System.out.println("The following " + removeOption.getAddressCount() + " entries were found in the address book, select number");
                removeOption.list();
                System.out.print('>');

                /** user enters the number for which entries to remove
                 * */
                int removeNum = input.nextInt() - 1;
                System.out.println("Hit y to remove the following entry or n to return to main menu: ");
                System.out.println(removeOption.getAE(removeNum).toString());
                System.out.print('>');
                /** user enter confirmation
                 *
                 */
                char confirmation = Character.toUpperCase(input.next().charAt(0));
                switch (confirmation) {
                    case 'Y': {
                        ab.removal(removeOption.getAE(removeNum));
                        System.out.println("You have successfully removed the " + removeOption.getAE(removeNum).getFirstName() + " " + removeOption.getAE(removeNum).getLastName() + " contact");
                        break;
                    }
                    case 'N': {
                        System.out.println("Request Canceled, return to menu");
                        break;
                    }
                    default: {
                        System.out.println("Invalid input, aborts method and returns to menu");
                    }
                }
            } else {
                System.out.println("No matching Name Found");
            }
        }
    }

    /**
     * a method that find and displays Entries that matches user input
     *
     * @param ab    the addressBook arraylist
     * @param input the scanner for user input
     */
    public static void findEntry(AddressBook ab, Scanner input) {
        if (ab.getAddressCount() == 0) {
            System.out.println("There are current no items in the Address book");
        } else {
            System.out.println("Enter in the beginning of the Last Name (or full) of contact you wish to find");
            System.out.print('>');
            /**a string that holds the beginning of name of the entry that user wishes to find
             * */
            String lastName = input.next();
            /**a temporary addressbook array that holds found entires
             * */
            AddressBook foundEntries = new AddressBook();
            for (int i = 0; i < ab.addressCount; i++) {
                if(ab.getAE(i).getLastName().length()>=lastName.length()) {
                    if (ab.getAE(i).getLastName().substring(0, lastName.length()).equals(lastName)) {
                        foundEntries.add(ab.getAE(i));
                    }
                }
            }
            if(foundEntries.getAddressCount() != 0) {
                System.out.println("The following " + foundEntries.getAddressCount() + " entries were found in the address book for a last name starting with: " + lastName);
                foundEntries.list();
            }
            else{
                System.out.println("No Matching Entry Found");
            }
        }
    }

    /**
     * a method that displays every single AddressBook items
     *
     * @param ab the addressBook arraylist
     */
    public static void displayList(AddressBook ab) {
        System.out.println("Current Address Book contains:");
        ab.list();
    }

    /**
     * a method that returns true to help exits the application
     *
     * @return true
     */
    public static boolean exitProgram() {
        System.out.println("GoodBye");
        return true;
    }

    /**
     * various prompt method that returns an attribute part that is from
     * the user's input
     *
     * @param input the scanner for user input
     * @returns a string containing first name
     */
    static String prompt_FirstName(Scanner input) {
        System.out.println("First Name: ");
        System.out.print('>');
        String firstName = input.next();
        return firstName;
    }

    /**
     * various prompt method that returns an attribute part that is from
     * the user's input
     *
     * @param input the scanner for user input
     * @returns a string containing last name
     */
    static String prompt_LastName(Scanner input) {
        System.out.println("Last Name");
        System.out.print('>');
        String lastName = input.next();
        return lastName;
    }

    /**
     * various prompt method that returns an attribute part that is from
     * the user's input
     *
     * @param input the scanner for user input
     * @returns a string containing street name
     */
    static String prompt_Street(Scanner input) {
        System.out.println("Street: ");
        System.out.print('>');
        String street = input.next();
        return street;
    }

    /**
     * various prompt method that returns an attribute part that is from
     * the user's input
     *
     * @param input the scanner for user input
     * @returns a string containing city name
     */
    static String prompt_City(Scanner input) {
        System.out.println("City: ");
        System.out.print('>');
        String city = input.next();
        return city;
    }

    /**
     * various prompt method that returns an attribute part that is from
     * the user's input
     *
     * @param input the scanner for user input
     * @returns a string containing state name
     */
    static String prompt_State(Scanner input) {
        System.out.println("State: ");
        System.out.print('>');
        String state = input.next();
        return state;
    }

    /**
     * various prompt method that returns an attribute part that is from
     * the user's input
     *
     * @param input the scanner for user input
     * @returns an integer containing zip code
     */
    static int prompt_Zip(Scanner input) {
        /** a correct input validation bool, false = stays in the loop, true = exit
         *
         */
        boolean valid = false;
        /** a temporary string that act as the medium to hand exceptions
         *
         */
        String temp;
        /** the zip code entry
         *
         */
        int zip = 0;
        System.out.println("Zip: ");
        System.out.print('>');
        while (!valid) {
            temp = input.next();
            valid = numCheck(temp);
            if (valid) {
                zip = Integer.parseInt(temp);
            } else {
                System.out.println("Invalid Zip code Entry, Please try again: ");
                System.out.print('>');
            }
        }

        return zip;
    }

    /**
     * a helper method that checks whether the input string is an integer
     *
     * @param input the test string
     * @return true if it contains integer, false if not
     */
    static boolean numCheck(String input) {
        if (input == null) {
            return false;
        }
        try {
            int test = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

    /**
     * various prompt method that returns an attribute part that is from
     * the user's input
     *
     * @param input the scanner for user input
     * @returns a string containing phone number
     */
    static String prompt_Telephone(Scanner input) {
        System.out.println("Phone: xxx-aaa-bbbb");
        System.out.print('>');
        String phone = input.next();
        return phone;
    }

    /**
     * various prompt method that returns an attribute part that is from
     * the user's input
     *
     * @param input the scanner for user input
     * @returns a string containing email address
     */
    static String prompt_Email(Scanner input) {
        System.out.println("Email: ");
        System.out.print('>');
        String email = input.next();
        return email;
    }
}
