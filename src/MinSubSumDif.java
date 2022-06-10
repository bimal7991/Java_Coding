import java.util.*;
public class MinSubSumDif {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		int sum=0;
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			sum=sum+arr[i];
		}
		
		boolean t[][]=new boolean[n+1][sum+1];
		for(int i=0;i<=n;i++)
			t[i][0]=true;
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=sum;j++) {
				if(arr[i-1]<=j) {
					t[i][j]=t[i-1][j] || t[i-1][j-arr[i-1]];
				}
				else {
					t[i][j]=t[i-1][j];
				}
			}
		}
		
		ArrayList<Integer> minsum=new ArrayList<Integer>();
		for(int i=1;i<=sum/2;i++) {
			if(t[n][i]==true) {
				minsum.add(i);
			}
		}
		
		int min=sum;
		for(int i=0;i<minsum.size();i++) {
			min=Math.min(min, sum-2*minsum.get(i));
		}
		
		System.out.println(min);
		
		
	}
}
