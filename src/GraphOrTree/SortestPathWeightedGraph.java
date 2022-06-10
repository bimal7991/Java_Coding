package GraphOrTree;
import java.util.*;
public class SortestPathWeightedGraph {
	 public static void main(String[] args) {
  	   Scanner sc=new Scanner(System.in);
  	   int T=sc.nextInt();
  		
  		while(T-->0) {
  			int n=sc.nextInt(),m=sc.nextInt();
  			ArrayList<Integer> arr[]=new ArrayList[n+1];
  			for(int i=0;i<=n;i++) {
  				arr[i]=new ArrayList<Integer>();
  			}
  			HashMap<String, Integer> weight=new HashMap<String, Integer>();
  			for(int i=0;i<m;i++) {
  				int u=sc.nextInt(),v=sc.nextInt(),w=sc.nextInt();
  				arr[u].add(v);
  				weight.put(""+u+v, w);
  			}
  			int dis[]=new int[n+1];
  			Arrays.fill(dis, 999999);
  			sortestDistance(1, arr,dis,weight);
  			for(int i=1;i<=n;i++) {
  				System.out.println(dis[i]+" ");
  			}
  			
  		}
	 }
	 private static void sortestDistance(int node, ArrayList<Integer>[] arr, int[] dis, HashMap<String, Integer> weight) {	
			Queue<Integer> queue=new LinkedList<Integer>();
			dis[node]=0;
			queue.add(node);
			//System.out.println(node);
			while(!queue.isEmpty()) {
				int curr=queue.peek();
				queue.remove();
				for(int child:arr[curr]) {
					//System.out.println(weight.get(new Weight(curr,child)));
					if(dis[curr]+weight.get(""+curr+child)<dis[child]) {
						//System.out.println(child);
						queue.add(child);
						dis[child]=dis[curr]+weight.get(""+curr+child);
					}
				}
				
			}
		}
}

