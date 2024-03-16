package org.revise;

public class FinalExample {
	
	static{
		
		System.out.println("Static block");
	}
	
	
	  public static void main(String[] args) {
	  
	  System.out.println("main method block");
	  
	  int a = 10;
	  
	  final int b = 20;
	  
	  a++;
	  
	  //b++;
	  
	  System.out.println("value of a is"+a+"value of b is "+b);
	  
	  }
	 

}
