package GraphOrTree;

import java.util.ArrayList;
import java.util.Scanner;

public class Subtree_size {
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
    		dfs(1,arr);
    		for(int i=1;i<=n;i++)
		     System.out.println(subSize[i]);
	}
    }
    
    static int subSize[]=new int[100001];	
    static int vis[]=new int[1000001];
    static int dis[]=new int[1000001];
    private static int dfs(int node, ArrayList<Integer>[] arr) {
    	int curSize=1;
    	
    	vis[node]=1;
    	//System.out.println(node);
    		for(int i=0;i<arr[node].size();i++) {
    			int child=arr[node].get(i);
    			if(vis[child]!=1) {
    				
    				curSize=curSize+dfs(child,arr);
    			}
    		}
    		subSize[node]=curSize;
    		return curSize;
    	
    }
}
