import java.util.TreeSet;

public class TreeSetCustomisedSortingInteger {
	public static void main(String[] args) {
		TreeSet ts = new TreeSet (new MyCompratorInteger()); 
		ts.add(20);
		ts.add(15);
		ts.add(62); 
		ts.add(20); 
		ts.add(1); 
		ts.add(4); 
		System.out.println(ts);
		
	}

}
