import java.util.*;
public class DP2 {
  public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   int arr[]=new int[n];
   for(int i=0;i<n;i++)
	   arr[i]=sc.nextInt();
   
   int dp[]=new int[n+1];
   dp[0]=arr[0];
   dp[1]=Math.max(dp[0], dp[1]);
   for(int i=2;i<n;i++) {
	   dp[i]= Math.max(dp[i-2]+arr[i],dp[i-1] );
   }
   
   System.out.println(Math.max(dp[n-1], dp[n-2]));
   
     System.out.println(helper(arr,n,0,0));
   
}

private static int helper(int[] arr, int n, int sum,int f) {
	
	if(f>=n)
		return sum;
	return Math.max(helper(arr, n, sum+arr[f], f+2), helper(arr,n,sum,f+1));
	
	
	
}
  
  
}
