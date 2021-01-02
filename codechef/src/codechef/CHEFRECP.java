package codechef;
import java.util.*;
public class CHEFRECP {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0)
		{
			int N=sc.nextInt();
			int arr[]=new int[N];
			for(int i=0;i<N;i++)
			{
				arr[i]=sc.nextInt();
			}
			int hash[]=new int[1001];
			hash[arr[0]]++;
			int flag=0;
			for(int i=1;i<N;i++)
			{
				
				if(arr[i]==arr[i-1])
				{
					hash[arr[i]]++;
				}
				else
				{
					if(hash[arr[i]]==0)
						hash[arr[i]]++;
					else
					{
						flag=1;
						break;
					}
				}
			}
			if(flag==1)
				System.out.println("NO");
			else
			{
				int flag2=0;
			    for(int i=1;i<=1000;i++)
			    {
			    	
			    	if(hash[i]==0)
			    		continue;
			    	for(int j=i+1;j<=1000;j++)
			    	{
			    		if(hash[i]==hash[j] && hash[j]!=0)
			    		{
			    			flag2=1;
			    			break;
			    		}
			    	}
			    	if(flag2==1)
			    		break;
			    }
			    if(flag2==1)
			    	System.out.println("NO");
			    else
			    	System.out.println("YES");
			}
			
		}
	}

}
