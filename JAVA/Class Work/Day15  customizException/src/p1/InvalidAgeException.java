package p1;

public class InvalidAgeException extends Exception {

	@Override
	public String toString() {
		return "Invalid Age. You cant wait ";
	}

}
