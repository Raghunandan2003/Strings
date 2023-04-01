package Practise;

public class Arr90 {
	public static void main(String[] args) {
		
		int a[]= {1,4,6,8,5,4};
		int key=6;
		boolean flag=false;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==key)
				 
            
				System.out.println("the element found"+" "+a[i]);
			 flag=true;
             
             
 		}
		
		if(flag==false)
		{
			System.out.println("not found");
		}
	}

}
