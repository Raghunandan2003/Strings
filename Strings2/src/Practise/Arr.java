package Practise;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.*;
public class Arr {
	public static void main(String[] args) {
		
		// Different method of printing 
		
		String s[]= {"rad","ted","the"};
		int intArray[]= {1,2,3};
		int [][] twod=new int[][] {{1,2,3},{2,4,5}};
		List list=Arrays.asList(s);
		System.out.println(list);
		List<String> kl=new ArrayList<>();
		Collections.addAll(kl,s);
		System.out.println(kl);
		for(int count=0;count<s.length;count++)
		{
			System.out.println(" using classic for loop"+s[count]);
			
		}
	for (String string : kl) {
		System.out.println("using for each loop"+string);
	
	
		System.out.println("by using arrays .aslist"+Arrays.asList(string));
        System.out.println(Arrays.asList(string));
		System.out.println("using to string method"+Arrays.toString(s));
		System.out.println("using to string method"+Arrays.toString(intArray));

		
	
	}
		
	}




}
