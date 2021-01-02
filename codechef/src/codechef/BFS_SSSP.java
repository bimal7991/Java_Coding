package codechef;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFS_SSSP {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0)
		{
			int N=sc.nextInt(),M=sc.nextInt();
			for(int i=1;i<=N;i++)
			{
				arr[i]=new ArrayList<Integer>();
			}
			
			
			for(int i=1;i<=M;i++)
			{
			   	int u=sc.nextInt(),v=sc.nextInt();
			   	arr[u].add(v);
			   	arr[v].add(u);
			}
			bfs(1);
			System.out.println(dist[N]);
			
			
			
		}
	}
	static ArrayList<Integer> arr[]=new ArrayList[1000];
	static int vis[]=new int[1000];
	static int dist[]=new int[1000];
	static void bfs(int node)
	{
		
		Queue<Integer> q=new  LinkedList<>();
		
		q.add(node);
		vis[node]=1;
		dist[node]=0;
		while(!q.isEmpty())
		{
			int curr=q.peek();
			q.remove();
			for(int child:arr[curr])
			{
				if(vis[child]==0)
				{
				q.add(child);
				dist[child]=dist[curr]+1;
				vis[child]=1;
				}
			}
			
		}
		
//		for(int child:arr[node])//
//		{
//			if(vis[child]==0)
//				dfs(child);
//		}
		
	}
}


