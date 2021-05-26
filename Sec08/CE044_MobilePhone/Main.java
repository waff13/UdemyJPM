package CE044_MobilePhone;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        MobilePhone mobilePhone = new MobilePhone("123456789");
        Contact c1 = new Contact("Alise", "123456");
        mobilePhone.addNewContact(c1);
        mobilePhone.addNewContact(new Contact("Bob", "456789"));
        mobilePhone.addNewContact(new Contact("Charlie", "789123"));
        mobilePhone.printContacts();

        //mobilePhone.queryContact("Bob");
        //mobilePhone.queryContact("Rob");

        System.out.println("~~~~");

        //System.out.println("$$$$");
        //mobilePhone.addNewContact(new Contact("Charlie", "789123"));
        //mobilePhone.addNewContact(new Contact("Charly", "789123"));

        //mobilePhone.printContacts();

        //mobilePhone.removeContact(new Contact("John", "963258"));
        //mobilePhone.removeContact(new Contact("Charly", "789123"));

        //mobilePhone.printContacts();

        //System.out.println("=======");

        //Contact c5 = new Contact("Dolph", "753159");
        //mobilePhone.printContacts();
        //mobilePhone.removeContact(c5);
        //mobilePhone.updateContact(c1, new Contact("Alex", "741258"));
        //mobilePhone.updateContact(c5, new Contact("Daisy", "986532"));
        //mobilePhone.printContacts();

        mobilePhone.printContacts();
        mobilePhone.removeContact(c1);
        mobilePhone.printContacts();

    }
}
