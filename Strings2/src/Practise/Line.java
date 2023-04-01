package Practise;

public class Line {
	
	public static void main(String[] args) {
		
		int a[]= {1,3,6,7,8};
		int key=7;
		boolean flag=false;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==key)
				System.out.println("the key value "+a[i]+" "+"matched");
				flag=true;
		}
			
	}

}
