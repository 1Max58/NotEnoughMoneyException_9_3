package com.example.account;

public class Main {
    public static void main(String[] args) {
        Account account1 = new Account("John", 100, "12345");
        System.out.println(account1.getOwner() + " has the account #" + account1.getAccountNumber() + " with balance " + account1.getBalance());
        Account account2 = new Account("Will", 200, "67890");
        System.out.println(account2.getOwner() + " has the account #" + account2.getAccountNumber() + " with balance " + account2.getBalance());
        try {
            try {
                System.out.println("Try to transfer sum 150 from the first account to the second one...");
                account1.transfer(150, account2);
            } catch (Exception e) {
                System.out.println(e);
            }
        } finally {
            System.out.println("Finally balance of the first account is " + account1.getBalance());
        }
    }
}
