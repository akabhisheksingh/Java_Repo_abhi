import java.util.TreeSet;

public class TreeMapCustomizedSorting {
	public static void main(String[] args) {
		TreeSet tm = new TreeSet(new MyComparator()); 
		tm.add("K"); 
		tm.add("Z"); 
		tm.add("A"); 
		tm.add("A");
		System.out.println(tm);
		
	}

}
