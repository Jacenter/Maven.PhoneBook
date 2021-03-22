package com.zipcodewilmington.phonebook;

import java.util.*;
//import java.util.HashMap;


/**
 * Created by leon on 1/23/18.
 * Made WAY better by kristofer 6/16/20
 */
public class PhoneBook {

    private Map<String, List<String>> phonebook;

    public PhoneBook(Map<String, List<String>> map) {
        phonebook = map;
    }

    public PhoneBook() {
        phonebook = new LinkedHashMap<>();
    }

    public void add(String name, String phoneNumber) {
        ArrayList<String> phoneNum = new ArrayList<>(Arrays.asList(phoneNumber));
        phonebook.put(name, phoneNum);
    }

    public void addAll(String name, String... phoneNumbers) {
        ArrayList<String> phoneNum = new ArrayList<>(Arrays.asList(phoneNumbers));
        phonebook.put(name,phoneNum);
    }

    public void remove(String name) {
        phonebook.remove(name);
    }

    public Boolean hasEntry(String s, String name) {
        ArrayList<String> phoneRecords = new ArrayList<>(Arrays.asList(name));
        return phonebook.containsValue(phoneRecords) || phonebook.containsKey(name);
    }

    public List<String> lookup(String name) {
        return phonebook.get(name);
    }

    public String reverseLookup(String phoneNumber)  {
        List<List<String>> phones = new ArrayList<List<String>>(phonebook.values());
        ArrayList<String> num = new ArrayList<>(Arrays.asList(phoneNumber));
        int indx = phones.indexOf(num);
        String[] names = phonebook.keySet().toArray(new String [phonebook.size()]);
        return names[indx];

    }

    public List<String> getAllContactNames() {
        ArrayList<String> names = new ArrayList<>();
        for (String name : phonebook.keySet()){names.add(name);}
        return names;
    }

    public Map<String, List<String>> getMap() {
        return phonebook;
    }
}

//C:\Users\Jared\Maven.PhoneBook\src\main\java\com\zipcodewilmington\phonebook\PhoneBook.java