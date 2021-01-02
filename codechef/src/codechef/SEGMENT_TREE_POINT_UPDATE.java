package codechef;
import java.util.*;
public class SEGMENT_TREE_POINT_UPDATE {
	static int arr[]=new int[100001];  
	static  int st[][]=new int[400004][2];
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
			arr[i]=sc.nextInt();

		
		buildTree(1,1,n);
		int q=sc.nextInt();
		while(q-->0)
		{
			int code=sc.nextInt(),l=sc.nextInt(),r=sc.nextInt();
			if(code==0)
			{
				if(r%2==0)
				{
					if(arr[l]%2==1)
						update(1, 1, n, l,r);
				}
				else
				{
				   if(arr[l]%2==0)
					   update(1, 1, n, l,r);
				}
					
			}
			else {
				System.out.println(getevenodd(code,1,1,n,l,r));
			}
			
			
		}

}
	private static int getevenodd(int code,int si, int ss, int se, int qs, int qe) {
		if(qs>se || qe<ss)
			return 0;
		if(ss>=qs && se<=qe && code==1)
           return st[si][0];
		if(ss>=qs && se<=qe && code==2)
	           return st[si][1];
		int mid=(ss+se)/2;
		int l=getevenodd(code, 2*si, ss, mid, qs, qe);
		int r=getevenodd(code, 2*si+1, mid+1, se, qs, qe);
		
		return l+r;
		
		
		
		
		// TODO Auto-generated method stub
		
	}
	private static void update(int si, int ss, int se, int ind, int val) {
		// TODO Auto-generated method stub
				if(ss==se)
				{
					arr[ss]=val;
					
					if(arr[ss]%2==0)
					{
						st[si][0]=1;
					}
					else
					{
						st[si][1]=1;
					}
					return;
				}
		
				int mid=(ss+se)/2;
				if(ind<=mid)
				update(2*si, ss, mid, ind, val);
				else
					update(2*si+1, mid+1, se, ind, val);
				
				st[si][0]=st[2*si][0]+st[2*si+1][0];
				st[si][1]=st[2*si][1]+st[2*si+1][1];
				
		
		// TODO Auto-generated method stub
		
	}
	private static void buildTree(int si, int ss, int se) {
		// TODO Auto-generated method stub
		if(ss==se)
		{
			if(arr[ss]%2==0)
			{
				st[si][0]=1;
			}
			else
			{
				st[si][1]=1;
			}
			return;
		}
		
		int mid=(ss+se)/2;
		buildTree(2*si, ss,mid);
		buildTree(2*si+1, mid+1, se);
		
		st[si][0]=st[2*si][0]+st[2*si+1][0];
		st[si][1]=st[2*si][1]+st[2*si+1][1];
	}
	
	
	
}