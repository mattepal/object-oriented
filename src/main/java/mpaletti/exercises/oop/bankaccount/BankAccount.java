package mpaletti.exercises.oop.bankaccount;

public interface BankAccount {
    String getIBAN();
    void setIBAN(String IBAN);
    double getBalance();
    void setBalance(double balance);
    double getOperationFee();
    double setOperationFee(double operationFee);
    double getInterestRate();
    void setInterestRate(double interestRate);
    void deposit(double amount);
    double withdraw(double amount);
    double transfer(BankAccount other,double amount);
    void addInterest();
    static void checkIBAN(String IBAN){
        if(IBAN.length()<8 ||IBAN.length()>34){
            new IllegalArgumentException("invalid length");
        }
        String country= IBAN.substring(0,2);
        if(!Character.isLetter(country.charAt(0)) && !Character.isLetter(country.charAt(1))){
            new IllegalArgumentException("invalid country code");
        }
        if(!Character.isUpperCase(country.charAt(0)) && !Character.isUpperCase(country.charAt(1))){
            new IllegalArgumentException("invalid country code");
        }
    }

}
