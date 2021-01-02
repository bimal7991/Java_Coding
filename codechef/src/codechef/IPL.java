package codechef;
import java.util.*;
public class IPL {
     public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int dp[]=new int[n+1];
		dp[1]=arr[0];
		dp[2]=arr[1];
				
		for(int i=3;i<n+1;i++)
		{
			dp[i]=arr[i-1]+Math.min(dp[i-1], dp[i-2]);
		}
		System.out.println(Math.min(dp[n], dp[n-1]));
		
	}
}
