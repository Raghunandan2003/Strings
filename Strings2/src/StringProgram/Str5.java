package StringProgram;

public class Str5 {
	
	public static void main(String[] args) {
		
		String s="raghu";
		char y[]=s.toCharArray();
		int size=y.length;

		
		int i=0;
		while(i!=size)
		{
			y[i]=(char)(y[i]-32);
			i++;
		
         			
			
		}
		
		System.out.println(s);
		System.out.println(y);
		
		
	}

}



