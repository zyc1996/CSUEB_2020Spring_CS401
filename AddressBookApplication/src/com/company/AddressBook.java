package com.company;

import java.util.ArrayList;
import java.util.Iterator;

class AddressBook {
    private ArrayList<AddressEntry> addressEntryList;

    public AddressBook(){
        addressEntryList = new ArrayList<AddressEntry>();
    }
    //iterate through addressEntryList and for each item call toString and print it out
    public void list() {
        Iterator it = addressEntryList.iterator();
        System.out.println("Current Address Book contains:");
        while(it.hasNext()){
            System.out.println(it.next().toString());
        }
    }

    //add new addressEntry object to the addressEntryList
    public void add(AddressEntry ae){
        addressEntryList.add(ae);
    }



}
