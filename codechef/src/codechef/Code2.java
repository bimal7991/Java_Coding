package codechef;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Code2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0)
		{
			int n=sc.nextInt();
			int arr[]=new int[n];
			int small=0,ind=0;
			for(int i=0;i<n;i++)
			{
			   arr[i]=sc.nextInt();
			   if(arr[i]>=small)
			   {
				   small=arr[i];
				   ind=i;
			   } 
			}
			 ArrayList<Integer> index=new ArrayList<Integer>();
			 for(int i=0;i<n;i++)
			 {
				 if(arr[i]==small)
				 {
					 index.add(i);
				 }
			 }
			 int diff=0;
			 for(int i=0;i<index.size()-1;i++)
			 {
				 int dif=index.get(i+1)-index.get(i)-1;
				 if(dif>diff)
					 diff=dif;
			 }
			//System.out.println(index);
			 Arrays.sort(arr);
			 if(arr[0]==arr[n-1])
			 {
				System.out.println(n);
			 }
			 else
			 {
				 int val=n-ind-1;
				 int firstval=index.get(0);
				 if(val<n/2 && diff<n/2 && firstval<n/2)
				 {
					 System.out.println(0);
					 continue;
				 }
				 int valu2=n/2-firstval;
				 int ans=val-valu2+1;
				 if(ans<0)
					 System.out.println(0);
				 else
					 System.out.println(ans);
				 
			 }
			 
			 
			
			
			
		}
	}
}
