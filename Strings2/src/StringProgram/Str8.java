package StringProgram;

public class Str8 {
	public static void main(String[] args) {
		
		String s="Test yantra Software  Solution ";
		char c[]=s.toCharArray();
		
		
		int i=0;
		int vowel=0;
		int consent =0;
		int splct=0;
		
		while(i!=c.length)
		{
			if(c[i]>='a' && c[i]<='z')
			{
				if(c[i]=='a' || c[i]=='e' ||c[i]=='i' || c[i]=='o' ||c[i]=='u')
				{
					vowel++;
				}
				else
				{
					consent++;
				}
				
			}
			else
			{
				
				++splct;
			}
				i++;
			}
			
		System.out.println(vowel);
		System.out.println(consent);
		System.out.println(splct);
		}
	
		
		
	}


