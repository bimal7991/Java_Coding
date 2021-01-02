package codechef;
import java.util.*;
public class Budget {


public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	long arr[]=new long[n];
	for(int i=0;i<n;i++)
	{
		arr[i]=sc.nextLong();
	}
	  long ans=0;
	  Arrays.sort(arr);
	  for(int i=0;i<n;i++)
	  {
		  if(arr[i]*(n-i)>ans)
			  ans=arr[i]*(n-i);
	  }
//	for(int i=0;i<n;i++)
//	{
//		if((arr[i]*n)>ans)
//		{
//			int count=0;
//		for(int j=0;j<n;j++)
//		{
//			if(arr[i]<=arr[j])
//				count++;
//		}
//		if((arr[i]*count)>ans)
//			ans=(arr[i]*count);
//			
//		}
//	}
	System.out.println(ans);
}
}
