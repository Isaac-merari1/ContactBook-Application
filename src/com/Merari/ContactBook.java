package com.Merari;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ContactBook {

    private Map<String, PersonInfo> contacts = new HashMap<String, PersonInfo>();

    public Map<String, PersonInfo> getContacts() {
        System.out.println(getContacts());
        return contacts;
    }

    public void addContact(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The firstname of the Person");
        String firstName = scanner.nextLine();
        System.out.println("Enter the lastName of the Person");
        String lastName = scanner.nextLine();
        System.out.println("Enter the Phone Number");
        int phoneNumber = scanner.nextInt();

      //  System.out.println("The firstName is  " + firstName + "Last Name is" + lastName + " and the Number is  " + phoneNumber);
        PersonInfo personInfo = new PersonInfo();
        personInfo.setFirstName(firstName);
        personInfo.setLastName(lastName);
        personInfo.setPhoneNumber(phoneNumber);

        this.contacts.put(personInfo.getFirstName(), personInfo);
    }

    public void getAllContacts(){
        this.contacts.forEach((key,value)->{
            System.out.println("First Name = " + value.getFirstName() + " Last Name = " + value.getLastName() + " Phone Number " + value.getPhoneNumber());
            System.out.println("Contact successfully added!!");
        });
    }

    public String searchContact(String name){

        return name;
    }

    public String updateContact(String name, PersonInfo personInfo){

        return updateContact(name, personInfo);
    }

    public void deleteContact(){

    }

}

