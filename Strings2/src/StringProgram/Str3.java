package StringProgram;

public class Str3 {
	public static void main(String[] args) {
		
		String s="liril";
		char y[]=s.toCharArray();
		int i=0;
		int size=y.length;
		char a[]=new char [size];
		
		while(i!=size)
		{
		a[size -1-i]=y[i];
		i++;
		}
		i=0;
		while (i!=size)
			{
			if(a[i]!=y[i])
			{
				System.out.println("not palidrome");
				System.exit(0);
				
			}
			else
			{
				i++;
				continue;
			
			}
			}

		 System.out.println("palidrome");
	}
}

