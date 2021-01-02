package codechef;

import java.util.*;
import java.lang.*;
import java.io.*;

public class Longest_square_mat {
	public static void main (String[] args) {
		//code
		Scanner sc=new Scanner(System.in);
	  int	t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
		    int n=sc.nextInt(),m=sc.nextInt();
		    int arr[][]=new int[n][m];
		    for(int j=0;j<n;j++)
		    {
		        for(int k=0;k<m;k++)
		        {
		            arr[j][k]=sc.nextInt();
		        }
		    }
		    
		   int max=square_arr(arr,n,m);
		   System.out.println(max);
		}
		
	}
	static int square_arr(int arr[][],int n,int m)
	{
	    int max=0;
	    int dp[][]=new int[n][m];
	    for(int i=0;i<n;i++)
	    {
	        if(arr[i][0]==1)
	          {
	              dp[i][0]=1;
	              max=1;
	          }
	    }
	    for(int i=0;i<m;i++)
	       if(arr[0][i]==1)
	          {
	              dp[0][i]=1;
	              max=1;
	          }
	   
	   for(int i=1;i<n;i++)
	   {
	       for(int j=1;j<m;j++)
	       {
	           if(arr[i][j]==0)
	             dp[i][j]=0;
	            else
	              {
	                  dp[i][j]=min(dp[i-1][j],dp[i-1][j-1],dp[i][j-1])+1;
	                  if(dp[i][j]>max)
	                  max=dp[i][j];
	              }
	       }
	   }
	       
	    return max;
	}
	static int min(int a,int b,int c)
	{
	    int k=Math.min(a,b);
	    int l=Math.min(k,c);
	    return l;
	}
}
