package GraphOrTree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFS {
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
			bfs(1,arr);
			Arrays.fill(dis, 9999999);
			sortestDistance(1, arr);  // directed graph
			for(int i=1;i<=n;i++)
			System.out.print(dis[i]+" ");
		}
	}
	static int vis[]=new int[1000001];
	static int dis[]=new int[1000001];
	private static void bfs(int node, ArrayList<Integer>[] arr) {	
		Queue<Integer> queue=new LinkedList<Integer>();
		dis[node]=0;
		vis[node]=1;
		queue.add(node);
		//System.out.println(node);
		while(!queue.isEmpty()) {
			int curr=queue.peek();
			queue.remove();
			for(int child:arr[curr]) {
				
				if(vis[child]==0) {
					//System.out.println(child);
					vis[child]=1;
					queue.add(child);
					dis[child]=dis[curr]+1;
				}
			}
			
		}
	}
	private static void sortestDistance(int node, ArrayList<Integer>[] arr) {	
		Queue<Integer> queue=new LinkedList<Integer>();
		dis[node]=0;
		queue.add(node);
		//System.out.println(node);
		while(!queue.isEmpty()) {
			int curr=queue.peek();
			queue.remove();
			for(int child:arr[curr]) {
				
				if(dis[curr]+1<dis[child]) {
					//System.out.println(child);
					queue.add(child);
					dis[child]=dis[curr]+1;
				}
			}
			
		}
	}
}
