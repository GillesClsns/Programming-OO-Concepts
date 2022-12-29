package be.gilles;

import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Stream;

public class Contacten {

    private Contact[] contacts;
    private int aantal;

    public Contacten() {
        this.contacts = new Contact[100];
        this.aantal = 0;
    }

    public void voegContactToe(Contact contact) {
        if (aantal <= contacts.length) {
            this.contacts[aantal++] = contact;
        }
    }

    public Contact getContact(int index) {
        return contacts[index];
    }

    public int getAantal() {
        return aantal;
    }

    public void verwijderContact(int index) {

        // Check if the index is valid
        if (index < 0 || index >= contacts.length) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }

        // Shift the elements after the index to the left
        for (int i = index + 1; i < contacts.length; i++) {
            contacts[i - 1] = contacts[i];
        }

        // Set the last element to 0
        contacts[contacts.length - 1] = null;
    }

    public void printContacts() {
        Arrays.stream(contacts).filter(Objects::nonNull).forEach(System.out::println);
    }

}
