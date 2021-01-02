package codechef;
import java.util.*;
public class Change_it {
     public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		for(int t=0;t<T;t++)
		{
			int n=sc.nextInt();
			int arr[]=new int[n];
			int count[]=new int[101];
			for(int i=0;i<n;i++)
			{
				arr[i]=sc.nextInt();
				count[arr[i]]++;
			}
			int max=0;
			for(int i=0;i<=100;i++)
			{
			   if(count[i]>max)
				   max=count[i];
			}
			System.out.println(n-max);
		
		}
		
	}
}
