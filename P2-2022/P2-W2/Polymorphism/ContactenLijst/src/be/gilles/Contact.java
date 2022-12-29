package be.gilles;

public class Contact {

    private final String naam;
    private final ContactGegevens contactgegevens;

    public Contact(String naam, ContactGegevens contactgegevens) {
        this.naam = naam;
        this.contactgegevens = contactgegevens;
    }

    public String getNaam() {
        return naam;
    }

    public ContactGegevens getContactgegevens() {
        return contactgegevens;
    }

    @Override
    public String toString() {
        return String.format("%s %s", getNaam(), getContactgegevens());
    }

}
