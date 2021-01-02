package codechef;
import java.util.*;
public class WWALK {
  public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int T=sc.nextInt();
	while(T-->0)
	{
		int N=sc.nextInt();
	   int a[]=new int[N];
	   int b[]=new int[N];
	   
	   
	    for(int i=0;i<N;i++)
	    {
	    	a[i]=sc.nextInt();
	    }
	    for(int i=0;i<N;i++)
	    {
	    	b[i]=sc.nextInt();
	    }
	   long asum=a[0];
       long bsum=b[0];
       long sum=0;
       if(asum==bsum)
    	   sum=asum;
	    
	    for(int i=1;i<N;i++)
	    {
	    	if(a[i]==b[i] && asum==bsum)
	    	{
	    		sum=sum+a[i];
	    	}
	        asum=asum+a[i];
	        bsum=bsum+b[i];
	       
	    }
	   System.out.println(sum); 
	    
	}
}
}
