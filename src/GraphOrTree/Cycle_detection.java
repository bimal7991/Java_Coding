package GraphOrTree;

import java.util.ArrayList;
import java.util.Scanner;

public class Cycle_detection {
   public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		
		while(T-->0) {
			int n=sc.nextInt();
			ArrayList<Integer> arr[]=new ArrayList[n+1];
			for(int i=0;i<=n;i++) {
				arr[i]=new ArrayList<Integer>();
			}
			for(int i=0;i<n-1;i++) {
				int u=sc.nextInt(),v=sc.nextInt();
				arr[u].add(v);
				arr[v].add(u);
			}
		
		
		if(dfs(1, arr, 0)) {
			System.out.println("YES");
		}
		else {
			System.out.println("No");
		}
		
   }
}
   static int vis[]=new int[1000001];
   static int dis[]=new int[1000001];
   private static boolean dfs(int node, ArrayList<Integer>[] arr,int parent) {
   	
   	vis[node]=1;
   	//System.out.println(node);
   		for(int i=0;i<arr[node].size();i++) {
   			int child=arr[node].get(i);
   			if(vis[child]!=1) {
   				if(dfs(child,arr,node)==true) {
   					return true;
   				}
   			}
   			else {
   			if(child!=parent) {
   				return true;
   			}
   			}
   		}
   	 return false;
   }
  
		
}
