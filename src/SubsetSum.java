import java.util.*;
public class SubsetSum {
   public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  int n=sc.nextInt();
	  int arr[]=new int[n];
	  for(int i=0;i<n;i++) {
		  arr[i]=sc.nextInt();
	  }
	  int sum=sc.nextInt();
	 // boolean ans=subsum(arr,n,sum);
	  boolean dp[][]=new boolean[n+1][sum+1];
	  for(int i=0;i<=n;i++)
		  dp[i][0]=true;
	  
	  for(int i=1;i<=n;i++) {
		  for(int j=1;j<=sum;j++) {
			  if(arr[i-1]<=j) {
				  dp[i][j]=dp[i-1][j] || dp[i-1][j-arr[i-1]];
			  }
			  else {
				  dp[i][j]=dp[i-1][j];
			  }
		  }
	  }
	  
	  System.out.println(dp[n][sum]);
 }

private static boolean subsum(int[] arr, int n, int sum) {
	// TODO Auto-generated method stub
	
	if(n==0 || sum==0) {
		return true;
	}
  if(arr[n-1]<=sum)
  return subsum(arr,n-1,sum-arr[n-1]) || subsum(arr, n-1, sum);
  else
	  return subsum(arr, n-1, sum);
  
}


   
   
   
   
}
