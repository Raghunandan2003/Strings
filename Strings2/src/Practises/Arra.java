package Practises;

import java.util.Scanner;

public class Arra {
	public static void main(String[] args) {
		
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no to check whether its autophorbic or not");
		int i=sc.nextInt();
		
		int res=i*i;
		int div=res%100;
		
		boolean flag=false;
		if(div==i)
		{
			System.out.println("its autophoric"); 
		
		
		}
		 
		else
		{
			System.out.println("its not autophorbic  no..");
		}
	}

}
