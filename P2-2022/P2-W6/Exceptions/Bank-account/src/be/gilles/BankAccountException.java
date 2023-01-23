package be.gilles;

import java.text.ParseException;

public class BankAccountException extends ParseException {

    public BankAccountException(String s, int errorOffset) {
        super(s, errorOffset);
    }
}
