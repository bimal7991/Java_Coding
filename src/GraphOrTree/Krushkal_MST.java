package GraphOrTree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Krushkal_MST {
	 public static void main(String[] args) {
	  	   Scanner sc=new Scanner(System.in);
	  	   int T=sc.nextInt();
	  		
	  		while(T-->0) {
	  			int n=sc.nextInt(),m=sc.nextInt();	  		
	  			ArrayList<UVW> nodes=new ArrayList<UVW>();
	  			for(int i=0;i<m;i++) {
	  				int u=sc.nextInt(),v=sc.nextInt(),w=sc.nextInt();
	  				nodes.add(new UVW(u,v,w));
	  				
	  			}
	  			Collections.sort(nodes, new SortUVW());
	  			
	  			krushkalMSt(nodes,n);
	  			
	  			
	  			int dis[]=new int[n+1];
	  			Arrays.fill(dis, 999999);
	  			
	  		}
    }

	private static void krushkalMSt(ArrayList<UVW> nodes, int n) {
		int parent[]=new int[n+1];
		int rank[]=new int[n+1];
		for(int i=1;i<=n;i++)
		{
			parent[i]=i;
			rank[i]=0;
		}
		List<UVW> ans=new ArrayList<UVW>();
		int mstSum=0;
		for(int i=0;i<nodes.size();i++) {
			int u=nodes.get(i).u,v=nodes.get(i).v,w=nodes.get(i).w;
			if(find(u,parent)!=find(v,parent)) {
				ans.add(new UVW(u,v,w));
				union(u,v,parent,rank);
				mstSum +=w;
				
			}
		}
		for(int i=0;i<ans.size();i++)
		System.out.println(ans.get(i).u +" - > "+ans.get(i).v);
		
		System.out.println(mstSum);
		
	}

	private static void union(int u, int v, int[] parent, int[] rank) {
		u=find(u, parent);
		v=find(v, parent);
		if(rank[u]>rank[v]) {
			parent[v]=u;
		}
		else if(rank[u]<rank[v]){
			parent[u]=v;
		}
		else {
			parent[u]=v;
			rank[v]++;
		}
		
	}

	private static int find(int v, int[] parent) {
		// TODO Auto-generated method stub
		if(v==parent[v])
			return parent[v];
		
		return parent[v]=find(parent[v],parent);
	}
}
class SortUVW implements Comparator<UVW>{

	@Override
	public int compare(UVW n1, UVW n2) {
		// TODO Auto-generated method stub
		if(n1.w<n2.w) {
			return -1;
		}
		if(n1.w>n2.w) {
			return 1;
		}
		
		return 0;
	}
	
}

class UVW{
	  int u, v, w;
	  

	public UVW(int u, int v, int w) {
		this.u = u;
		this.v = v;
		this.w = w;
	}

	public int getU() {
		return u;
	}

	public int getV() {
		return v;
	}

	public int getW() {
		return w;
	}
	  
}

