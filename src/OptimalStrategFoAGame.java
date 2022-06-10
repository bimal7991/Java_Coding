import java.util.*;
public class OptimalStrategFoAGame {
  public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<n;i++)
		arr[i]=sc.nextInt();
	
	int ans=optimal(arr,0,n);
	System.out.println(ans);
	
}

private static int optimal(int[] arr, int s,int n) {
	// TODO Auto-generated method stub
	if(n==1 || s==n) {
		return arr[n-1];
	}
	
	int a=Math.max(arr[s]+optimal(arr, s+1, n), arr[n-1]+optimal(arr, s, n-1));
	
	int b=Math.max(arr[s]+optimal(arr, s+1, n), arr[n-1]+optimal(arr, s, n-1));
	
	
	return b;
}
  
  
}
