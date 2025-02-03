package package2;

import java.util.HashMap;
import java.util.Map;

public class Mapbehavioiur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map m1 = new HashMap<>();
		m1.put("nam1", "Geeta");
		m1.put("name2", "Apurva");
		m1.put("name3", "Amit");
		m1.put("name4", "Suraj");
		System.out.println(m1);
		
		Map<String,String> m2 = new HashMap<String,String>();
		m2.put("nam1", "Geeta");
		m2.put("name2", "Apurva");
		m2.put("name3", "Amit");
		m2.put("name4", "Suraj");
		System.out.println(m1);
		
		
		Map<String,Integer>m3 = new HashMap<String,Integer>();
		m3.put("Ram", 51);
		m3.put("Sita", 42);
		m3.put("Bhim", 27);
		m3.put("Laxman", 49);
		System.out.println(m3);
		
		Map<String,Integer>m4 = new HashMap<String,Integer>();
		m4.put("Vishwa", 24);
		m4.putAll(m3);
		System.out.println(m4);
		m4.remove("Bhim");
		m4.remove("Vishwa", 24);
		m4.replace("Sita", 42, 55);
		m4.replace("Ram", 56);
		boolean answer=m4.isEmpty();
		System.out.println(answer);
		System.out.println("After removing the Bhim m4 will be->" +m4);
		
	}

}
