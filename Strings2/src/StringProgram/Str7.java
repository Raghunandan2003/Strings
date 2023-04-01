package StringProgram;

public class Str7 {
	
	public static void main(String[] args) {
		
		String s="raghu nandan gowda";
		char y[]=s.toCharArray();
		int size=y.length;
		y[0]=(char)(y[0]-32);
		int i=1;
		
		while(i!=size)
		{
			if(y[i]==' ')
			{
	
				y[i+1]=(char)(y[i+1]-32);
				
			}
			i++;
		}
		
		
		System.out.println(s);
		System.out.println(y);
	}

}
