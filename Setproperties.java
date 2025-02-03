package package2;

import java.util.HashSet;
import java.util.Set;

public class Setproperties {

	public static void main(String[] args) 
	{
		Set s1 = new HashSet();
		s1.add(45);
		s1.add(85);
		s1.add(15);
		s1.add(99);
		s1.add(null);
		s1.add(99);
		s1.add("Puja");
		s1.add(null);
		System.out.println(s1);
	}

}
