package StringProgram;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
public class Maj {
	public static void main(String[] args) {
		
		
		int ar[]= {1,23,44,1,1,1,1,55};
		int q;
		
		for (int i = 0; i < ar.length; i++) {
			
			for (int j = i+1; j < ar.length; j++) {
				
				if(ar[i]==ar[j])
				{
					
					System.out.println(ar[i]+" is repeted");
					break;
					
					
				}
				
				
			}
			
		}
	
		
		
	}

}
