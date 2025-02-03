package package2;

import java.util.ArrayList;
//import java.util.Collection;
import java.util.Collections;

public class Shortingcollectionsproperty {

	public static void main(String[] args) 
	{
		
		ArrayList a1= new ArrayList();   //Upcasting
		a1.add(90000);
		a1.add(536);
		a1.add(743);
		a1.add(11);
		a1.add(49);
		a1.add(123);
		
		System.out.println("Without shorting" +a1);
		
		
		Collections.sort(a1);
		System.out.println("With shorting" +a1);
		
	}

}
