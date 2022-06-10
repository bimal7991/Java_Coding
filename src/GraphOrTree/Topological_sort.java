package GraphOrTree;
import java.util.*;
public class Topological_sort {
	public static void main(String[] args) {
		   Scanner sc=new Scanner(System.in);
			int T=sc.nextInt();
			
			while(T-->0) {
				int n=sc.nextInt(),m=sc.nextInt();
				ArrayList<Integer> arr[]=new ArrayList[n+1];
				for(int i=0;i<=n;i++) {
					arr[i]=new ArrayList<Integer>();
				}
				int inDegree[]=new int[n];
				for(int i=0;i<m;i++) {
					int u=sc.nextInt(),v=sc.nextInt();
					arr[u].add(v);
                    inDegree[v]++;					
				}

				int vis[]=new int[n+1];
				ArrayList<Integer> ans=new ArrayList<Integer>();
					bfs(inDegree,ans,arr);
					
					if(ans.size()!=n) {
						System.out.println("Graph has a cycle");
					}
					else {
					   System.out.println("Graph has no cycle");
					}
					
					for(int i=0;i<ans.size();i++) {
						System.out.print(ans.get(i)+" ");
					}
				
			}
   }

	private static void bfs( int[] inDegree, ArrayList<Integer> ans, ArrayList<Integer>[] arr) {
		// TODO Auto-generated method stub
		Queue<Integer> q=new LinkedList<Integer>();
		for(int i=0;i<inDegree.length;i++) {
			if(inDegree[i]==0) {
				q.add(i);
			}
		}		
		while(!q.isEmpty()) {
			int parent=q.poll();
			ans.add(parent);
			for(int child:arr[parent]) {
				inDegree[child]--;
				if(inDegree[child]==0) {
					q.add(child);
				}
			}
		}
	}
}
