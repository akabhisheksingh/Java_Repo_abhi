import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Map1 {
	public static void main(String[] args) {
		HashMap <Integer, String>hs = new HashMap(); 
		hs.put(1,"Abhishek"); 
		hs.put(2, "Salman"); 
		hs.put(3, "Disha"); 
		hs.put(7,"Kriti"); 
		hs.put(5, "Kajal"); 
		hs.put(6, "Aish"); 
		if(hs.containsValue("Kriti"))
		{
			System.out.println("Value is in it ");
		}
		else
		{
			System.out.println("Not matched");
		}
		System.out.println(hs);
		  Iterator itr = hs.entrySet().iterator();
		  while(itr.hasNext())
		  {
			  Map.Entry mapElement = (Map.Entry)itr.next();
			  int code = (int) mapElement.getKey();
			  String st =(String) mapElement.getValue(); 
			  System.out.println(code+"----"+st);
			  
			  
		  }
		  System.out.println("Iterate through for each loop ");
		  for(Map.Entry mapElem : hs.entrySet())
		  {
			  System.out.println(mapElem.getKey()+"*********"+mapElem.getValue());
		  }
		  
		  if(hs.containsKey(1))
		  {
			  hs.put(1, "Raghav"); 
		  }
		  System.out.println(hs);
		  
		  System.out.println("Second Map");
		  HashMap hs2 = new HashMap(); 
		  hs2.put(20, "Aloo");
		  HashMap hm2 = new HashMap(hs);

		  System.out.println(hm2);
		  int sizeOfMap =hm2.size(); 
		  System.out.println(sizeOfMap);
		  hs.remove(1); 
		  System.out.println(hs);
		  for(Map.Entry i : hs.entrySet()) {
			  if(i.getKey().equals(2))
{
	i.setValue("Abhishek"); 
}
			  
		  }
		  System.out.println(hs);
		  Iterator itr1= hs.entrySet().iterator(); 
		  while(itr1.hasNext())
		  {
			  Map.Entry map = (Map.Entry)itr1.next(); 
			  System.out.println(map.getKey());
			  System.out.println(map.getValue());
		  }
	}

}
