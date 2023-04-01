package Practises;

import java.util.ArrayList;

public class Ar2 {
	public static void main(String[] args) {
		
		String s[]={"red","red","blue","green"};
	   int index=0;
	   for(int i=0;i<s.length;i++)
	   {
		   if(s[i]=="blue")
		   {
			   index=i;
		   }
	   }
	   System.out.println(index);
   
	}

}
