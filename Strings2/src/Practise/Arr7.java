package Practise;

import java.util.Scanner;

public class Arr7 {
	public static void main(String[] args) {
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of array");
		int size=sc.nextInt();
		int n[]=new int[size];
		System.out.println("enter the elments in array");
		for(int i=0;i<n.length;i++)
		{
			n[i]=sc.nextInt();
		
	    sum=sum+n[i];
	   
	}
		System.out.println(sum);

}
}