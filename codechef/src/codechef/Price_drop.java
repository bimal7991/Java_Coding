package codechef;
import java.util.*;
public class Price_drop {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=sc.nextInt();
		    int arr[]=new int[n+5];
		    for(int j=0;j<5;j++)
		    	arr[j]=999999;
		    
		    for(int j=5;j<n+5;j++)
		    {
		    	arr[j]=sc.nextInt();
		    	
		    }
		    int flag,count=0,k;
		    for(int j=5;j<n+5;j++)
		    {
		    	flag=0;
		    	for( k=j-1;k>=j-5;k--)
		    	{
		    		if(arr[k]<=arr[j])
		    		{
		    		
		    			flag=1;
		    			break;
		    		}
		    	}
		    	if(flag==0)
		    		count++;
		    }
		    
		    System.out.println(count);
		    
		}
		
	}

}
