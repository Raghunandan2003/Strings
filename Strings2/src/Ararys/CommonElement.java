package Ararys;

public class CommonElement {
	public static void main(String[] args) {
		
		int a1[]= {1,5,10,20,40,60};
		int a2[]= {6,7,20,100};
		int a3[]= {3,4,15,20,30,70,120};
		int x=0;
		int y=0;
		int z=0;
		
		
		while(x<a1.length && y<a2.length  && z<a3.length)
		{
			if(a1[x]==a2[y] && a2[y]==a3[z]){
				System.out.println(a1[x]);
				x++;
				y++;
				z++;
				break;
			
		}else if(a1[x]>a2[y]) {
			y++;
		}else if(a2[y]>a3[z]) {
			z++;
		}
		else {
			x++;
			
		}
		}

}
};