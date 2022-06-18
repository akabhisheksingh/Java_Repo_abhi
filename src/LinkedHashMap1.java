import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

public class LinkedHashMap1 {
	public static void main(String[] args) {
		LinkedHashMap <Integer, String>ls = new LinkedHashMap(); 
		ls.put(20, "Ganguly"); 
		ls.put(30, "Dhoni"); 
		ls.put(18, "Kohli"); 
		ls.put(45, "Sharma"); 
		ls.put(10, "Rahane"); 
		 System.out.println(ls);
		 Iterator litr= ls.entrySet().iterator(); 
		 while(litr.hasNext())
		 {
		Map.Entry mapElem= (Map.Entry)litr.next(); 
		System.out.println(mapElem.getKey());
		System.out.println(mapElem.getValue());
		if(mapElem.getValue().equals("Rahane"))
		{
			mapElem.setValue("Pant");
		}
		 }
		 
		 System.out.println("after setting the value");
		 for(Map.Entry i :ls.entrySet())
		 {
			 System.out.println(i.getKey()+"**********"+i.getValue());
			
		 }
		 System.out.println(ls.get(20));
		 Collection c = ls.values(); 
			System.out.println(c);
			Set s = ls.keySet(); 
			System.out.println(s);
		 
		 
		
		
	}
	

}
