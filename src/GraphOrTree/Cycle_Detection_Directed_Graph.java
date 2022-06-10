package GraphOrTree;

import java.util.ArrayList;
import java.util.Scanner;

public class Cycle_Detection_Directed_Graph {
	public static void main(String[] args) {
		   Scanner sc=new Scanner(System.in);
			int T=sc.nextInt();
			
			while(T-->0) {
				int n=sc.nextInt(),m=sc.nextInt();
				ArrayList<Integer> arr[]=new ArrayList[n+1];
				for(int i=0;i<=n;i++) {
					arr[i]=new ArrayList<Integer>();
				}
				for(int i=0;i<m;i++) {
					int u=sc.nextInt(),v=sc.nextInt();
					arr[u].add(v);
				}
				
				int vis[]=new int[n+1];
				int dfsVis[]=new int[n+1];
				int flag=0;
				for(int i=1;i<=n;i++) {
					if(dfs(i,vis,dfsVis,arr))
					{
						flag=1;
						break;
						
					}		
				}
				if(flag==1) {
					System.out.println("Graph has a cycle");
				}
				else {
					System.out.println("Graph has no cycle");
				}
				
	   }
	 
}

	private static boolean dfs(int u, int[] vis, int[] dfsVis, ArrayList<Integer>[] arr) {
		vis[u]=1;
		dfsVis[u]=1;
		for(int child:arr[u]) {
			if(vis[child]==0) {
				if(dfs(child,vis,dfsVis,arr))
					return true;
			}
			else if(dfsVis[child]==1)
				return true;
			
		}
		dfsVis[u]=0;
		return false;
	}
	
}
