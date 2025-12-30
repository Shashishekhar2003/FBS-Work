package model;

import java.io.PrintWriter;

public abstract class Account {
    protected int accountNumber;
    protected String ownerName;
    protected double balance;
    protected TransactionManager transactionManager;

    public Account(int accountNumber, String ownerName, double balance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
        this.transactionManager = new TransactionManager();
    }

    public int getAccountNumber() { return accountNumber; }
    public String getOwnerName() { return ownerName; }
    public double getBalance() { return balance; }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid deposit amount.");
            return;
        }
        balance += amount;
        transactionManager.addTransaction(new Transaction(accountNumber, amount, "Deposit", "Manual", "Success"));
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdraw amount.");
            return;
        }
        // default: allow if balance sufficient; subclasses may override
        if (balance >= amount) {
            balance -= amount;
            transactionManager.addTransaction(new Transaction(accountNumber, amount, "Withdraw", "Manual", "Success"));
        } else {
            transactionManager.addTransaction(new Transaction(accountNumber, amount, "Withdraw", "Manual", "Failed - Insufficient"));
            System.out.println("Insufficient balance.");
        }
    }

    public void recordTransaction(Transaction t) {
        transactionManager.addTransaction(t);
    }

    public void printTransactions() {
        transactionManager.printAll();
    }

    public void writeTransactions(PrintWriter out) {
        transactionManager.writeAll(out);
    }

    public abstract String getAccountType();
    public abstract void printDetails();
}
