package package2;

public class NonStaticMethodExample {
	// Non-static parameterized method
    public void displayMessage(String message) {
        System.out.println("Message: " + message);
    }

    public static void main(String[] args) {
        // Create an object of the class to access the non-static method
        NonStaticMethodExample example = new NonStaticMethodExample();

     // Call the non-static parameterized method
        example.displayMessage("Hello, this is a non-static method!");
    
    } 
}

