package org.revise;

public class Conditions {
	
	public static void main(String[] args) {
		
		int i = 10; int j = 20;
		
		if(i>j)
		{
			System.out.println("i is big");
		}
		else if(j<i)
		{
			System.out.println("j is big");
		}
		else if(i==j)
		{
			System.out.println("i and j are equal");
		}
		else
		{
			System.out.println("nothing");
		}
		
		
		String s = "sowmya,Murali";
		
		System.out.println(s.split(",")[1]);
		
	}

}
