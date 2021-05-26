package CE044_MobilePhone;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String phoneNumber) {
        myNumber = phoneNumber;
        this.myContacts = new ArrayList<Contact>();
    }

    public boolean addNewContact(Contact contact) {
      
        if (findContact(contact) < 0) {
            myContacts.add(contact);
            System.out.println("Contact " + contact.getName() + " added");
            return true;
        } else {
            System.out.println("Looks like contact " + contact.getName() + " is already on the list");
            return false;
        }
    }

    public boolean updateContact(Contact oldContact, Contact newContact){
        //System.out.println("[updateContact] Return true if updated and false if the contact does not exist");

        if (findContact(oldContact) < 0) {
            System.out.println("[update] Contact " + oldContact.getName() + " not found!");
            return false;
        } else {
            removeContact(oldContact);
            System.out.println("[update] Contact " + oldContact.getName() + " removed");
            addNewContact(newContact);
            return true;
        }
    }

    public boolean removeContact(Contact contact) {
        //System.out.println("[removeContact] Return true if removed and false if the contact does not exist");

        if (findContact(contact) >= 0) {

            System.out.println("[remove] Contact " + contact.getName() + " removed");
            myContacts.remove(contact);
            return true;
        } else {
            System.out.println("[remove] Contact " + contact.getName() + " not found");
            return false;
        }
    }

    private int findContact(Contact contact) {
        //System.out.println("[+findContact, contact] Return index or -1 if contact does not exist");

        return findContact(contact.getName());
    }

    private int findContact(String name) {
        //System.out.println("[+findContact, name] Return index or -1 if contact does not exist");

        for (int i = 0; i < myContacts.size(); i++) {
            if (name.equals(myContacts.get(i).getName())){
                System.out.println("findContact " + name + " positive, i = " + i);
                return i;
            }
        }
        System.out.println("findContact negative!");
        return -1;
    }

    public Contact queryContact(String name) {
        //System.out.println("[queryContact] Use String to search for name and than return Contact or NULL");

        for (int i = 0; i < myContacts.size(); i++) {
            if (name.equals(myContacts.get(i).getName())) {
                System.out.println("queryContact positive!");
                return myContacts.get(i);
            }
        }
        System.out.println("queryContact negative!");
        return null;
    }

    public void printContacts() {
        System.out.println("Contact List:");
        for (int i = 0; i < myContacts.size(); i++) {
            System.out.println((i + 1) + ". " + myContacts.get(i).getName() + " -> " +
                    myContacts.get(i).getPhoneNumber());
        }
    }
}
