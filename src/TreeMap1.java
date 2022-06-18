import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMap1 {
	//Default Natural Sorting
	public static void main(String[] args) {
		TreeMap<Integer,String> tm= new TreeMap(); 
		tm.put(3, "Apple"); 
		tm.put(2,"Orange"); 
		tm.put(6,"Grapes"); 
		tm.put(1,"Banana"); 
		//tm.put(null,"4555"); 
		System.out.println(tm);
		for(Map.Entry mt: tm.entrySet())
		{
			System.out.println(mt.getKey()+"*********"+mt.getValue());
		}
		System.out.println("After updating the values");
		Iterator itr= tm.entrySet().iterator(); 
		while(itr.hasNext())
		{
			Map.Entry mt = (Map.Entry)itr.next();
			if(mt.getKey().equals(1))
			{
				mt.setValue("Mango");
			}
			System.out.println("Key------"+mt.getKey());
			System.out.println("Value------"+mt.getValue());
		}
		System.out.println(tm);
	}

}
