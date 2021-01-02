package codechef;
import java.util.*;

public class MATBREAK {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0)
		{
			int N=sc.nextInt();
			int arr[][]=new int[N][N];
			for(int i=0;i<N;i++)
			{
				for(int j=0;j<N;j++)
				{
					arr[i][j]=sc.nextInt();
				}
			}
			int safe=0;
			for(int i=0;i<N;i++)
			{
				for(int j=0;j<N-1;j++)
				{
					if(arr[i][j]==arr[i][j+1] && arr[i][j]==1)
					{
						safe=1;
						break;
					}
				}
				if(safe==1)
					break;
			}
			if(safe==0)
			for(int i=0;i<N;i++)
			{
				for(int j=0;j<N-1;j++)
				{
					if(arr[j][i]==arr[j+1][i] && arr[j][i]==1)
					{
					 safe=1; 
					 break;
					}
				}
				if(safe==1)
					break;
			}
			
			if(safe==0)
			  System.out.println("SAFE");
			else
				System.out.println("UNSAFE");
			
			
			

		}
	}
}