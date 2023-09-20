// DEVELOPING A CALCULATOR APPLICATION WITH METHOD OVERLOADING

package com.java.methodoverloading;

public class M_Overloading 
{
	 public void Addition() 
	 {                   // METHOD OVERLOADING WITH ZERO ARGUMENT
		int a = 10;
		int b = 20;
		int c = a + b;
		System.out.println("Addition of "+a+"+"+b+" is : " + c );
	 }
	 public void Addition(int a,int b) 
	 {
	        int result = a + b;
	        System.out.println("Addition of "+ a+"+"+b+" is : " +result);
	 }
	 public void Addition(int a,int b,int c) 
	 {
		 int result = a+b+c;
		 System.out.println("Addition of "+a+"+"+b+"+"+c+" is : "  +result);
	 }
	 public void Addition(int a,int b,int c,int d) 
	 {
		 int result = a + b + c + d;
		 System.out.println("Addition of " +a+"+"+b+"+"+c+"+"+d+" is : " +result);
	 }
	 
 // SUBRACTION METHOD OVERLOADING //
     public void Subraction() 
     {                     // METHOD OVERLOADING WITH ZERO ARGUMENT
        int a = 10;
        int b = 20;
        int c = a - b;
        System.out.println("Subraction of "+a+"-"+b+" is : " + c );
     }
     public void Subraction(int a,int b) 
	 {
	        int result = a - b;
	        System.out.println("Subraction of "+ a+"-"+b+" is : " +result);
	 }
	 public void Subraction(int a,int b,int c) 
	 {
		 int result = a - b - c;
		 System.out.println("Subraction of "+a+"-"+b+"-"+c+" is : "  +result);
	 }
	 public void Subraction(int a,int b,int c,int d) 
	 {
		 int result = a - b - c - d;
		 System.out.println("Subraction of " +a+"-"+b+"-"+c+"-"+d+" is : " +result);
	 }
	 
    // MULTPLICATION METHOD OVERLOADING //
     public void Multplication() 
     {                         // METHOD OVERLOADING WITH ZERO ARGUMENT
        int a = 10;
        int b = 20;
        int c = a * b;
        System.out.println("Multplication of "+a+"*"+b+" is : " + c );
     }
     public void Multplication(int a,int b) 
	 {
	        int result = a * b;
	        System.out.println("Multplication of "+ a+"*"+b+" is : " +result);
	 }
	 public void Multplication(int a,int b,int c) 
	 {
		 int result = a * b * c;
		 System.out.println("Multplication of "+a+"*"+b+"*"+c+" is : "  +result);
	 }
	 public void Multplication(int a,int b,int c,int d) 
	 {
		 int result = a * b * c * d;
		 System.out.println("Multplication of " +a+"*"+b+"*"+c+"*"+d+" is : " +result);
	 }

	// DIVISION METHOD OVERLOADING //
     public void Division() 
     {                     // METHOD OVERLOADING WITH ZERO ARGUMENT
        int a = 10;
        int b = 20;
        int c = a / b;
        System.out.println("Division of "+a+"/"+b+" is : " + c );
     }
     public void Division(int a,int b) 
	 {
	        int result = a / b;
	        System.out.println("Division of "+ a+"/"+b+" is : " +result);
	 }
	 public void Division(int a,int b,int c) 
	 {
		 int result = a / b / c;
		 System.out.println("Division of "+a+"/"+b+"/"+c+" is : "  +result);
	 }
	 public void Division(int a,int b,int c,int d) 
	 {
		 int result = a / b / c / d;
		 System.out.println("Division of " +a+"/"+b+"/"+c+"/"+d+" is : " +result);
	 }
	  
	public static void main(String[] args) 
	{
		M_Overloading MO = new M_Overloading();
		              MO.Addition();
		              MO.Addition(10, 20);
		              MO.Addition(10, 20, 30);
		              MO.Addition(10, 20, 30, 40);
		              
		              System.out.println("-------------------");
		              MO.Subraction();
		              MO.Subraction(20, 10);
		              MO.Subraction(30, 20, 10);
		              MO.Subraction(40, 30, 20, 10);
		              
		              System.out.println("-------------------");
		              MO.Multplication();
		              MO.Multplication(20, 10);
		              MO.Multplication(20, 10, 300);
		              MO.Multplication(10, 200, 900, 290);
		              
		              System.out.println("-------------------");
		              MO.Division();
		              MO.Division(200, 10);
		              MO.Division(300, 40, 5);
		              MO.Division(500, 60, 20, 2);

	}

}
