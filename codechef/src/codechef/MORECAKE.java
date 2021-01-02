package codechef;
import java.util.*;
public class MORECAKE {
   public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int T=sc.nextInt();
	long imp=0,p=0;
	while(T-->0)
	{
		int s=sc.nextInt();
		int n=sc.nextInt();
		int k=sc.nextInt();
		int r=sc.nextInt();
		int sum=k;
		int mult=k;
		for(int i=1;i<n;i++)
		{ 
			mult=mult*r;
			sum=sum+mult;
		    
		}
		if(sum<=s)
		{
			
			System.out.println("POSSIBLE "+(s-sum));
			p=p+(s-sum);
		}
		else
		{
			System.out.println("IMPOSSIBLE "+(sum-s));
			imp=imp+(sum-s);	
		}
		
		
	}
	System.out.println(imp+" "+p);
	if(p>=imp)
		System.out.println("POSSIBLE");
	else
		System.out.println("IMPOSSIBLE");
	
 }
}
