package codechef;
import java.util.*;
public class Chew {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),k=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
			long count = 0; 
	    Arrays.sort(arr); // Sort array elements 
	   int l = 0, r = n-1; 
	   
	    while (l < r) 
	    { 
	       
	        if (arr[l] + arr[r] < k) 
	        { 
	            count += (r - l); 
	            l++; 
	        } 
	  
	        else
	            r--; 
	    } 
		System.out.println(count);
	}

}
