package p1;

public class Vote {
	int age;

	// constructerParameter
	Vote(int age) {
		this.age = age;
	}

	void validate() throws InvalidAgeException {
		if (this.age < 18) {
			throw new InvalidAgeException();
		} else {
			System.out.println("You can vote.");
		}
	}

}
