package Practise;

public class Bin {
	public static void main(String[] args) {
		boolean flag=false;
		int a[]= {1,2,3,4,5,6,7,8,9,10,11,12};
		int li=a[0];
		int hi=a.length;
		int mid=(li+hi)/2;
		int val=10;
		while(li<=hi)
		{
			if(a[mid]==val)
			{
				System.out.println("the searched no"+" "+a[mid]);
				flag=true;
				break;
			}
			else if(val>a[mid])
			{
				li=mid+1;
			}
			else
			{
				hi=mid-1;
			}
			
			mid=(li+hi)/2;
		}
	}
}