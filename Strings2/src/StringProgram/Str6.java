package StringProgram;

public class Str6 {

	public static void main(String[] args) {
		
		String s="RAGHU";
		char y[]=s.toCharArray();
		int size=y.length;
		 
		
		int i=0;
		while(i!=y.length)
		{
			y[i]=(char)(y[i]+32);
			i++;
			
			
		}
		System.out.println(s);
		System.out.println(y);
		
		 
		
	}
}
