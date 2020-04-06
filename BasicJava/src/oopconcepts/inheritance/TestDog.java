package oopconcepts.inheritance;

class Animal {
	   public void move() {
	      System.out.println("Animals can move");
	   }
	   public void bark() {
		      System.out.println("All Animals dont bark");
		  }

}

class Dog extends Animal {
	 public void move() {
		  //super.move();
	      System.out.println("Dogs can walk and run");
	  }
	   
	 public void bark() {
		   System.out.println("Dogs can bark");   
	 }
}

public class TestDog {

	   public static void main(String args[]) {
	      Animal animalObj = new Animal();   // Animal reference and object
	      Animal dogObj = new Dog();   // Animal reference but Dog object
	      Dog dogobj2 = new Dog();
	      
	      animalObj.move();   // runs the method in Animal class
	      animalObj.bark();
	      dogObj.move();   // runs the method in Dog class
	      dogObj.bark();
	      dogobj2.bark();
	   }
	}