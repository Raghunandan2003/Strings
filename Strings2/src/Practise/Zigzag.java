package Practise;

import java.util.Arrays;

public class Zigzag {
	
	public static void main(String[] args) {
		int a[]= {2, 4, 5, 1, 7, 6, 8};
		int temp=0;
		 boolean flag=true;
		
		for(int i=0;i<a.length-1;i++ )
		{
			if(flag)
			{
				if(a[i]>a[i+1])
				{
					temp=a[i];
					a[i]=a[i+1];
					a[i]=temp;
			}
				else
				{
					if(a[i]<a[i+1])
						temp=a[i];
					a[i]=a[i+1];
					a[i]=temp;
					
				}
		}
			System.out.println(Arrays.toString(a));  

		
	}
		System.out.println(Arrays.toString(a));  
		
}
}