package Ararys;

import java.util.Iterator;

public class MERge {
public static void main(String[] args) {
	
	int a[]= {1,23,4,5,6};
	int b[]= {2,3,5,7,89};
	int sum=0;
	int sum1=0;
	for (int i = 0; i < a.length; i++) {
		
		
      
		sum=sum+a[i];
	}
		
		for (int j = 0; j < b.length; j++) {
			
			sum=sum+b[j];
		}
		
		System.out.println(sum);
		
		
}       
}
