package GraphOrTree;
import java.util.*;
public class TreePath {
	public static void main(String[] args) {
		Scanner  sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0)
		{
			int n=sc.nextInt(),m=sc.nextInt(),q=sc.nextInt();
			ArrayList<Integer> arr[]=new ArrayList[n+1];
			for(int i=1;i<=n;i++)
			{
				arr[i]=new ArrayList<Integer>();
			}
		   int vis[]=new int[n+1];
		    Stack<Integer> path=new Stack<Integer>();
			
			for(int i=1;i<=m;i++)
			{
			   	int u=sc.nextInt(),v=sc.nextInt();
			   	arr[u].add(v);
			   	arr[v].add(u);
			}
			
			while(q-->0)
			{
				int src=sc.nextInt(),dest=sc.nextInt();
				dfs(src,dest,vis,path,arr);
				System.out.println(path);
				path.clear();
				Arrays.fill(vis, 0);
			}
			
		}
		
	}
	//static Stack<Integer> path=new LinkedList<Integer>();
	static int dist[]=new int[1000001];
	static void dfs(int node,int dest,int vis[],Stack<Integer> path,ArrayList<Integer> arr[])
	{
		
		path.push(node);
		if(node==dest)
		{
		System.out.println(path);
		return;
		}
		
		vis[node]=1;
		
		int flag=0;
		if(arr[node].size()!=0)
		{	
			for(int i=0;i<arr[node].size();i++)
			{
				int child=arr[node].get(i); 
	            if(vis[child]==0)
	            {
	            	dfs(child,dest,vis,path,arr);	
	            	flag=1;
	            	//path.remove(child);
	            }
			}
		}
		if(flag==0)
			path.pop();
		
	}
}

