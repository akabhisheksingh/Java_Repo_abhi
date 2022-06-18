import java.util.Comparator;

public class MyComparator implements Comparator {
	public int compare(Object obj1, Object obj2)
	{
		String st1 = obj1.toString(); 
		String st2= obj2.toString();
		
		return st2.compareTo(st1);
	}
	
	

}
