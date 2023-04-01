package Practise;

public class Bub {
public static void main(String[] args) {
	
	int []a= {10,8,2,7,3,1,4,5,6,9};
	int temp=0;
	
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<a.length-1;j++)
		{
			if(a[j]>a[j+1])
			{
				temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
		}
	}
			for(int i=0;i<a.length;i++)
			{
				System.out.println(a[i]);
			}
}
}
