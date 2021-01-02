package codechef;
import java.util.*;
public class SSSP_TREE {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0)
		{
			int N=sc.nextInt();
			for(int i=1;i<=N;i++)
			{
				arr[i]=new ArrayList<Integer>();
			}
			
			
			for(int i=1;i<N;i++)
			{
			   	int u=sc.nextInt(),v=sc.nextInt();
			   	arr[u].add(v);
			   	arr[v].add(u);
			}
			dfs(1,0);
			for(int i=1;i<=N;i++)
			{
				System.out.print(dist[i]+" ");
			}
			
			
			
		}
	}
	static ArrayList<Integer> arr[]=new ArrayList[1000001];
	static int vis[]=new int[1000001];
	static int dist[]=new int[1000001];
	static void dfs(int node,int d)
	{
		vis[node]=1;
		dist[node]=d;
		for(int i=0;i<arr[node].size();i++)
		{
			int child=arr[node].get(i);
            if(vis[child]==0)
            {
            	dfs(child,dist[node]+1);
            }
		}
		
//		for(int child:arr[node])//
//		{
//			if(vis[child]==0)
//				dfs(child);
//		}
		
	}
}
