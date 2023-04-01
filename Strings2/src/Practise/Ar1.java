package Practise;

import java.util.Scanner;

public class Ar1 {
	public static void main(String[] args) {
		
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("entr the size of array");
		int size=sc.nextInt();
		
		int a[]=new  int[size];
		System.out.println("enter the element");
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		sc.close();
	
		System.out.println("printing all elemnts");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(" "+a[i]);
		}
		
		
	}

}
}