package Login;

public class Login {
	String username;
	int password;

	
	 Login(String username, int password) {
		this.username = username;
		this.password = password;
	}

	 
	void validate() throws InvalidUserNameException , InvalidPassException{
		if(username!="Admin") {
			throw new InvalidUserNameException();
		}
		else if(password!=12345) {
			throw new InvalidPassException();
		}
		else {
			System.out.println("LogIn Complete.....");
		}
	}
}


class LoginTest{
	public static void main(String[] args) {
		
		Login L = new Login("Admin", 12345);
		
		try {
			L.validate();
		}
		catch(InvalidUserNameException e){
			System.out.println(e);
		}
		catch(InvalidPassException e) {
			System.out.println(e);
		}
		
	}
}