package StringProgram;

public class Tur {
	public static void main(String[] args) {
		String s="the quick brown fox jumps over lazy dog";
		s=s.replace(" ", "");
		char a[]=s.toCharArray();
		int size =a.length;
		int i=0;
		while(i!=size)
		{
			int index=a[i]-65;
	        a[index]=1;
	        i++;
		}
		
		
	    while(i != 26)
	    {
	    	if(a[i]==1)
	    	{
	    		i++;
	    	}
	    	else
	    	{
	    		System.out.println("pangram no..");
	    	}
	    }
	    System.out.println("pangram ");
		
		
	}
}
