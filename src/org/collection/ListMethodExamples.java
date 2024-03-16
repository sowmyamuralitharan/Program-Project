package org.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListMethodExamples {
	public static void main(String[] args) {
		
		List li = new ArrayList();
		
		li.add(10);
		li.add("sowmya");
		li.add("c");
		li.add(23.7896);
		li.add(true);
		li.add(null);
		li.add(10);
		
		for(Object a : li)
		{
			System.out.println(a);
		}
		System.out.println("***************************");
		for(int i=0;i<li.size();i++)
		{
			System.out.println(li.get(i));
		}
		System.out.println("***************************");
       Iterator itr1 = li.listIterator();
		  
		  while(itr1.hasNext())
		  { 
			  System.out.println(itr1.next()); 
			  }
		
		  System.out.println("***************************");
		ArrayList<String> ar = new ArrayList<String>();
		ar.add("sowmya");
		ar.add("arya");
		ar.add("murali");
		ar.add("swathi");
		ar.add("siru");
		
		  Iterator itr = ar.listIterator();
		  
		  while(itr.hasNext())
		  { 
			  System.out.println(itr.next()); 
			  }
		 
			
	
	}
}

