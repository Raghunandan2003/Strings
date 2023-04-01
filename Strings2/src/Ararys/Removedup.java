package Ararys;


public class Removedup {
public static void main(String[] args) {

	int a[]= {1,2,3,4,4,5,6,7,8};
	int len=a.length;
	int j=0;
	
	for (int i = 0; i < len-1; i++) {
		if(a[i]!=a[i+1]) {
			a[j++]=a[i];
		}			
	}
		
	a[j++]=a[len-1];
	
	for (int i = 0; i < a.length; i++) {
		System.out.print(a[i]+" ");
		
	}
	
	
	
}
}