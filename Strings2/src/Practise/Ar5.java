package Practise;

import java.util.Arrays;
import java.util.List;
import java.util.*;
import java.util.ArrayList;

public class Ar5 {
	public static void main(String[] args) {
		String a[]={"red", "green", "blue"};
		List<String> stringList=new ArrayList(Arrays.asList(a));
		stringList.remove(2);
		//stringList.remove()
		stringList.remove("green");
		System.out.println(stringList);
	}


		
		
		
	
}


