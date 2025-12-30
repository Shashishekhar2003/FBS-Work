package model;

public class CurrentAccount extends Account {
    private double overdraftLimit;

    public CurrentAccount(int acNo, String owner, double balance, double overdraftLimit) {
        super(acNo, owner, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() { return overdraftLimit; }

    @Override
    public String getAccountType() { return "Current"; }

    @Override
    public void printDetails() {
        System.out.println("Current Account - No: " + accountNumber + " Owner: " + ownerName);
        System.out.println("Balance: " + balance + " OverdraftLimit: " + overdraftLimit);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= 0) { System.out.println("Invalid amount."); return; }
        if (balance + overdraftLimit >= amount) {
            balance -= amount;
            transactionManager.addTransaction(new Transaction(accountNumber, amount, "Withdraw", "Manual", "Success"));
        } else {
            transactionManager.addTransaction(new Transaction(accountNumber, amount, "Withdraw", "Manual", "Failed - Overdraft"));
            System.out.println("Cannot withdraw: overdraft limit exceeded.");
        }
    }
}
