package StringProgram;

public class Dup {
	public static void main(String[] args) {
		boolean flag=true;
		int a[]= {10,20,30,10};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
				if(a[i]==a[j])
					System.out.println(a[j]+" "+"is The duplicte element");
			       flag=true;
			       break;
		}
		if(flag==false)
		System.out.println("no duplicte appear");
	}

}
