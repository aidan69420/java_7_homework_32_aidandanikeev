package com.company;

public class Wallet {
    int balance;

    public void addBalance(int money){
        this.balance = balance + money;
    }

    public Wallet() {
    }


    @Override
    public String toString() {
        return "Ваш баланс: " + balance;
    }

    public Wallet(int balance) {
        this.balance = balance;
    }
}
