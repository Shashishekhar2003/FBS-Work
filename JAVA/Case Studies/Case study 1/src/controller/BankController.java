package controller;

import model.*;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class BankController {
    private BankModel model;

    public BankController() { model = new BankModel(); }

    public void addAccount(Account a) {
        if (model.getAccount(a.getAccountNumber()) != null) {
            System.out.println("Account already exists.");
            return;
        }
        model.addAccount(a);
        System.out.println("Account created.");
    }

    public Account find(int acNo) { return model.getAccount(acNo); }
    public Account[] getAll() { return model.getAllAccounts(); }

    public void deposit(int acNo, double amt) {
        Account a = model.getAccount(acNo);
        if (a == null) { System.out.println("Account not found."); return; }
        a.deposit(amt);
    }

    public void withdraw(int acNo, double amt) {
        Account a = model.getAccount(acNo);
        if (a == null) { System.out.println("Account not found."); return; }
        a.withdraw(amt);
    }

    public void applyInterestToSavings(int acNo) {
        Account a = model.getAccount(acNo);
        if (a instanceof SavingsAccount) ((SavingsAccount)a).applyInterest();
        else System.out.println("Not a savings account.");
    }

    public void applyInterestToLoan(int acNo) {
        Account a = model.getAccount(acNo);
        if (a instanceof LoanAccount) ((LoanAccount)a).applyInterest();
        else System.out.println("Not a loan account.");
    }

    public void payEmi(int acNo, double amt) {
        Account a = model.getAccount(acNo);
        if (a instanceof LoanAccount) ((LoanAccount)a).payEmi(amt);
        else System.out.println("Not a loan account.");
    }

    public void deleteAccount(int acNo) { model.removeAccount(acNo); }

    public void endOfDayReport() {
        System.out.println("\n--- End Of Day Report ---");
        for (Account a : model.getAllAccounts()) {
            a.printDetails();
            System.out.println("Transactions:");
            a.printTransactions();
            System.out.println("-------------------------");
        }
    }

    public void generatePDF() {
        try (PrintWriter out = new PrintWriter(new FileWriter("/mnt/data/EndOfDayReport.pdf"))) {
            out.println("End Of Day Report");
            out.println("=================\n");
            for (Account a : model.getAllAccounts()) {
                out.println("Account: " + a.getAccountNumber() + " - " + a.getOwnerName() + " - " + a.getAccountType());
                out.println("Balance: " + a.getBalance());
                out.println("Transactions:");
                a.writeTransactions(out);
                out.println("---------------------\n");
            }
            System.out.println("PDF written to /mnt/data/EndOfDayReport.pdf");
        } catch (IOException e) {
            System.out.println("Error writing PDF: " + e.getMessage());
        }
    }
}
