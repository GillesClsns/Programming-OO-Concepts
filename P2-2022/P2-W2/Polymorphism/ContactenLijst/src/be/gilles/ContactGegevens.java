package be.gilles;

public class ContactGegevens {

    private final String email;
    private final Telefoonnummer vasteTelefoon;
    private final Telefoonnummer mobieleTelefoon;

    public ContactGegevens(String email, String vasteTelefoon, String mobieleTelefoon) {
        this.email = email;
        this.vasteTelefoon = new Telefoonnummer(Telefoonnummer.Soort.VAST, vasteTelefoon);
        this.mobieleTelefoon = new Telefoonnummer(Telefoonnummer.Soort.MOBIEL, mobieleTelefoon);
    }

    public String getEmail() {
        return email;
    }

    public Telefoonnummer getVasteTelefoon() {
        return vasteTelefoon;
    }

    public Telefoonnummer getMobieleTelefoon() {
        return mobieleTelefoon;
    }

    @Override
    public String toString() {
        return String.format("%s, %s, %s", getEmail(), getVasteTelefoon(), getMobieleTelefoon());
    }

}
