package StringProgram;

public class Str9 {

	public static void main(String[] args) {
		String s="Raghu 0708";
		  
	
	    char[ ]y=s.toCharArray();
	  
	   for(int i=0;i<y.length;i++)
	   {
		   if(y[i]>=0 &&  y[i]<=9)
		   {
			   System.out.println("number");
			   break;
		   }
	   }
	   
}
}