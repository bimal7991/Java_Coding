import java.util.*;
public class HackerRank {
  public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<n;i++)
		arr[i]=sc.nextInt();
	long left[]=new long[n];
	long right[]=new long[n];
	
	int start=0;
	
		left[0]=1;
	
	for(int i=1;i<n;i++) {
		if(arr[i]>arr[i-1]) {
			left[i]=left[i-1]+1;
		}else {
			left[i]=1;
		}
	}
	
	for(int i=0;i<n;i++)
		System.out.print( left[i]+" ");
	
	System.out.println();
	long sum=0,temp=0;
	
	right[n-1]=1;
	
	for(int i=n-2;i>=0;i--) {
		
		if(arr[i]>arr[i+1] ) {
		temp=right[i+1]+1;
		}
		else {
		right[i]=1;
		}
			
		
		right[i]=temp;
		
	}
	
	for(int i=0;i<n;i++)
		sum=sum+Math.max(left[i], right[i]);
	
	System.out.println(sum);
	
	
}
}
