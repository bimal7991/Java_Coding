import java.util.*;
public class LongestCommonSubsequence {
  public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String a=sc.next();
	String b=sc.next();
	int ans=LCS(a,a.length(),b,b.length());
	int dp[][]=new int[a.length()+1][b.length()+1];
	for(int i=1;i<=a.length();i++) {
		for(int j=1;j<=b.length();j++) {
			if(a.charAt(i-1)==b.charAt(j-1)) {
				dp[i][j]=1+dp[i-1][j-1];
			}
			else {
				dp[i][j]=Math.max(dp[i-1][j], dp[i][j-1]);
			}
		}
	}
	System.out.println(dp[a.length()][b.length()]);
	
	
	System.out.println(ans);
	
}

private static int LCS(String a,int n,String b,int m) {
	// TODO Auto-generated method stub
	 
	
	
	if(n==0 || m==0)
		return 0;
	
	if(a.charAt(n-1) == b.charAt(m-1)) {
		return 1+LCS(a, n-1, b, m-1);
	}
	else {
		return Math.max(LCS(a, n-1, b, m),LCS(a, n, b, m-1));
	}

}
  
}
