package Practises;

import java.util.Iterator;

public class IndexElemenet {
public static void main(String[] args) {
	
 String color[]= {"red","blue","orange","black"};
 int index=0;
 for(int i=0;i<color.length;i++) {
	
	 if(color[i]=="blue") {
		index =i;
		
	 }
	 
	 
 }
 System.out.println(index);
}
}