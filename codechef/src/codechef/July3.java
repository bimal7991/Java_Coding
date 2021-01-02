package codechef;
import java.util.*;

public class July3 {
   public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int T=sc.nextInt();
	while(T-->0) {
		int n=sc.nextInt();
		long arr[]=new long[n];
		for(int i=0;i<n;i++)
		   arr[i]=sc.nextLong();
		
		
		int bit[]=new int[n];
		for(int i=0;i<n;i++)
		{
			long v=arr[i];
			int c=0;
			while(v>0)
			{
				if((v&1)>0)
				{
					c++;
				}
				v=v>>1;
					
					
			}
			bit[i]=c;
				
		}
		
		
		
		long minv=Long.MAX_VALUE,maxv=Long.MIN_VALUE;
		int mini=-1,maxi=-1;
		
		for(int i=0;i<n;i++)
		{
			if(bit[i]>maxv)
			{
				maxv=bit[i];
				maxi=i;
			}
			
			if(bit[i]<=minv)
			{
				minv=bit[i];
				mini=i;
			}
		}
		
		long max=Long.MIN_VALUE;
		
                  max=binary(arr[maxi],arr[mini]);
                 // System.out.println(i+" "+j);
				
		
		System.out.println( Math.abs(max));
	}
	
	
	}

private static long binary(long x, long y) {
	// TODO Auto-generated method stub
	
	String binx=Long.toBinaryString(x);
	String biny=Long.toBinaryString(y);
	String binxy=binx+biny;
	String binyx=biny+binx;
	
	long xy=Long.parseLong(binxy,2);
	long yx=Long.parseLong(binyx,2);
	
	  
	
	
	
	return xy-yx;
}
  
}