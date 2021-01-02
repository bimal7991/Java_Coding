package codechef;
import java.util.*;

public class SC31 {
 public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int T=sc.nextInt();
    for(int t=0;t<T;t++)
    {
    	int n=sc.nextInt();
    	int arr[]=new int[10];
    	for(int i=0;i<n;i++)
    	{
    	   String s=sc.next();
    		for(int j=0;j<s.length();j++)
    		{
    			if(s.charAt(j)=='1')
    				arr[j]++;
    		}
    	}
    	int count=0;
    	for(int j=0;j<10;j++)
    	{
    		if(arr[j]%2!=0)
    			count++;
    	}
    	System.out.println(count);
    }
}


}
