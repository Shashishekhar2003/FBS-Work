

abstract class Payment {
	int paymentId;
	int amount;
	String payerName;
	String status="PENDING";
	
	//Setter & Getter
	public int getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getPayerName() {
		return payerName;
	}
	public void setPayerName(String payerName) {
		this.payerName = payerName;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	//Drfault Constructer
	Payment(){
		paymentId=0;
		amount=0;
		payerName="Not Given";
	}
	
	// Parameter Constructer
	Payment(int paymentId, int amount, String payerName, String status) {
		this.paymentId = paymentId;
		this.amount = amount;
		this.payerName = payerName;
		// status not assigned intentionally because user didn’t use it
	}
	
	void printSummary() {
		System.out.println("Payment ID :" + this.paymentId);
		System.out.println("Amount :" + this.amount);
		System.out.println("Payer Name" + this.payerName);
		System.out.println("Status :" + this.status);	
	}
	
	
	final void process() {
		
		if(!validate()) {
			status = "FAILED";
			return;
		}
		deductAmount();
		sendNotification();
		status = "SUCCESS";
	}
	
	//Abstract Methods 
	abstract boolean validate();
	abstract void deductAmount();
	abstract void sendNotification();
	
} // Class Payment End Here




class CardPayment extends Payment {
	
	long cardNumber;
	int cvv;
	
	//Setter & Getter
	public long getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(long cardNumber) {
		this.cardNumber = cardNumber;
	}
	public int getCvv() {
		return cvv;
	}
	public void setCvv(int cvv) {
		this.cvv = cvv;
	}
	
	//Default Constructer
	CardPayment(){
		super();
		cardNumber=0000000000;
		cvv=000;
	}
	
	//Parameter COnstructer
	CardPayment(int paymentId, int amount, String payerName, long cardNumber, int cvv) {
		super(paymentId, amount, payerName, "PENDING");   
		this.cardNumber = cardNumber;
		this.cvv = cvv;
	}
	
	
	boolean validate() {
		return (String.valueOf(cardNumber).length() == 16 && String.valueOf(cvv).length() == 3 && amount > 0);
	}  // String.valueOf(cardNumber) => Converts any value into a String.
	
	void deductAmount()
	{
		System.out.println("Amount Deducted is : " + amount);
	}
	
	void sendNotification() {
		System.out.println("Card Payment Notification Sent");
	}
	
	
} // Class Card Payment End here


class UPIPayment extends Payment{
	
	String upiID;

	public String getUpiID() {
		return upiID;
	}

	public void setUpiID(String upiID) {
		this.upiID = upiID;
	}

	public UPIPayment() {
		super();
		
	}

	//Parameter Constructer
	public UPIPayment(int paymentId, int amount, String payerName, String upiID) {
		super(paymentId, amount, payerName, "PENDING");
		this.upiID = upiID;
	}
	
	boolean validate() {
		return (upiID.contains("@") && amount >= 1 && amount <= 100000);
	}
	
	void deductAmount() {
        System.out.println("UPI Payment Deducted: " + amount);
    }

    void sendNotification() {
        System.out.println("UPI Payment Notification Sent");
    }
	
	
}// Class UPIID End here

class PaymentMain {
    public static void main(String[] args) {

        // Creating payment objects
        Payment p1 = new CardPayment(101, 0, "Yashodeep", 1234567891234567L, 123);
        Payment p2 = new UPIPayment(102, 2500, "Shashi", "shashi@ybl");
        Payment p3 = new CardPayment(103, 1200, "Rahul", 9876543212345678L, 567);
        Payment p4 = new UPIPayment(104, 750, "Sneha", "sneha@oksbi");

        // Processing payments
        p1.process();
        p2.process();
        p3.process();
        p4.process();

        // Printing final payment summary
        System.out.println("\n--- Payment Summary ---");
        p1.printSummary();
        System.out.println();
        p2.printSummary();
        System.out.println();
        p3.printSummary();
        System.out.println();
        p4.printSummary();
    }
}
