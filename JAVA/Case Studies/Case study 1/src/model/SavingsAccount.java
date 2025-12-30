package model;

public class SavingsAccount extends Account {
    private double minBalance;
    private double interestRate; // percent

    public SavingsAccount(int acNo, String owner, double balance, double minBalance, double interestRate) {
        super(acNo, owner, balance);
        this.minBalance = minBalance;
        this.interestRate = interestRate;
    }

    public double getMinBalance() { return minBalance; }
    public double getInterestRate() { return interestRate; }

    @Override
    public String getAccountType() { return "Savings"; }

    @Override
    public void printDetails() {
        System.out.println("Savings Account - No: " + accountNumber + " Owner: " + ownerName);
        System.out.println("Balance: " + balance + " MinBalance: " + minBalance + " Interest%: " + interestRate);
    }

    public void applyInterest() {
        double interest = (balance * interestRate) / 100.0;
        if (interest > 0) {
            deposit(interest);
            System.out.println("Interest applied: " + interest);
        }
    }
}
