package mpaletti.exercises.oop.bankaccount;

public class BankAccountPro extends AbstractBankAccount {

    protected BankAccountPro(double balance, String IBAN) {
        super(balance,IBAN,0.02,1);
    }
    public void deposit(double amount){
        super.deposit(amount);
        applyFee();
    }
    public double withdraw(double amount){
        double outAmount=super.withdraw(amount);
        applyFee();
        return outAmount;
    }
}
