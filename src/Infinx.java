import java.util.*;
public class Infinx {
   public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int T=sc.nextInt();
	while(T-->0) {
	int n=sc.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<n;i++) {
		arr[i]=sc.nextInt();
		
	}
	
	int start=0;
	int end=0,s=0;;
	int max=Integer.MIN_VALUE;
	int sum=0;
	for(int i=0;i<n;i++) {
		sum=sum+arr[i];
		if(sum>max) {
			max=sum;
			start=s;
			end=i;
		}
		if(sum<0) {
			sum=0;
			s=i+1;
		    
		    
		}
	}
	int maximum=Integer.MIN_VALUE;
	for(int i=start;i<=end;i++) {
		maximum=Math.max(maximum, arr[i]);
	}
	System.out.println(max+" "+maximum);
	System.out.println(max*maximum);
	
	} 
}
	
}
