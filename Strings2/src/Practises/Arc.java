 package Practises;

import java.util.Scanner;

public class Arc {
	public static void main(String[] args) {
		
//		int n,max,min;
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter the no element in array...");
//		n=sc.nextInt();
//		int a[]=new int[n];
//		System.out.println("enter the elements of array");
//		for(int i=0;i<a.length;i++)
//		{
//			a[i]=sc.nextInt();
//		}
		
		int a[]= {18,557,84,2,45};
		int n=a.length;
		 int max=a[0];
		int min=a[0];
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
	    for(int i=0;i<a.length;i++)
	    {
	    	if(a[i]<min)
			{
				min=a[i];
			}
	    }
        System.out.println(max);
        System.out.println(min);
} 
}