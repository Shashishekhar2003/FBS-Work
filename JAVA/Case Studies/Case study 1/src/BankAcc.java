//import java.util.Scanner;
//
//abstract class Account{
//	
//	String accountNumber;
//	String accountHolder;
//	double balance;
//	
//	//Setter & Getter
//	public String getAccountNumber() {
//		return accountNumber;
//	}
//	public void setAccountNumber(String accountNumber) {
//		this.accountNumber = accountNumber;
//	}
//	public String getAccountHolder() {
//		return accountHolder;
//	}
//	public void setAccountHolder(String accountHolder) {
//		this.accountHolder = accountHolder;
//	}
//	public double getBalance() {
//		return balance;
//	}
//	public void setBalance(double balance) {
//		this.balance = balance;
//	}
//	
//	//ParameterConstructer
//	Account(String accountNumber, String accountHolder, double balance) {
//		this.accountNumber = accountNumber;
//		this.accountHolder = accountHolder;
//		this.balance = balance;
//	}
//	
//	
//	void deposit(double amount) {
//		balance = balance + amount;
//		System.out.println("Amount Deposited Successfully!");
//	}
//	
//	
//	//Abstract Method
//	abstract void withdraw(double amount);
//	
//	abstract double calculateIntrest();
//	
//	// Display
//	void printDetails() {
//		System.out.println("=*=*=*=*=*=*==*=*=*=*=*=*=*=*=*=");
//		System.out.println("Account Number :" + accountNumber);
//		System.out.println("Account Holder Name :" + accountHolder);
//		System.out.println("Balance :" + balance);
//		
//	}
//}  //Account class end here
//
//class SavingsAccount extends Account{
//	
//	double minimumBalance = 10000;
//
//	SavingsAccount(String accountNumber, String accountHolder, double balance) {
//		super(accountNumber, accountHolder, balance);
//	}
//	
//	@Override
//	public void withdraw(double amount) {
//		if(balance - amount < minimumBalance) {
//			System.out.println("You can not withdraw minimumBalance.");
//		}
//		else {
//			balance = balance-amount;
//		}
//		
//	}
//	
//	@Override
//	public double calculateIntrest() {
//		return balance* 0.03; //3%
//	}
//	
//}   // Class SavingsAccount ENd here
//
//class SalaryAccount extends SavingsAccount{
//	
//	int inactiveMonths = 0;
//	boolean isFrozen = false;
//	
//	
//	SalaryAccount(String accountNumber, String accountHolder, double balance) {
//		super(accountNumber, accountHolder, balance);
//	}
//	
//	void increaseInactivity(int months) {
//		inactiveMonths=inactiveMonths+months;
//		if(inactiveMonths>=2) {
//			isFrozen=true;
//			System.out.println("Account Frozen due to 2 months of inactivity!");
//		}
//	}
//	
//	@Override
//	public void withdraw(double amount) {
//		if(isFrozen) {
//			System.out.println("You can not Withdraw Account is Frozen ");
//			return;
//		}
//		super.withdraw(amount); 
//	}
//	
//	@Override
//	public double calculateIntrest() {
//		return balance*0.03;
//	}
//}//Class SalaryAccount end here
//
//class CurrentAccount extends Account{
//	
//	double overdraftLimit = 5000;
//
//	public CurrentAccount(String accountNumber, String accountHolder, double balance) {
//		super(accountNumber, accountHolder, balance);
//	}
//	
//	@Override
//	public void withdraw(double amount) {
//		if(balance+overdraftLimit >= amount) {
//			balance = balance-amount;
//			System.out.println("Withdraw Done ");		
//		}
//		else {
//			System.out.println("Cant Withdraw. OvertDraft lint extends ");
//		}
//		
//	}
//	
//	@Override
//	public double calculateIntrest() {
//		return 0;  //No Intrest for current account 
//	}
//}//Current class End here 
//
//class LoanAccount extends Account{
//
//	LoanAccount(String accountNumber, String accountHolder, double loanAmount) {
//		super(accountNumber, accountHolder, -loanAmount);
//
//	}
//	
//	@Override
//	public void withdraw(double amoount) {
//		System.out.println("Withdraw not for loan Account");
//	}
//	
//	@Override
//	public double calculateIntrest() {
//		return balance*0.10; //10%
//	}
//	
//	void rePay(double amount) {
//		balance = balance+amount;
//		System.out.println("Loan rePay Amount is "+ amount);
//	}
//}//LoanAccount End here
//
//class Transaction {
//	
//	String transactionType;
//	String accNo;
//	double amount;
//	String mode;
//	
//	//Setter Getter
//	public String getTransactionType() {
//		return transactionType;
//	}
//	public void setTransactionType(String transactionType) {
//		this.transactionType = transactionType;
//	}
//	public String getAccNo() {
//		return accNo;
//	}
//	public void setAccNo(String accNo) {
//		this.accNo = accNo;
//	}
//	public double getAmount() {
//		return amount;
//	}
//	public void setAmount(double amount) {
//		this.amount = amount;
//	}
//	public String getMode() {
//		return mode;
//	}
//	public void setMode(String mode) {
//		this.mode = mode;
//	}
//	
//	
//	public Transaction(String transactionType, String accNo, double amount, String mode) {
//		this.transactionType = transactionType;
//		this.accNo = accNo;
//		this.amount = amount;
//		this.mode = mode;
//	}
//	
//	void printTransaction() {
//		System.out.println("Transaction Type : "+ transactionType);
//		System.out.println("accNo : " + accNo);
//		System.out.println("Amount : " + amount);
//		System.out.println("Mode : " + mode);
//	}
//}//Transaction Class end here
//
//
//class Bank{
//	
//	Account accounts[] = new Account[50];
//	
//	Transaction transactions[] = new Transaction[200];
//	
//	int accCount=0;
//	int txnCount=0;
//	
//	
//	void addAccount(Account a) {
//		accounts[accCount] = a;
//		accCount++;
//		System.out.println("Account Added Done");
//		
//	}
//	
//	Account findAccount(String accNo) {
//		for(int i=0 ; i<accCount ; i++) {
//			if(accounts[i].accountNumber.equals(accNo)) {
//				return accounts[i];
//			}
//		}
//		
//		return null;
//	}
//	
//	void recordTransaction(String transactionType ,String accNo, double amount) {
//		transactions[txnCount] = new Transaction(transactionType,accNo,amount,"Manual");
//		txnCount++;
//	}
//	
//	void showAllTransactions() {
//		for(int i=0; i<txnCount ; i++) {
//			transactions[i].printTransaction();
//		}
//	}
//	
//	void endOfDayReport() {
//		System.out.println("********** End Of Day Report **********");
//		showAllTransactions();
//	}
//	
//}  // Bank class end here
//
//class BankController {
//	
//	Bank bank;
//
//	BankController(Bank bank) {
//			this.bank = bank;
//	}
//	
//	void createAccount(String type, String accNo, String name, double bal) {
//		Account a = null;  // temporary reference to store created object
//		if(type.equals("S")) {
//			a= new SavingsAccount(accNo, accNo, bal);
//		}
//		else if(type.equals("SAL")) {
//			a = new SalaryAccount(accNo, accNo, bal);
//		}
//		else if(type.equals("C")) {
//			a = new CurrentAccount(accNo, accNo, bal);
//		}
//		else if(type.equals("L")) {
//			a = new LoanAccount(accNo, accNo, bal);
//		}
//		
//		bank.addAccount(a);
//	}
//	
//	
//	void deposit(String acc, double amt) {
//		Account a = bank.findAccount(acc);
//		
//		if(a!=null) {
//			a.deposit(amt);
//			bank.recordTransaction("Deposit", acc, amt);
//		}
//		else {
//			System.out.println("Account not found");
//		}
//		
//	}
//	
//	void withdraw(String acc,double amt) {
//		Account a = bank.findAccount(acc);
//		
//		if(a!=null) {
//			a.withdraw(amt);
//			bank.recordTransaction("Withdaw", acc, amt);
//		}
//		else {
//			System.out.println("Account not founf");
//		}
//	}
//	
//	void increaseInactivity(String acc , int months) {
//		Account a = bank.findAccount(acc);
//		
//		if(a instanceof SalaryAccount) {
//			( (SalaryAccount) a).increaseInactivity(months);
//			
//		}
//		else {
//			System.out.println("Only Salary Account has inactivity rule");
//		}
//	}
//	
//	void showTransactions() {
//		bank.showAllTransactions();
//	}
//	
//	void report() {
//		bank.endOfDayReport();
//	}
//
//}  // BankController class end here
//
//
//class BankView{
//	
//	Scanner sc = new Scanner(System.in);
//	
//	int mainMenu() {
//		
//		 System.out.println("\n=== BANK EMPLOYEE MENU ===");
//	        System.out.println("1. Create Account");               
//	        System.out.println("2. Deposit");                      
//	        System.out.println("3. Withdraw");                     
//	        System.out.println("4. Salary Account Inactivity");    
//	        System.out.println("5. Show Transactions");            
//	        System.out.println("6. End Of Day Report");            
//	        System.out.println("7. Exit");
//	        
//	        System.out.println("Enter Choice :");
//	        return sc.nextInt();
//	}
//	
//	String inputString(String msg) {
//		System.out.println(msg);
//		return sc.next();
//	}
//	
//	double inputDouble(String msg) {
//		System.out.println(msg);
//		return sc.nextDouble();
//	}
//	
//	public int inputInt(String msg) {
//
//        System.out.print(msg);
//        return sc.nextInt();
//    }
//	
//} // BankView End here
//
//
//class Main {
//
//    public static void main(String[] args) {
//
//        Bank bank = new Bank();
//        BankController controller = new BankController(bank);
//        BankView view = new BankView();
//
//        while (true) {
//            int ch = view.mainMenu();
//
//            switch (ch) {
//
//            case 1:
//                String type = view.inputString("Enter Type (S/SAL/C/L): ");
//                String no = view.inputString("Account Number: ");
//                String name = view.inputString("Customer Name: ");
//                double bal = view.inputDouble("Initial Balance: ");
//                controller.createAccount(type, no, name, bal);
//                break;
//
//            case 2:
//                controller.deposit(
//                        view.inputString("Account No: "),
//                        view.inputDouble("Amount: ")
//                );
//                break;
//
//            case 3:
//                controller.withdraw(
//                        view.inputString("Account No: "),
//                        view.inputDouble("Amount: ")
//                );
//                break;
//
//            case 4:
//                controller.increaseInactivity(
//                        view.inputString("Salary Account No: "),
//                        view.inputInt("Enter inactive months: ")
//                );
//                break;
//
//            case 5:
//                controller.showTransactions();
//                break;
//
//            case 6:
//                controller.report();
//                break;
//
//            case 7:
//                System.out.println("Thank you!");
//                return;
//            }
//        }
//    }
//}
