package codechef;
import java.util.*;
public class Divisible {
     public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),k=sc.nextInt();
		int arr[]=new int[n];
		int div[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt()%k;
		}
		int count=0,max=0;
		for(int i=0;i<n;i++)
		{
		
			count=0;
			 div[i]=1;
			for(int j=0;j<n;j++)
			{
				if(i==j)
					continue;
				
				 
				if((arr[i]+arr[j])!=k)
				{
				   
					div[j]=1;
				}
			}
			for(int j=0;j<n;j++)
			{
				if(div[i]==1)
					count++;
			}
			if(count>max)
				max=count;
			
		}
		for(int i=0;i<n;i++)
		System.out.println(max);
	}
}
