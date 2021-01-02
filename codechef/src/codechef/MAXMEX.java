package codechef;

import java.util.Scanner;

public class MAXMEX {
	public static void main(String[] args) {
		
	
	Scanner sc=new Scanner(System.in);
	 int T=sc.nextInt();
	 while(T-->0)
	 {
		 int n=sc.nextInt(),m=sc.nextInt();
		 int arr[]=new int[n];
		 for(int i=0;i<n;i++)
			 arr[i]=sc.nextInt();
		 
		 int ind=-1;
		 for(int i=0;i<n-1;i++)
		 {
			 if( m>arr[i] && m<arr[i+1])
			 {
				 ind=i;
				 break;
				 
			 }
		 }
		 int k=m-1;
		 if(ind!=-1)
		 {
			 int start=0;
			 for(int i=ind;i>=0;i--)
			 {
				 if(arr[ind]==k--)
					 continue;
				 else
				 {
					 start=i;
					 break;
				 }
			 }
			 int end=n-1;
			int s=0;
			 for(int i=ind+1;i<n;i++)
			 {
                 if(arr[i]>m )
                	 s++;
			 }
			 System.out.println(ind-start+s+1);
			 
			 
		 }
		 else
			 System.out.println(-1);
		 
		 
		 
	 }
	 
}
}