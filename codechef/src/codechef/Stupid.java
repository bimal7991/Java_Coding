package codechef;
import java.util.*;
public class Stupid {
   public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int T=sc.nextInt();
	for(int t=0;t<T;t++)
	{
		int n=sc.nextInt();
		int arr[]=new int[n];
		int min=Integer.MAX_VALUE,min_ind=0;
		long max=0;
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
				
		}
		for(int i=0;i<n;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
				max=max+min;
			}
			else
			{
				max=max+min;
			}
				
		}
		
		
		
       System.out.println(max);
	}
}
}
