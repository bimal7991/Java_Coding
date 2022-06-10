package GraphOrTree;
import java.util.*;
public class Connected_components {
           public static void main(String[] args) {
        	   Scanner sc=new Scanner(System.in);
        	   int T=sc.nextInt();
        		
        		while(T-->0) {
        			int n=sc.nextInt(),m=sc.nextInt(),lib=sc.nextInt(),road=sc.nextInt();
        			ArrayList<Integer> arr[]=new ArrayList[n+1];
        			for(int i=0;i<=n;i++) {
        				arr[i]=new ArrayList<Integer>();
        			}
        			for(int i=0;i<m;i++) {
        				int u=sc.nextInt(),v=sc.nextInt();
        				arr[u].add(v);
        				arr[v].add(u);
        			}
        			int count=0;
        			int ans=0;
        			for(int i=1;i<=n;i++) {
        				 con=0;
        				if(vis[i]==0) {
        					dfs(i,arr);
        					count++;
        					
        					int max=Integer.MAX_VALUE;
        					if(road>lib) {
        						ans=ans+(con*lib);
        					}
        					else {
        					for(int j=1;j<=con;j++){
                             if((lib*j+(con-j)*road)<=max){
                            	 max=lib*j+(con-j)*road;
                             }
                            }
        					ans=ans+max;
        					}   	
        				}
        				
        			}
        			Arrays.fill(vis, 0);
        			
        			System.out.println(ans);
        			
        		}
			
		}
           static int con;
           static int vis[]=new int[1000001];
           static int dis[]=new int[1000001];
           private static void dfs(int node, ArrayList<Integer>[] arr) {
        	   
           	if(vis[node]==1) {
           		return;
           	}
           	con++;
           	vis[node]=1;
           	//System.out.println(node);
           		for(int i=0;i<arr[node].size();i++) {
           			int child=arr[node].get(i);
           			if(vis[child]!=1) {
           				dfs(child,arr);
           			}
           		}
           	
           }
}
