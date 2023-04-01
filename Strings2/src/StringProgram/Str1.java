package StringProgram;

public class Str1 {
	
	public static void main(String[] args) {
		
		String x="raghu nandan";
		char y[]=x.toCharArray();
		int size=y.length;
		char a[]=new char[size];
		
		int i=0;
		
		while(i!=size)
			
		{
	       a[size-1-i]= y[i]; 
			i++;
		}
		System.out.println(y);
		System.out.println(a);
	}
}
