package codechef;
import java.math.BigInteger;
import java.util.*;
public class English {
 public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int T=sc.nextInt();
	
	for(int t=0;t<T;t++)
	{
		int N=sc.nextInt();
		sc.nextLine();
		String arr[]=new String[N];
		for(int i=0;i<N;i++)
		{
			arr[i]=sc.next();
		}
		int calc[]=new int[N];
		BigInteger ans=new BigInteger("0");
		int limit=0;
		for(int i=0;i<N;i++)
		{
			if(calc[i]==1)
				continue;
			long min=Long.MAX_VALUE;
			int ind=0;
			for(int j=i+1;j<N;j++)
			{
				if(arr[i].charAt(0)==arr[j].charAt(0) && calc[j]==0 && arr[i].charAt(arr[i].length()-1)==arr[j].charAt(arr[j].length()-1))
				{
					int len1=arr[i].length();
					int len2=arr[j].length();
					
					int prefix=0;
					int suffix=0;
					if(arr[i].equals(arr[j]))
					{
						min=arr[i].length();
						ind=j;
						continue;
					}
					for(int k=0;k<Math.min(len1, len2);k++)
					{
						if(arr[i].charAt(k)==arr[j].charAt(k))
							prefix++;
						else
							break;
					}
					for(int k=len1-1,l=len2-1;k>=0 && l>=0;k--,l--)
					{
						if(arr[i].charAt(k)==arr[j].charAt(l))
							suffix++;
						else
							break;
					}
					//System.out.println(prefix+" "+suffix);
					if(Math.min(prefix, suffix)<min)
					{
						min=Math.min(prefix, suffix);
						
						ind=j;
					}
					//System.out.println(min);
				}
				
				//limit++;
			}
			//System.out.println(min);
			if(min!=Long.MAX_VALUE)
			ans=ans.add(BigInteger.valueOf(min).pow(2));
			calc[ind]=1;
			
			
		}
		
		System.out.println(ans);
		
		
	}
}
}
