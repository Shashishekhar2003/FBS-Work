import java.util.*;

public class MyKey implements Comparable <MyKey>{

	int key;

	public MyKey(int i) {
		this.key = i;
	}

	@Override
	public int compareTo(MyKey o) {
		System.out.println("Inside CompareTo");
		//MyKey mk = (MyKey) o;

		return this.key - o.key;
	}

	@Override
	public String toString() {

		return "Key =" + this.key;
	}

}
