package Practise;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Ar4 {
public static void main(String[] args) {
	int []num= {1,2,3,4,5};
	System.out.println("original array="+Arrays.toString(num));
	int index=3;
     
int []	newArray=IntStream.range(0,num.length).filter(i->i!=index).map(i->num[i] ).toArray();
	System.out.println("orignal array after deletion ="+Arrays.toString(newArray));
}
}
