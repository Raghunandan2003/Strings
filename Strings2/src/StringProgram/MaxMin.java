package StringProgram;

import java.util.Scanner;

public class MaxMin {
public static void main(String[] args) {
	
	int max;
	int min;
	Scanner sc=new Scanner(System.in);
	
	System.out.println("enter size of array");
	int n=sc.nextInt();
	int a[]=new int[n];
	System.out.println("enter of array");
	for(int i=0;i<a.length;i++) {
		a[i]=sc.nextInt();
		}
       min=a[0]; 
	  max=a[0];
	  
	  //max logic
	  for(int i=0;i<a.length;i++)
	  {
		  if(a[i]<min)
			  min=a[i];
	  }
	  
	  
	  //min logic
	  for(int i=0;i<a.length;i++)
	  {
		  if(a[i]>max)
			  max=a[i];
	  }
      
	  System.out.println("the maxium of no.."+max);
	   System.out.println("the min of no.."+min);

}

}