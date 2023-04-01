package Practise;
import java.util.function.*;

public class Fyu {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,6,7,8};
		int item=5;
		
		boolean flag =false;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==item)
			{
				System.out.println("its found"+a[i]);
				flag=true;
				break;
			} 
			
		}
		if (flag==false)
		{
			System.out.println("its not found");
		}

	}
}
		