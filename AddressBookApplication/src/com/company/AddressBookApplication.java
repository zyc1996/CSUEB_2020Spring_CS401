package com.company;

public class AddressBookApplication {

    public static void main(String[] args) {
        //invokes static methods of the Menu Class
//        Menu.prompt_FirstName();
//        Menu.prompt_LastName();
//        Menu.prompt_Street();
//        Menu.prompt_City();
//        Menu.prompt_State();
//        Menu.prompt_Zip();
//        Menu.prompt_Telephone();
//        Menu.prompt_Email();

        AddressBook addressBook = new AddressBook();
        initAddressBookExercise(addressBook);

    }

    static void initAddressBookExercise(AddressBook ab){
        AddressEntry firstEntry = new AddressEntry("John","CheeseBurger","Beef Lane", "Burger Town", "CA", 98333,"925-ham-beef", "JohnB@gmail.com");
        AddressEntry secEntry = new AddressEntry("Lucy", "Tacos","Nacho Court", "Cheese Town", "CA", 95432, "325-egg-pork", "LucyT@yahoo.com");

        ab.add(firstEntry);
        ab.add(secEntry);

        ab.list();
    }
}
