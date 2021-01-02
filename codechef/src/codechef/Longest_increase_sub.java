package codechef;
import java.util.*;
import java.lang.*;
import java.io.*;

public class Longest_increase_sub {
	public static void main (String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    for(int i=0;i<t;i++)
	    {
	        int n=sc.nextInt();
	        int arr[]=new int[n];
	        for(int j=0;j<n;j++)
	        {
	            arr[j]=sc.nextInt();
	        }
	        int ans=maxsequence(arr,n);
	        
	        System.out.println(ans);
	    }
	    
	    
	    
		//code
		
		
	}
	
	static int maxsequence(int arr[],int n)
	{
	    int dp[]=new int[n];
	    Arrays.fill(dp,1);
	    int i,j;
	    for(i=1;i<n;i++)
	    {
	        for(j=0;j<i;j++)
	        {
	            if(arr[j]<arr[i])
	            {
	                dp[i]=maximum(dp[i],dp[j]+1);
	            }
	        }
	    }
	    int max=dp[0];
	    for( i=1;i<n;i++)
	    {
	        if(dp[i]>max)
	        max=dp[i];
	    }
	    return max;
	}
	static int maximum(int a,int b)
	{
	    return Math.max(a,b);
	}
}