package numbers;

import java.util.Scanner;

public class Arm {
	public static void main(String[] args) {
		
		int n;

		int z;
		int count=0;
		int digit;
		int sum=0;
		int tem=153;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no..");
        n=sc.nextInt();
        z=n;
        
        while(z!=0)
        {
        	
        	count=count+1;
        	z=z/10;
        }
        //System.out.println("no of digit"+count);
        int a=n;
        while(a>0)
        {
        	digit=a%10;
        	int pro=1;
        	for (int i = 1; i < count; i++) {
        		pro=pro*digit;
        		sum=sum+pro;
        		a=a/10;
				
			} 
        }
          if(sum==n)
          {
        	  System.out.println("its armstrong no..");
          }
          else
          {
        	  System.out.println("not an armstrong no..");
          }
       
			
		}
		 
	}


