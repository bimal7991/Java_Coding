package GraphOrTree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Dijsktra {
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
	  			sortestDistance(1, arr,dis);
	  			
	  			for(int i=1;i<=n;i++) {
	  				System.out.println(dis[i]+" ");
	  			}
	  			
	  		}
		 }

	private static void sortestDistance(int i, ArrayList<NodeDis>[] arr, int[] dis) {
		PriorityQueue<NodeDis> pq=new PriorityQueue<NodeDis>(dis.length,new NodeDis()); 
		
		pq.add(new NodeDis(i,0));
		dis[i]=0;
		while(!pq.isEmpty()) {
			NodeDis parent=pq.poll();
			for(NodeDis child: arr[parent.getNode()]) {
				if(dis[parent.getNode()]+child.getWeight()<dis[child.getNode()]) {
					dis[child.getNode()]=dis[parent.getNode()]+child.getWeight();
					pq.add(new NodeDis(child.getNode(),dis[child.getNode()]));
				}
			}
			
		}
		
	}
}

class NodeDis implements Comparator<NodeDis>{
	int node;
	int weight;
	public NodeDis() {
		
	}
	
	public NodeDis(int node, int weight) {
		this.node = node;
		this.weight = weight;
	}
	public int getNode() {
		return node;
	}
	public void setNode(int node) {
		this.node = node;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	@Override
	public int compare(NodeDis n1, NodeDis n2) {
		// TODO Auto-generated method stub
		if(n1.weight<n2.weight)
			return -1;
		 if(n1.weight>n2.weight)
			 return 1;
		return 0;
	}
	
	
}
