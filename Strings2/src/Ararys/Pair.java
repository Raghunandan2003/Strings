package Ararys;

public class Pair {
	public static void main(String[] args) {
		
	
	int arr[]= {1,2,3,4,5};
	int sum=9;
    int low=0;
    int high=arr.length-1;
    
	while(low<high)
	{
	 if(arr[low]+arr[high]>sum) {
		 high--;
	
	 }else if(arr[low]+arr[high]<sum) {
	   low++;
	 } else if(arr[low]+arr[high]==sum) {
		
		 System.out.println(arr[low]+" ,"+arr[high] );
		 int s=arr[low]+arr[high];
		 System.out.println(s);
		 high++;
		 low--;
	 }
		 
	}
	}
}

