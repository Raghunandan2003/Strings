package Practises;

public class TwoSum {
	public static void main(String[] args) {
		
		int []a= {10,20,30};
		
		int key=50;
		

		for(int i=0;i<a.length;i++)
		{
			int sum=0;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]+a[j]==key)
				{
					 sum=a[i]+a[j];
					System.out.println(sum);
					break;
				}
			}
		}
	
	}
}
