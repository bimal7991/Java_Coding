package codechef;
import java.util.*;
public class Mex_degree {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		for(int t=0;t<T;t++)
		{
			int n=sc.nextInt(),m=sc.nextInt();
		    if(n+1==m || n==m)
		    {
               System.out.println(2);	
               continue;
		    }
		    else if(n-1==m)
		    {
		    	 System.out.println(1);	
	               continue;
		    }
		    else if(n-1>m)
		    {		    	System.out.println(-1);	
	               continue;
		    }		    	
		    else
		    {
		    	int k=m/n;
		    	System.out.println(k+2);
		    	continue;
		    }
		}
	}
}