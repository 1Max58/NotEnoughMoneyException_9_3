package com.example.account;

public class Account {
    private String owner;
    private int balance;
    private String accountNumber;

    public Account(String o, int b, String an) {
        owner = o;
        balance = b;
        accountNumber = an;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String o) {
        owner = o;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int b) {
        balance = b;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String an) {
        accountNumber = an;
    }

    public void transfer(int sum, Account recipient) {
        balance -= sum;
        recipient.balance += sum;
    }
}
