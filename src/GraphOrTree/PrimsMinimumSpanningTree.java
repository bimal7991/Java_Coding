package GraphOrTree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class PrimsMinimumSpanningTree {
	 public static void main(String[] args) {
	  	   Scanner sc=new Scanner(System.in);
	  	   int T=sc.nextInt();
	  		
	  		while(T-->0) {
	  			int n=sc.nextInt(),m=sc.nextInt();
	  			ArrayList<NodeDis> arr[]=new ArrayList[n+1];
	  			for(int i=0;i<=n;i++) {
	  				arr[i]=new ArrayList<NodeDis>();
	  			}
	  			
	  			for(int i=0;i<m;i++) {
	  				int u=sc.nextInt(),v=sc.nextInt(),w=sc.nextInt();
	  				arr[u].add(new NodeDis(v,w));
	  				arr[v].add(new NodeDis(u, w));
	  				
	  			}
	  			int dis[]=new int[n+1];
	  			Arrays.fill(dis, 999999);
	  			minimumSpanningTree(0, arr,n);
	  			
	  		}
		 }

	private static void minimumSpanningTree(int start, ArrayList<NodeDis>[] arr, int n) {
		// TODO Auto-generated method stub
		int key[]=new int[n];
		Arrays.fill(key, 9999999);
		boolean mst[]=new boolean[n];
		Arrays.fill(mst, false);
		int parent[]=new int[n];
		Arrays.fill(parent, -1);
		PriorityQueue<NodeDis> pq=new PriorityQueue<NodeDis>(n,new NodeDis());
		pq.add(new NodeDis(0,0));
		key[start]=0;
		while(!pq.isEmpty()) {
			NodeDis par=pq.poll();
			mst[par.getNode()]=true;
			for(NodeDis child:arr[par.getNode()]) {
				if(mst[child.getNode()]==false &&   child.getWeight()<key[child.getNode()]) {
					key[child.getNode()]=child.getWeight();
					parent[child.getNode()]=par.getNode();
					pq.add(new NodeDis(child.getNode(),key[child.getNode()]));
				}
			}
		}
		for(int i=1;i<n;i++) {
		System.out.println(parent[i]+" -> "+i);
		}
	}


}
