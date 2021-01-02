package codechef;
import java.util.*;
public class SQUARED {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0)
		{
			int N=sc.nextInt();
			int arr[]=new int[N];
			for(int i=0;i<N;i++)
				arr[i]=i;

			
			int hash[]=new int[N];
			int k=2;
			for(int i=0;i<N;i++)
			{
				if(arr[i]==0)
				{
					hash[i]=k;
					
				}
				else if(arr[i]%4==0)
				{
					hash[i]=k;
				
				}
				else if(arr[i]%2==0)
				{
					hash[i]=1;
					
				}
				else
				{
					hash[i]=0;
				}
			}
//				for(int i=0;i<N;i++)
//						System.out.print(hash[i]+" ");
            int hash2[]=hash.clone();

			long ans=N*(N+1)/2;
		
			int sum1=findCnt(hash, N, 0);
			//System.out.println(sum1);
			int sum2=findCnt(hash2, N, 1);
			//System.out.println(sum2);
			//System.out.println(res);
			System.out.println(ans-(sum1-sum2));
		}
	}
	static int findCnt(int arr[], int n, int k) 
	{ 
		// Variable to store final answer 
		int ans = 0; 

		// Loop to find prefix-sum 
		for (int i = 1; i < n; i++) 
		{ 
			arr[i] += arr[i - 1]; 
			if (arr[i] > k || arr[i] < -1 * k) 
				ans++; 
		} 

		if (arr[0] > k || arr[0] < -1 * k) 
			ans++; 

		// Sorting prefix-sum array 
		Arrays.sort(arr); 

		// Loop to find upper_bound 
		// for each element 
		for (int i = 0; i < n; i++) 
			ans += n - upper_bound(arr, 0, n, arr[i] + k); 

		// Returning final answer 
		return ans; 
	} 
	static int upper_bound(int[] a, int low,  int high, int element) 
	{ 
		while(low < high) 
		{ 
			int middle = low + (high - low)/2; 
			if(a[middle] > element) 
				high = middle; 
			else
				low = middle + 1; 
		} 
		return low; 
	} 


}
