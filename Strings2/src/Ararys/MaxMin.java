package Ararys;

public class MaxMin {
	
public static void main(String[] args) {
	
	int a[]= {1,34,2,4,56};
	
	int max=a[0];
	int min=a[0];
	for (int i = 0; i < a.length; i++) {
		
		
		if(a[i]>max)
		{
			max=a[i];
		}
	}
		for (int i= 0; i < a.length; i++) {
			
			if(a[i]<min)
			{
				min=a[i];
			}
		}		
		
      System.out.println(min);
      System.out.println(max);
		}		
}
		



