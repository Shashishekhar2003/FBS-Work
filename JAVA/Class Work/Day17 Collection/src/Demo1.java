import java.util.*;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        TreeSet <Integer> t1 = new <Integer> TreeSet();   // TreeSet
		
		t1.add(10);
		t1.add(30);
		//t1.add("FBS");
		t1.add(20);
		
		t1.remove(30);
		System.out.println(t1);

//		if(t1.contains(30)) {
//			System.out.println("Found");
//		}
//		else {
//			System.out.println("Not found ");
//	
//	}

}
}