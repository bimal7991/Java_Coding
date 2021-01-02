package codechef;
import java.util.*;
public class Variance {
  public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int k=sc.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<n;i++)
	{
		arr[i]=sc.nextInt();
	}
	int count = 0; 
    Arrays.sort(arr); // Sort array elements 
    for(int i=0;i<n;i++)

    {
    	for(int j=i+1;j<n;j++)
    	{
    		if(Math.abs(arr[i]-arr[j])>=k)
    		{
    			count=count+(n-j);
    			j=n-1;
    		}
    	}
    }
   
	System.out.println(count);
}
}
