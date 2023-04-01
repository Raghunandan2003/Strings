package Ararys;

import java.util.Iterator;

public class Insertion {
	public static void main(String[] args) {
		
		int a[]= {1,8,2,4,76,3,99,1};
		int temp=0;
		int j;
		
		for(int i=1;i<a.length;i++) {
			temp=a[i]; //1
			j=i-1;  //0
			
			while(j>=0 && temp <a[j]) {
				
				a[j+1]=a[j];
				j=j-1;
			}
			a[j+1]=temp;
		}
		for (int s1 : a) {
			
		
			
			System.out.print(" "+s1);
		}
		
	}

}
 