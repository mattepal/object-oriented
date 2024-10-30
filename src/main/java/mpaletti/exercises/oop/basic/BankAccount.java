package mpaletti.exercises.oop.basic;

public class BankAccount {
    double balance;

    public BankAccount() {
        this.balance=0;
    }
    public BankAccount(double balance) {
        this.balance = balance;
    }
    public double getBalance(){
        return this.balance;
    }
    public void deposit(double amount){
        balance+=amount;
    }
    public void withdraw(double ammount){
        balance-=ammount;
    }
}
