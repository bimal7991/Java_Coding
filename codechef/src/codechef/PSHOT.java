package codechef;
import java.util.*;
public class PSHOT {
  public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int T=sc.nextInt();
	while(T-->0)
	{
		int n=sc.nextInt();
		String s=sc.next();
		int ahit=0,atotal=n,bhit=0,btotal=n;
		int ind=2*n;
		for(int i=0;i<2*n;i++)
		{
			
			
			if(i%2==0)
			{
				atotal--;
				if(s.charAt(i)=='1')
				ahit++;	
			}
			if(i%2==1)
			{
				btotal--;
				if(s.charAt(i)=='1')
				bhit++;	
			}
			   
			
			if(ahit-bhit>btotal || bhit-ahit>atotal)
			{
				ind=i+1;
				break;
			}
			
				
		}
		
	
		System.out.println(ind);
		
	}
}
}
