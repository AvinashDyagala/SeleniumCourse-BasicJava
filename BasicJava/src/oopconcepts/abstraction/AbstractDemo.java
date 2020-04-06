package oopconcepts.abstraction;

/* File name : VirtualDemo.java */
public class AbstractDemo {

   public static void main(String [] args) {
      Salary s = new Salary("Mohd Mohtashim", "Ambehta, UP", 3, 3600.00);
//     Employee e = new Employee("John Adams", "Boston, MA", 2);
//      System.out.println("Call mailCheck using Salary reference --");   
      s.mailCheck();
      System.out.println("\n Call mailCheck using Employee reference--");
//      e.mailCheck();
   }
}