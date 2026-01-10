import java.util.Comparator;

public class MySalaryComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Employee1 e1=(Employee1)o1;
		Employee1 e2=(Employee1)o2;
		
		return (int) (e1.salary - e2.salary);
	}

}
