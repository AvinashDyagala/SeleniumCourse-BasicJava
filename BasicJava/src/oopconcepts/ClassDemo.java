package oopconcepts;

public class ClassDemo {

	public static void main(String[] args) {
		Car bmw = new Car(); // Create and initialize the object
		bmw.setMake("BMW");
		bmw.setColor("Red");
		bmw.setModel("X3");
		bmw.setYear(2018);

		System.out.println(bmw.getMake());

		
		Car toyota= new Car();
		toyota.setMake("Toyota");
		toyota.setColor("Black");
		toyota.setModel("Corolla");
		toyota.setYear(2015);
		System.out.println(toyota.getMake());		
	}
}