import java.util.*;
public class Tata_CLI {
   public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int T=sc.nextInt();
	while(T-->0) {
		int n=sc.nextInt(),k=sc.nextInt();
		long arr[]=new long[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextLong();
		
		int start=0;
		int end=n-1;
		while(start<n && end>=0 && k>0) {
		  if(arr[start]%2==0) {
			  if(arr[end]%2==1) {
				  long temp=arr[start];
				   arr[start]=arr[end];
				   arr[end]=temp;
				   k--;
				   start++;
				   end--;
			  }
			  end--;
		  }
		  else {
		     start++;
		  }
		}
		
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		
		long sum=0;
		int count=0;
		for(int i=0;i<n;i++) {
			if(arr[i]%2==0 ) {
				count++;  
				sum=0;
			}
			else {
				sum=sum+arr[i];
				if(sum%2==0 && sum!=0) {
					count++;
					sum=0;
				}
			}
		}
		
		System.out.println(count);
	}
}
}
