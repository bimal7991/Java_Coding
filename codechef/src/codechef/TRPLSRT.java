package codechef;

import java.util.*;
 class TRPLSRT {
   public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int T=sc.nextInt();
	while(T-->0)
	{
		int N=sc.nextInt(),K=sc.nextInt();
		int arr[]=new int[N+1];
		
		for(int i=1;i<=N;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		//int op=1;
		int count=0;
            ArrayList<Integer>   X=new ArrayList<Integer>();
            ArrayList<Integer>   Y=new ArrayList<Integer>();
            ArrayList<Integer>   Z=new ArrayList<Integer>();
             int op=1;
		while(op<=N)
		{
			if(op==N)
                       {
                          break;
                       }
			
			else if(arr[op]==op)
			{
				op=op+1;
			}
			else if(arr[op]!=op && arr[arr[op]]==op)
			{
			        op=op+1;
				continue;
			}
			else if(arr[op]!=op &&  arr[arr[op]]!=op){
			      count++;
			      int t=arr[op];
			      int x=arr[t];
			      int y=arr[x];
			      arr[x]=x;
			      arr[t]=arr[op];
			      arr[op]=y;
			     X.add(op);
			     Y.add(t);
			     Z.add(x);
			     
			      
		     }
		}
		for(int i=0;i<count;i++)
		{
			System.out.println(X.get(i)+" "+Y.get(i)+" "+Z.get(i));	
		}
		
		
		int flag2=0;
		op=1;
		while(op<=N)
		{
			
                       if(op==N)
                       {
                          break;
                       }
			
			 if(arr[op]!=op && arr[arr[op]]==op)
			{
				count++;
				int t=arr[op];
				int y=arr[t];
				
				int flag=0;
				for(int i=1;i<=N;i++)
				{
					if(i!=op && i!=arr[op] && arr[i]!=i)
					{
						flag=1;
						int z=arr[i];
						arr[t]=arr[op];
						arr[y]=z;
						arr[i]=y;
						X.add(op);
						Y.add(t);
						Z.add(i);
						break;
						
					}
					else
					{
					continue;
					}
				}
				if(flag==0)
				{
					System.out.println(-1);
					flag2=1;
					break;
				}
				
			}
			else if(arr[op]!=op && arr[arr[op]]!=op)
			{
				count++;
				int t=arr[op];
				int y=arr[t];
				int z=arr[y];
				arr[y]=y;
				arr[t]=arr[op];
				arr[op]=z;
				X.add(op);
				Y.add(t);
				Z.add(y);
				
				
			}
			else if(arr[op]==op)
			{
			op=op+1;
			}
			
			
		}
		if(flag2==0 && count<=K)
		{
		System.out.println(count);
		for(int i=0;i<count;i++)
		{
			System.out.println(X.get(i)+" "+Y.get(i)+" "+Z.get(i));
		}
		}
		
	}
	
}


}