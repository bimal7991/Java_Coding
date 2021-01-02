package codechef;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Subtree_size {
	static ArrayList<Integer> arr[]=new ArrayList[100000];
	static int vis[]=new int[100000];
	static int subsize[]=new int[100001];
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0)
		{
		   int N=sc.nextInt(),m=sc.nextInt();
		 
		  for(int i=1;i<=N;i++)
		  {
			  arr[i]=new ArrayList<Integer>();
		  }
		  
		  
		  
		  for(int i=0;i<m;i++)
		  {
			  int src=sc.nextInt();
			  int dest=sc.nextInt();
			  arr[src].add(dest);
			  arr[dest].add(src);
		  }
		  
		   int size=dfs(1); 
		   
		   for(int i=1;i<=N;i++)
		   {
			   System.out.print(subsize[i]+" ");
		   }
		
		  for(int i=1;i<=N;i++)
		  {
			  arr[i].clear();
		  }
		  Arrays.fill(vis, 0);
		  Arrays.fill(subsize, 0);
		  
		  
		  
		}		

	}
	static int dfs(int node)
	{
		vis[node]=1;
		int cursize=1;
		for(int i=0;i<arr[node].size();i++)
		{
			int child=arr[node].get(i);
            if(vis[child]==0)
            {
            	cursize+=dfs(child);
            }
		}
		subsize[node]=cursize;
		return cursize;
		
//		for(int child:arr[node])//
//		{
//			if(vis[child]==0)
//				dfs(child);
//		}
		
	}

}

