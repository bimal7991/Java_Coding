package codechef;
import java.util.*;
public class TREDIFF {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		int T=sc.nextInt();
		while(T-->0)
		{
			int n=sc.nextInt(),q=sc.nextInt();
			int value[]=new int[n+1];
			for(int i=1;i<=n;i++)
				value[i]=sc.nextInt();
			
			for(int i=1;i<=n;i++)
			{
				arr[i]=new ArrayList<Integer>();
			}
			
			for(int i=1;i<n;i++)
			{
				int u=sc.nextInt(),v=sc.nextInt();
				arr[u].add(v);
				arr[v].add(u);
			}
			
			for(int i=0;i<q;i++)
			{
				int src=sc.nextInt(),dest=sc.nextInt();
				
				dfs(src,dest);
				Arrays.fill(vis, 0);
				path.clear();
				
			}



		}
	}
	static ArrayList<Integer> arr[]=new ArrayList[1000001];
	static int vis[]=new int[1000001];
	static ArrayList<Integer> path=new ArrayList<Integer>();
	static void dfs(int node,int d)
	{
		vis[node]=1;
		path.add(node);
		if(node==d)
			System.out.println(path);
		
		for(int i=0;i<arr[node].size();i++)
		{
			int child=arr[node].get(i);
            if(vis[child]==0)
            {
            	dfs(child,d);
            }
		}
		
//		for(int child:arr[node])//
//		{
//			if(vis[child]==0)
//				dfs(child);
//		}
		
	}
	
}
