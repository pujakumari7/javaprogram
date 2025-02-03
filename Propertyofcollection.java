package package2;

import java.util.ArrayList;
import java.util.Collection;

public class Propertyofcollection {

	public static void main(String[] args) 
	{
		Collection<Object> c1= new ArrayList<Object>(); //Upcasting
		c1.add("dad");
		c1.add(true);
		c1.add(3.146);
		c1.add('A');
		c1.add(90000);
		c1.add(98.9);
		System.out.println(c1);
		
	}

}
