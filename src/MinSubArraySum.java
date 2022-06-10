import java.util.*;
public class MinSubArraySum {
  public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int T=sc.nextInt();
	while(T-->0) {
		int N=sc.nextInt();
		int arr[]=new int[N];
		for(int i=0;i<N;i++) {
			arr[i]=sc.nextInt();
		}
		int target=sc.nextInt();
		
		int i=0,j=0;
		int sum=0;
		int max=N;
		while(j<N) {
			sum=sum+arr[j];
			if(sum<target) {
				j++;
			}
			else if(sum==target) {
				//System.out.println(j+" "+i);
				max=Math.min(max, j-i+1);
				j++;
			}
			else  {
				while(sum>target) {
					sum=sum-arr[i];
					i++;
				}
				if(sum==target) {
					max=Math.min(max, j-i+1);
				}
				j++;
			}
		}
		System.out.println(max);
	}
}
}
