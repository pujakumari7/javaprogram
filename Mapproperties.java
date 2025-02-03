package package2;
import java.util.HashMap;
import java.util.Map;
public class Mapproperties {
	    public static void main(String[] args) {
	        // Create a HashMap
	        Map<String, Integer> map = new HashMap<>();

	        // Add key-value pairs
	        map.put("Alice", 25);
	        map.put("Bob", 30);
	        map.put("Charlie", 35);

	        // Access elements
	        System.out.println("Bob's age: " + map.get("Bob"));

	        // Check if a key exists
	        System.out.println("Contains Alice? " + map.containsKey("Alice"));

	        // Remove an entry
	        map.remove("Alice");

	        // Iterate over entries
	        for (Map.Entry<String, Integer> entry : map.entrySet()) {
	            System.out.println(entry.getKey() + ": " + entry.getValue());
	        }

	        // Get keys and values separately
	        System.out.println("Keys: " + map.keySet());
	        System.out.println("Values: " + map.values());
	    }
	}


