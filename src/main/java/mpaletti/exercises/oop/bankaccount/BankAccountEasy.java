package mpaletti.exercises.oop.bankaccount;

public class BankAccountEasy extends AbstractBankAccount{

    protected BankAccountEasy(double balance, String IBAN, double interestRate, double operationFee) {
        super(balance, IBAN, 0,0);
    }
    public double withdraw(double amount){
        double allowedwith=Math.min(balance,amount);
        return super.withdraw(allowedwith);
    }
    public double transfer(BankAccount other,double amount){
        String countryOther= other.getIBAN().substring(0,2);
        String countryIBAN= IBAN.substring(0,2);
        if(!countryIBAN.equals(countryOther)){
            new IllegalArgumentException("international transfert invalid");
        }
        double allowed=Math.min(amount,balance);
        super.transfer(other,allowed);
        return allowed;
    }
}
