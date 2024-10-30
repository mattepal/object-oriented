package mpaletti.exercises.oop.bankaccount;

public abstract class AbstractBankAccount {
    protected double balance;
    protected String IBAN;
    protected double interestRate;
    protected double operationFee;

    protected AbstractBankAccount(double balance, String IBAN, double interestRate, double operationFee) {
        this.balance = balance;
        setIBAN(IBAN);
        this.interestRate = interestRate;
        setOperationFee(operationFee);
    }
    protected  void checkPositiveValue(double value){
        if(value < 0.0){
            throw new IllegalArgumentException("Negative values are not allowed for this operation");
        }
    }


    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getIBAN() {
        return IBAN;
    }

    public void setIBAN(String IBAN) {
        BankAccount.checkIBAN(IBAN);
        this.IBAN = IBAN;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getOperationFee() {
        return operationFee;
    }

    public void setOperationFee(double operationFee) {
        checkPositiveValue(operationFee);
        this.operationFee = operationFee;
    }
    public void deposit(double amount){
        checkPositiveValue(amount);
        this.balance+=amount;
    }
    public double withdraw(double amount){
        checkPositiveValue(amount);
        this.balance-=amount;
        return balance;
    }
    public double transfer(BankAccount other,double amount){
        checkPositiveValue(amount);
        withdraw(amount);
        other.deposit(amount);
        return amount;
    }
    public void addInterest(){
        balance=balance*interestRate;
    }
    protected void applyFee(){
        balance=balance-operationFee;
    }
}
