import java.util.*;
public class LongestIncreasingSubsequence {
   public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	HashSet<Integer> hs=new HashSet<Integer>();
	int arr[]=new int[n];
	for(int i=0;i<n;i++) {
		arr[i]=sc.nextInt();
		hs.add(arr[i]);
	}
	
	Integer sorted[]=hs.toArray(new Integer[hs.size()]);;
	
	int sort[]=new int[hs.size()];
	for(int i=0;i<hs.size();i++)
		sort[i]=sorted[i];
	
	
	
	int dp[][]=new int[n+1][n+1];
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=hs.size();j++) {
			
			
			
			 if(arr[i-1]==sort[j-1]) {
				dp[i][j]=1+dp[i-1][j-1];
			}
			else {
				dp[i][j]=Math.max(dp[i][j-1], dp[i-1][j]);
			}
		}
	}
	
	
	System.out.println(dp[n][hs.size()]);
	
}

private static int LIS(int[] arr, int min, int n) {
	// TODO Auto-generated method stub
	if(n==0) {
		return 0;
	}
	if(min>arr[n-1]) {
		
		
		return Math.max(LIS(arr, min, n-1), 1+LIS(arr, arr[n-1], n-1));
	}
	else {
		return Math.max(LIS(arr,min,n-1),LIS(arr, arr[n-1], n-1));
	}
}
}
