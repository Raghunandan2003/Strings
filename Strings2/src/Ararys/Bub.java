package Ararys;

public class Bub {
public static void main(String[] args) {
	
	int a[]= {1,5,2,3,6,789,4};
	int temp=0;
	
	for (int i = 0; i < a.length; i++) {
		for (int j = 0; j < a.length-1; j++) {
			if(a[j]>a[j+1])
			{
				temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
			
		}
	}
	for (int i : a) {
		System.out.println(i);
	}
	
}
}
