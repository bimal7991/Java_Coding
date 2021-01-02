package codechef;


import java.util.*;
 class Boofish {
 public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int T=sc.nextInt();
	for(int t=0;t<T;t++)
	{
		int N=sc.nextInt();
		if(N==1)
		{
			System.out.println("Hooray");
			System.out.println(1);
			
		}
		else if(N%2==1)
		{
			System.out.println("Boo");
		}
			
		else
		{
			int arr[][]=new int[N][N];
			int dig=2*N-1;
			for(int i=0;i<N;i++)
				arr[i][i]=dig;
			
			for(int i=1;i<N;i++)
			{
				arr[0][i]=i;
			}
			int val=2;
			for(int i=1;i<N-1;i++)
			{
				if(i==N/2)
					val=1;
				
				arr[i][N-1]=val;
				val=val+2;
				
			}
			
			for(int i=1;i<N;i++)
			{
			    val=arr[i][N-1]+1;
				for(int j=i+1;j<N-1;j++)
				{
					
					arr[i][j]=val;
					val++;
					if(val>N-1)
						val=1;
				}
			}
			val=N+1;
			for(int i=1;i<N-1;i++)
			{
				if(val>=2*N-1)
					val=N;
				arr[N-1][i]=val;
				val=val+2;
			
			}
			val=N;
			for(int i=1;i<N;i++)
			{
				arr[i][0]=val;
				val++;
			}
			
			
			for(int i=2;i<N-1;i++)
			{
				val=arr[i][0]+1;;
				for(int j=1;j<i;j++)
				{
				   arr[i][j]=val;
				   val++;
				   if(val>=2*N-1)
					   val=N;
				}
			}
			
			
			
			System.out.println("Hooray");
			for(int i=0;i<N;i++)
			{
				for(int j=0;j<N;j++)
				{
					System.out.print(arr[i][j]+" ");
				}
			  System.out.println();
					
			}
			
		}
	   
				
	}
			
}
}
