package package2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

//import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Mapprogram {

	public static void main(String[] args) 
	{
		Map<String,Character> m1= new HashMap<String,Character>();
		m1.put("Student1", 'f');
		m1.put("Student2", 'f');
		m1.put("Student3", 'f');
		m1.put("Student4", 'f');
		m1.put("Student5", 'f');
		System.out.println(m1);
		
		
		//Set<String>s1=m1.keySet();
		System.out.println("Fetching all keys->");
		for(String key:m1.keySet())
		{
			System.out.println(key);
		}
		System.out.println("Fetching all vakues->");
		for(Character Value:m1.values())
		{
			System.out.println(Value);
		}
		Set<Entry<String,Character>> Kv =m1.entrySet();
		
		   Iterator<Entry<String,Character>>i1= Kv.iterator();
		   while(i1.hasNext())
		   {
			  System.out.println(i1.next()); 
		   }
		   
		}
	
		
	}


