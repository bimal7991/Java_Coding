package codechef;
import java.util.*;
public class PRIME_PATH {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		for(int i=1000;i<=9999;i++)
	    {
	    	arr[i]=new ArrayList<Integer>();
	    }
	    createGraph();
		while(T-->0)
		{
			int a=sc.nextInt(),b=sc.nextInt();
			 
			Arrays.fill(dis, -1);
			Arrays.fill(vis, 0);
			bfs(a);
			System.out.println(dis[b]);
		}
		 
		
		
	}
   static ArrayList<Integer> arr[]=new ArrayList[100001];
   static int vis[]=new int[1000001];
   static int dis[]=new int[1000001];  
   
   static void bfs(int node)
   {
	   
	   Queue<Integer> q=new LinkedList<Integer>();
	    
	   q.add(node);
	   dis[node]=0;
	   vis[node]=1;
	   while(!q.isEmpty())
	   {
		  int p=q.peek();
		  q.remove();
		  for(int child:arr[p])
		  {
			  if(vis[child]==0)
			  {
				  q.add(child);
				  vis[child]=1;
				  dis[child]=dis[p]+1;
			  }
		  }
	   }   
   }
   
   
   
   static void createGraph()
   {
	  ArrayList<Integer> prime=new ArrayList<Integer>();
	   for(int i=1000;i<=9999;i++)
		   if(isprime(i))
		   {
			   prime.add(i);
		   }
	   
	  for(int i=0;i<prime.size();i++)
	  {
		  for(int j=i+1;j<prime.size();j++)
		  {
			  
			  int a=prime.get(i);
			  int b=prime.get(j);
				  if(validation(a,b))
				  {
					  arr[a].add(b);
					  arr[b].add(a);
				  }
			  
		  }
	  }
	  
	   
   }

private static boolean validation(int a, int b) {
	  
	    int count=0;
	    while(a>0)
	    {
	    	int a_digit=a%10;
	    	int b_digit=b%10;
	    	if(a_digit!=b_digit)
	    	{
	    		count++;
	    	}	    	
	    	a=a/10;
	    	b=b/10;
	    }
	    if(count==1)
	    	return true;
	    else
	    	return false;	
}

private static boolean isprime(int n) {
	// TODO Auto-generated method stub
	for(int i=2;i*i<=n;i++)
	{
		if(n%i==0)
			return false;
	}
	return true;
}
   
   
}
