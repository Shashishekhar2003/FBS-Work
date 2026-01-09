package p1;

public class Test {
	public static void main(String[] a) {

		Vote v1 = new Vote(17);

		try {
			v1.validate();
		} catch (InvalidAgeException e) {
			System.out.println(e);

		}

	}
}
