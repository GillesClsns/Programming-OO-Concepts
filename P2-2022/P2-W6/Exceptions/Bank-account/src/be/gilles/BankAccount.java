package be.gilles;

public class BankAccount {

    private final String iban;

    public BankAccount(String iban) throws BankAccountException {

        if (!BankAccountValidator.isValidBelgianIban(iban))
            throw new BankAccountException(iban, 0);

        this.iban = iban;
    }

    public String getIban() {
        return iban;
    }

    @Override
    public String toString() {

        var sb = new StringBuilder();

        for (int i = 0; i < iban.length(); i++) {
            if (i % 4 == 0) sb.append(" ");
            sb.append(iban.charAt(i));
        }

        return sb.toString();
    }
}
