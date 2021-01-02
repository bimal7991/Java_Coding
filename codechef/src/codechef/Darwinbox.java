package codechef;
import java.util.*;
public class Darwinbox {
   public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	for(int T=0;T<t;T++)
	{
		int n=sc.nextInt();
		int arr[]=new int[9];
		for(int i=0;i<n;i++)
		{
			int a=sc.nextInt();
			int b=sc.nextInt();
			if(a<=8 && arr[a]<b)
				arr[a]=b;
			
		}
		int sum=0;
		for(int i=1;i<=8;i++)
			sum=sum+arr[i];
		System.out.println(sum);
	}
}
}
