package codechef;
import java.util.*;
public class SUPW {
  public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	long arr[]=new long[n];
	long sum=0;
	for(int i=0;i<n;i++)
	{
		arr[i]=sc.nextLong();
		sum=sum+arr[i];
	}
	long dp[]=new long[n+1];
	dp[1]=arr[0];
	dp[2]=arr[1];
	dp[3]=arr[2];
	for(int i=4;i<n+1;i++)
	{
		dp[i]=arr[i-1]+Math.min(dp[i-1],Math.min(dp[i-2], dp[i-3]));
	}
	long min=Math.min(dp[n],Math.min(dp[n-1], dp[n-2]));
   System.out.println(sum-min);
//	for(int i=0;i<n-3;i=i+3)
//	{
//		long max1=Math.min(arr[i], arr[i+1]);
//		sum=sum+Math.min(max1, arr[i+2]);
//	}
//	//System.out.println(sum);
//	if(k==1)
//		sum=sum+arr[n-1];
//	else if(k==2)
//		sum=sum+Math.min(arr[n-1], arr[n-2]);
//	else
//	{
//		long max1=Math.min(arr[n-1], arr[n-2]);
//		sum=sum+Math.min(max1, arr[n-3]);
//	}
	
	
}
}
