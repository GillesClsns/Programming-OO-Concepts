import be.gilles.BankAccount;
import be.gilles.BankAccountException;

public class Main {

    public static void main(String[] args) {

        try {

            BankAccount bankAccount = new BankAccount("BE74878361976407");
            System.out.println(bankAccount);
            bankAccount = new BankAccount("BE67988678823487");
            System.out.println(bankAccount);
            bankAccount = new BankAccount("BE95897976419459");
            System.out.println(bankAccount);

        } catch(BankAccountException e) {
            System.err.println("Ongeldig rekeningnummer.");
        }

    }

}
