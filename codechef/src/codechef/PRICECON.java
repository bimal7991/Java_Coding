package codechef;
import java.util.*;

public class PRICECON {
  public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int T=sc.nextInt();
	while(T-->0)
	{
		int n=sc.nextInt(),k=sc.nextInt();
		int arr[]=new int[n];
		int initReve=0,finalRev=0;
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
			initReve=initReve+arr[i];
		}
		
		for(int i=0;i<n;i++)
		{
		   if(arr[i]>k)
			   finalRev=finalRev+k;
		   else
		   {
			   finalRev=finalRev+arr[i];   
		   }
		}
		System.out.println(initReve-finalRev);
		
	}
}
}
