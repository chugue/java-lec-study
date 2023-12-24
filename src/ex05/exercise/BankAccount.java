package ex05.exercise;

public class BankAccount {
    private int balance;

    public BankAccount(int balance) {
        this.balance = balance;
    }
    public int getBalance(){
        return balance;
    }
    public void setBalance(int amount){
        this.balance = amount;
    }
    public void transfer(int amount, BankAccount p){
        this.balance = this.balance - amount;
        p.balance = p.balance + amount;
    }
    public String toString(){
        return "BankAccount [balance="+ this.balance +"]";
    }

    public static void main(String[] args) {
        BankAccount a1 = new BankAccount(10000);
        BankAccount a2 = new BankAccount (0);
        System.out.println("a1 : " + a1);
        System.out.println("a1 : " + a2 + "\n");
        a1.transfer(1000, a2);
        System.out.println("a1 : " + a1);
        System.out.println("a2 : " + a2);
    }
}
