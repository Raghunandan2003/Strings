package Practise;

import java.util.Arrays;

public class Arr10 {
public static void main(String[] args) {
	
	int a[]=new int[] {0,2,4,6,78,99};
	//Arrays.sort(a);
	
	int lar=0;
	int sml=0;
	
	for(int i=0;i<a.length;i++) 
	
		if(a[i]>lar) {
		lar=a[i];
		
		}
	
	for(int i=0;i<a.length;i++)
		{  
		if(a[i]<sml)
			
			sml=a[i];
		
	
			
		}		
	System.out.println(sml);
	System.out.println(lar);
	
}
}


	

