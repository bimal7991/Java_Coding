package codechef;
import java.util.*;
public class Connected_component {
	static ArrayList<Integer> arr[]=new ArrayList[100001];
	static int vis[]=new int[100001];
	static int cc_size;
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0)
		{
		   int N=sc.nextInt(),m=sc.nextInt();
		   long res=1;
		 
		  for(int i=1;i<=N;i++)
		  {
			  arr[i]=new ArrayList<Integer>();
		  }
		  
		  
		  
		  for(int i=0;i<m;i++)
		  {
			  int src=sc.nextInt();
			  int dest=sc.nextInt();
			  arr[src].add(dest);
			  arr[dest].add(src);
		  }
		  int cc=0;
		  for(int i=1;i<=N;i++)
		  {
			  
			  if(vis[i]==0)
			  {
				  cc_size=0;
				  dfs(i);
				  cc++;
				  
				  res=(res*cc_size)%1000000007;
				  //System.out.println(cc_size);// printing no of node in every connected component
			  }
		  }
		  
		  System.out.println(cc+" "+res);
		  for(int i=1;i<=N;i++)
		  {
			  arr[i].clear();
		  }
		  Arrays.fill(vis, 0);
		  
		  
		  
		}		

	}
	static void dfs(int node)
	{
		vis[node]=1;
		cc_size++;
		for(int i=0;i<arr[node].size();i++)
		{
			int child=arr[node].get(i);
            if(vis[child]==0)
            {
            	dfs(child);
            }
		}
		
//		for(int child:arr[node])//
//		{
//			if(vis[child]==0)
//				dfs(child);
//		}
		
	}

}
