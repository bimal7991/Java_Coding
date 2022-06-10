package GraphOrTree;
import java.util.*;
public class DFS {
   public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int T=sc.nextInt();
	
	while(T-->0) {
		int n=sc.nextInt();
		int m=sc.nextInt();
		ArrayList<Integer> arr[]=new ArrayList[n+1];
		for(int i=0;i<=n;i++) {
			arr[i]=new ArrayList<Integer>();
		}
		for(int i=0;i<m;i++) {
			int u=sc.nextInt(),v=sc.nextInt();
			arr[u].add(v);
			arr[v].add(u);
		}
		dfs(1,arr,0);
		for(int i=1;i<=n;i++)
		System.out.print(dis[i]+" ");
		
	}
}
static int vis[]=new int[1000001];
static int dis[]=new int[1000001];
private static void dfs(int node, ArrayList<Integer>[] arr,int d) {
	if(vis[node]==1) {
		return;
	}
	dis[node]=d;
	vis[node]=1;
	//System.out.println(node);
		for(int i=0;i<arr[node].size();i++) {
			int child=arr[node].get(i);
			if(vis[child]!=1) {
				dfs(child,arr,dis[node]+1);
			}
		}
	
}


}
