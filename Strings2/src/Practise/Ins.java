package Practise;

public class Ins {

	public static void main(String[] args) {
		
		int a[]= {1,2,4,5};
		int b[]=new int[a.length-1];
		int val=4;
		int j=0;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==val)
			{
				b[j]=a[i+1];
						j++;
	     		}
		   else
		   {	
	            b[j++]=a[i];
 
		   }
		}
		for(int i=0;i<b.length;i++)
		System.out.print(" "+b[i]);
	}
}