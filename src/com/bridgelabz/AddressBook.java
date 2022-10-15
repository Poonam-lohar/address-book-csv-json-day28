package com.bridgelabz;

 class Contact {
    private String firstName, lastName, address, city, state, email;
    private int zip;
    private long phoneNumber;

    /**
     * Used Constructor to store the Parameter
     * Also used this keyword to make difference between class name variable and constructor name variable
     * because both the variables are same.
     * @param firstName persons 1st name in address book
     * @param lastName persons last name in address book
     * @param address persons last name in address book
     * @param city persons address in address book
     * @param state persons state name in address book
     * @param email persons email id in address book
     * @param zip persons zip in address book
     * @param phoneNumber persons phone no in address book
     */
    public Contact(String firstName, String lastName, String address, String city, String state, String email, int zip, long phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.email = email;
        this.zip = zip;
        this.phoneNumber = phoneNumber;
    }

    /**
     *  Used getter and setter to set and get the value.
     *  Setter is used to set the value
     *  Getter is used to get the value
     */
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}

/**
 * create main class name as AddressBookSystem
 */
public class AddressBook{
    /**
     * create a main method ,all program execute in main method
     * @param args no arguments
     */

    public static void main(String[] args) {
        /**
         * 1st print welcome msg.
         */
        System.out.println("Welcome to Address Book System\n");
        /**
         * We are just calling an object using class name.
         * Simply passing the argument value according to the parameter defined in the constructor.
         */
        Contact details = new Contact("Poonam", "Lohar", "Shirol", "Shirol",
                "Maharashtra", "loharpoonam98@gmail.com", 416103, 9876543234L);
        System.out.println("The following contact details is mentioned below : \n");
        System.out.println("First Name : " + details.getFirstName());
        System.out.println("Last Name  : " + details.getLastName());
        System.out.println("Address    : " + details.getAddress());
        System.out.println("City       : " + details.getCity());
        System.out.println("State      : " + details.getState());
        System.out.println("E-mail     : " + details.getEmail());
        System.out.println("Zip Code   : " + details.getZip());
        System.out.println("Phone No   : " + details.getPhoneNumber());
    }
}
