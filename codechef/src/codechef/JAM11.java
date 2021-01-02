package codechef;
import java.util.*;
public class JAM11 {
  public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int T=sc.nextInt();
	int dp[]=new int[100001];
	int mod=1000000007;
	dp[0]=0;
	dp[1]=1;
	dp[2]=2;
	dp[3]=4;
	for(int i=4;i<=100000;i++)
	{
		dp[i]=(dp[i-1]%mod+dp[i-2]%mod+dp[i-3]%mod)%mod;
	}
			
	
	while(T-->0)
	{
           int n=sc.nextInt();
           System.out.println(dp[n]);
	}
}
}
