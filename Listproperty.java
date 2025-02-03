package package2;

import java.util.ArrayList;
import java.util.List;

public class Listproperty {
	public static void main(String[] args) {
		
	
		List<String> l= new ArrayList<String>();
		l.add("tiya");
		l.add("puja");
		l.add("kiya");
		l.add(0, "piya");
		l.add("kiya");
		l.add(null);
		//l.removeAll(l);
		//l.clear();
		
		System.out.println(l);

	}
}