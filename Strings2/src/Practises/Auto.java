package Practises;

import java.util.Scanner;

public class Auto {
	public static void main(String[] args) {
		boolean flag=false;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no..");
		int i=sc.nextInt();
		int n=i;
		int n1=i*i;
		while(n1>0)
		{
			if(n1%10==n)
			{
				System.out.println("its autophric");
			flag=true;
			}
			if(flag==false)
			{
				System.out.println("not auto");
			}
			
		}
	}

}
