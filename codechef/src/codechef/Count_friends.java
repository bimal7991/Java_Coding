package codechef;
import java.util.*;
public class Count_friends {
  public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt(),m=sc.nextInt();
	for(int i=1;i<=n;i++)    /// disjoint set problem
	{
		parent[i]=-1;
		rank[i]=1;
	}
	while(m-->0)
	{
		int a=sc.nextInt(),b=sc.nextInt();
		a=find(a);
		b=find(b);
		if(a!=b)
			union(a,b);
	}
	int q=sc.nextInt();
	while(q-->0)
	{
		int a=sc.nextInt(),b=sc.nextInt();
		a=find(a);
		b=find(b);
		if(a==b)
			rank[b]=0;
		
		
	}
	
	int max=0;
	for(int i=1;i<=n;i++)
	{
		if(rank[find(i)]>max)
			max=rank[find(i)];
	}
	System.out.println(max);
	
	
	
}
  private static void union(int a, int b) {
	// TODO Auto-generated method stub
	  if(rank[a]>rank[b])
	  {
		  rank[a]+=rank[b];
		  parent[b]=a;
	  }
	  else
	  {
		  rank[b]+=rank[a];
		  parent[a]=b;
	  }
	  
	
}
private static int find(int a) {
	// TODO Auto-generated method stub
	if(parent[a]<0)
		return a;
	else
		return parent[a]=find(parent[a]);
}
static int parent[]=new int[100001];
  static int rank[]=new int[100001];
  
  
}
