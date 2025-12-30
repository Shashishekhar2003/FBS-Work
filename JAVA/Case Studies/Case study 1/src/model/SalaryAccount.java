package model;

public class SalaryAccount extends Account {
    private String employerName;
    private double salaryLimit;

    public SalaryAccount(int acNo, String owner, double balance, String employerName, double salaryLimit) {
        super(acNo, owner, balance);
        this.employerName = employerName;
        this.salaryLimit = salaryLimit;
    }

    public String getEmployerName() { return employerName; }
    public double getSalaryLimit() { return salaryLimit; }

    @Override
    public String getAccountType() { return "Salary"; }

    @Override
    public void printDetails() {
        System.out.println("Salary Account - No: " + accountNumber + " Owner: " + ownerName);
        System.out.println("Balance: " + balance + " Employer: " + employerName + " SalaryLimit: " + salaryLimit);
    }
}
