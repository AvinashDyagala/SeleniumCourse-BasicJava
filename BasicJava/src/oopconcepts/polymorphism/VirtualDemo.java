package oopconcepts.polymorphism;

/* File name : VirtualDemo.java */
public class VirtualDemo {

   public static void main(String [] args) {
      Salary salaryEmp = new Salary("Mohd Mohtashim", "Ambehta, UP", 3, 3600.00);
      Employee eEmpobj = new Salary("John Adams", "Boston, MA", 2, 2400.00);
      Employee empParobj = new Employee("Smith Adam","Toronto CA", 5);
      System.out.println("Call mailCheck using Salary reference --");   
      salaryEmp.mailCheck();
      System.out.println("\n Call mailCheck using Employee reference--");
      eEmpobj.mailCheck();
      //eEmpobj.computePay();
      salaryEmp.computePay();
      empParobj.mailCheck();
      //System.out.println(empParobj.name);
   }
}