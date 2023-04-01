package StringProgram;

import java.util.Arrays;

public class Str11 {
	public static void main(String[] args) {
		
	 String s="listen";
	 String s1="silen";
	 s=s.toLowerCase();
	 char y[]=s.toCharArray();
	 char c[]=s1.toCharArray();
	 
       Arrays.sort(y);
       Arrays.sort(c);
       
       boolean result =Arrays.equals(y,c);
       
       if(result == true)
       {
    	   System.out.println("its angram");
       }
       else
       {
    	   System.out.println("its not angram");
       }
	
	}

}
