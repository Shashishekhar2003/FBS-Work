package model;

public class LoanAccount extends Account {
    private double loanAmount;
    private double interestRate;
    private double emi;
    private String dueDate;

    public LoanAccount(int acNo, String owner, double loanAmount, double interestRate, double emi, String dueDate) {
        super(acNo, owner, -Math.abs(loanAmount));
        this.loanAmount = loanAmount;
        this.interestRate = interestRate;
        this.emi = emi;
        this.dueDate = dueDate;
    }

    public double getLoanAmount() { return loanAmount; }
    public double getInterestRate() { return interestRate; }
    public double getEmi() { return emi; }
    public String getDueDate() { return dueDate; }

    @Override
    public String getAccountType() { return "Loan"; }

    @Override
    public void printDetails() {
        System.out.println("Loan Account - No: " + accountNumber + " Owner: " + ownerName);
        System.out.println("Balance(owed): " + balance + " LoanAmt: " + loanAmount + " Interest%: " + interestRate + " EMI: " + emi + " Due: " + dueDate);
    }

    public void applyInterest() {
        double owed = -balance;
        double interest = (owed * interestRate) / 100.0;
        balance -= interest;
        transactionManager.addTransaction(new Transaction(accountNumber, interest, "InterestCharge", "System", "Success"));
        System.out.println("Loan interest applied: " + interest);
    }

    public void payEmi(double amount) {
        if (amount <= 0) { System.out.println("Invalid EMI amount."); return; }
        balance += amount;
        transactionManager.addTransaction(new Transaction(accountNumber, amount, "EMIPayment", "Manual", "Success"));
        System.out.println("EMI paid: " + amount);
    }
}
