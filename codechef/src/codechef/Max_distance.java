package codechef;
import java.util.*;
public class Max_distance {
    public static void main(String[] args) {
		
    	Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int dp[]=new int[1000000];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            
        	
        }
        for(int i=0;i<n;i++)
        {
        	dp[arr[i]]=i;
        }
        int max=0;
        for(int i=0;i<n;i++)
        {
        	if(dp[arr[i]]-i>max)
        		max=dp[arr[i]]-i;
        }
        System.out.println(max);
        
	}
	
	

}
