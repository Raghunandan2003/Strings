package Ararys;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

public class flo {
public static void main(String[] args) {
	int temp;
	 float a[]= {(float)0.11,(float)0.96,(float)0.1,(float)0.73,(float)0.86,(float)0.99};
//	 Arrays.sort(a);
	 
	 for (int i = 0; i < a.length; i++) {
		 for (int j = 0+1; j < a.length-1; j++) {
			
		
		if(a[j]>a[j+1])
		{
	      temp=(int) a[j];
	      a[j+1]=a[j];
	      a[j]=temp;
	     
	
		}
		 }
	 }
	 
	 for (int i = 0; i < a.length; i++) {

		 
		 System.out.println(a[i]);
	}
}
}