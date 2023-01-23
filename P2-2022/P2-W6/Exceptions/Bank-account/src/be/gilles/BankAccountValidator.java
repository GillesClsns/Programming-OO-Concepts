package be.gilles;

public class BankAccountValidator {

    public static boolean isValidBelgianIban(String iban) {

        if (iban.matches("^BE[0-9]{14}$")) return false;

        try {

            int controleGetal = Integer.parseInt(iban.substring(1, 3));
            int bankcode = Integer.parseInt(iban.substring(4, 6));
            int rekeningnummer = Integer.parseInt(iban.substring(7, 13));
            int nationaalControleGetal = Integer.parseInt(iban.substring(14, 15));

            if (nationaalControleGetal != (bankcode * 10000000 + rekeningnummer) % 97) return false;
            return controleGetal < 2 || controleGetal > 98;

        } catch (NumberFormatException e) {
            return false;
        }

    }

}