package StringProgram;

public class Str10 {
	public static void main(String[] args) {
		String sc="ssss7";
		
		int i=0;
		int size=sc.length();
		
		
		while(i!=size)
		{
			
			if(sc.charAt(i)>=0 && sc.charAt(i)<=9)
			{
				// System.out.println(" integer String");
				i++;
			}
			else
			{
				System.out.println("not an integer its string");
				System.exit(0);
			}
			
		}
		System.out.println(" integer String");
			
			
		}
		
		
		
		
	}


