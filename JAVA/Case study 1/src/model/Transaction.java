package model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Transaction {
    private int accountNo;
    private double amount;
    private String type;
    private String mode;
    private String status;
    private String dateTime;

    public Transaction(int accountNo, double amount, String type, String mode, String status) {
        this.accountNo = accountNo;
        this.amount = amount;
        this.type = type;
        this.mode = mode;
        this.status = status;
        this.dateTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }

    public int getAccountNo() { return accountNo; }
    public double getAmount() { return amount; }
    public String getType() { return type; }
    public String getMode() { return mode; }
    public String getStatus() { return status; }
    public String getDateTime() { return dateTime; }

    public void print() {
        System.out.println(dateTime + " | " + type + " | " + amount + " | " + mode + " | " + status);
    }

    public String toLine() {
        return dateTime + " | " + type + " | " + amount + " | " + mode + " | " + status;
    }
}
