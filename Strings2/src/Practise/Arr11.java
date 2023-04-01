package Practise;

import java.util.Arrays;

public class Arr11 {
	public static void main(String[] args) {
		
		String a[]= {"a","b","c","a"};

		for(int i=0;i<a.length;i++)
		{
//			System.out.println("before sorting");
			System.out.println(a[i]);
		}
	
		Arrays.sort(a);
		for(int i=0;i<a.length;i++)
		{
			
			System.out.print(a[i]);
		}		
	}

}
