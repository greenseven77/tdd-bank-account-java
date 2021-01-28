package org.xpdojo.bank;

public class Account {
    private int balance = 0;

    public double balance(){
        return balance;
    }
    public void deposit(int amount){
        balance += amount;
    }
}
