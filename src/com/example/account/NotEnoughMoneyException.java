package com.example.account;

public class NotEnoughMoneyException extends Exception {
    String accountNumber;
    int balance;
    int sum;
    public NotEnoughMoneyException(String an, int b, int s) {
        accountNumber = an;
        balance = b;
        sum = s;
    }

    @Override
    public String toString() {
        return "Not enough money on account " + accountNumber +
                ": balance (" + balance +
                ") is less than required sum (" + sum + ")";
    }
}
