package view;

import controller.BankController;
import model.*;

import java.util.Scanner;

public class BankView {
    private Scanner sc = new Scanner(System.in);
    private BankController controller = new BankController();

    public void start() {
        while (true) {
            printMenu();
            int ch = readInt();
            switch (ch) {
                case 1: createSavings(); break;
                case 2: createCurrent(); break;
                case 3: createSalary(); break;
                case 4: createLoan(); break;
                case 5: deposit(); break;
                case 6: withdraw(); break;
                case 7: showDetails(); break;
                case 8: controller.endOfDayReport(); break;
                case 9: controller.generatePDF(); break;
                case 0: System.out.println("Exiting..."); return;
                default: System.out.println("Invalid choice");
            }
        }
    }

    private void printMenu() {
        System.out.println("\n=== BANK MENU ===");
        System.out.println("1. Create Savings Account");
        System.out.println("2. Create Current Account");
        System.out.println("3. Create Salary Account");
        System.out.println("4. Create Loan Account");
        System.out.println("5. Deposit");
        System.out.println("6. Withdraw");
        System.out.println("7. Show Account Details");
        System.out.println("8. End Of Day Report (console)");
        System.out.println("9. Generate PDF Report");
        System.out.println("0. Exit");
        System.out.print("Enter choice: ");
    }

    private int readInt() {
        try { return Integer.parseInt(sc.nextLine().trim()); }
        catch(Exception e) { return -1; }
    }

    private double readDouble() {
        try { return Double.parseDouble(sc.nextLine().trim()); }
        catch(Exception e) { return 0; }
    }

    private void createSavings() {
        System.out.print("Account No: "); int ac = readInt();
        System.out.print("Owner: "); String name = sc.nextLine();
        System.out.print("Initial Balance: "); double bal = readDouble();
        // defaults: minBalance=1000, interest=5.2
        controller.addAccount(new SavingsAccount(ac, name, bal, 1000, 5.2));
    }

    private void createCurrent() {
        System.out.print("Account No: "); int ac = readInt();
        System.out.print("Owner: "); String name = sc.nextLine();
        System.out.print("Initial Balance: "); double bal = readDouble();
        // default overdraft 10000
        controller.addAccount(new CurrentAccount(ac, name, bal, 10000));
    }

    private void createSalary() {
        System.out.print("Account No: "); int ac = readInt();
        System.out.print("Owner: "); String name = sc.nextLine();
        System.out.print("Initial Balance: "); double bal = readDouble();
        // default employer Company, salaryLimit 50000
        controller.addAccount(new SalaryAccount(ac, name, bal, "Company", 50000));
    }

    private void createLoan() {
        System.out.print("Account No: "); int ac = readInt();
        System.out.print("Owner: "); String name = sc.nextLine();
        System.out.print("Loan Amount: "); double loan = readDouble();
        // defaults interest 10, emi 2500, dueDate "10th Every Month"
        controller.addAccount(new LoanAccount(ac, name, loan, 10.0, 2500, "10th Every Month"));
    }

    private void deposit() {
        System.out.print("Account No: "); int ac = readInt();
        System.out.print("Amount: "); double amt = readDouble();
        controller.deposit(ac, amt);
    }

    private void withdraw() {
        System.out.print("Account No: "); int ac = readInt();
        System.out.print("Amount: "); double amt = readDouble();
        controller.withdraw(ac, amt);
    }

    private void showDetails() {
        System.out.print("Account No: "); int ac = readInt();
        Account a = controller.find(ac);
        if (a == null) { System.out.println("Not found"); return; }
        a.printDetails();
        System.out.println("Transactions:"); a.printTransactions();
        if (a instanceof SavingsAccount) {
            System.out.println("(You can apply interest via controller.applyInterestToSavings)");
        } else if (a instanceof LoanAccount) {
            System.out.println("(You can apply loan interest or pay EMI via controller)");
        }
    }
}
