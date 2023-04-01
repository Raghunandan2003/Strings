package Practise;

public class arr44 {
public static void main(String[] args) {
	
	int b[]= {1,34,6,8,89,90,1};
	
	boolean flag=false;
	
	for(int i=0;i<b.length;i++)
	{
		for(int j=i+1;j<b.length;j++)
		{
          if(b[j]==b[i])
          {
        	  System.out.println(b[i]);
        	  flag =true;
          }
        	  
		}
	}
	if(flag==false)
	{
		System.out.println("not iditefied");
	}
	
}
}
