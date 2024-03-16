package org.revise;

public class StringExamples {
	
	public static void main(String[] args) {
		
		int a = 10;
		
		String s = String.valueOf(a);
		
		System.out.println(s+" Sowmya");
		

		String s1 = "         Sowmya";
		
		System.out.println(s1);
		
		String trim = s1.trim();
		
		System.out.println(trim);
		
		String s2 ="Sowmya";
		
		char[] ch = s2.toCharArray();
		
		boolean blank = s2.isBlank();
		
		System.out.println(blank);
		
		for(int i=0;i<ch.length;i++)
		{
			System.out.println(ch[i]);
		}
		
		
		String d = "Sowmya";
		String b = "Sowmya";
		
		System.out.println(d == b);
		
		
		String d1 = new String("Sowmya");
		String b1 = new String("Sowmya");
		
		System.out.println(d1 == b1);
		
		
		
		char[] c = {'a','r','y','a'};
		
		String str = new String(c);
		
		System.out.println("Str = "+str);
		
		String str1 = String.valueOf(c);
		
		System.out.println("Str1 = "+str1);
		
		
		String str2 = "Murali,sowmya";
		
		String str3 = str2.concat("Sowmya");
		
		System.out.println(str3);
		
		String sdf = str2.split(",")[0];
		
		System.out.println("split = "+sdf);
		
	}

}
