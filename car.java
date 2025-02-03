package package2;

	// Java program to demonstrate constructors

	class Car {
	    // Instance variables
	    String model;
	    int year;

	    // Constructor to initialize the values
	    // Constructor is called when an object is created
	    Car(String model, int year) {
	        this.model = model;
	        this.year = year;
	        System.out.println("Car object created!");
	    }

	    // Method to display car details
	    void displayCarDetails() {
	        System.out.println("Car Model: " + model);
	        System.out.println("Car Year: " + year);
	    }

	    public static void main(String[] args) {
	        // Creating objects of the Car class
	        Car car1 = new Car("Toyota Corolla", 2020);
	        Car car2 = new Car("Honda Civic", 2022);

	        // Calling method to display car details
	        car1.displayCarDetails();
	        car2.displayCarDetails();
	    }
	}


