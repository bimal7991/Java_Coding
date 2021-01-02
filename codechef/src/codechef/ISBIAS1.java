package codechef;
import java.util.*;
public class ISBIAS1 {
  public class Doraemon {

	}

public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
		int N=sc.nextInt(),Q=sc.nextInt();
		int arr[]=new int[N];
		for(int i=0;i<N;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		int arr1[]=new int[N];
		for(int i=0;i<N-1;i++)
		{
		  if(arr[i]<arr[i+1])
		  {
			arr1[i]=1;  
		  }
		  else if(arr[i]>arr[i+1])
		  {
			 arr1[i]=0; 
		  }
	   }
		for(int i=0;i<N;i++)
			System.out.print(arr1[i]+" ");
		System.out.println();
		int count1[]=new int[N];
		int count2[]=new int[N];
		int max=0,min=0;
		for(int i=0;i<N-2;i++)
		{
			if(i==0 && arr1[i]==1)
				{
				 count1[i]=1;
				 max=1;
				 continue;
				}
			else
			{
				
			}
			if(arr1[i]==0 && arr1[i+1]==1)
			{
				count1[i]=max;
				max++;
				count1[i+1]=max;
			}
			else
			{
				count1[i]=max;
			}
			
		}
		 if(count1[N-2]==0)
		  count1[N-2]=count1[N-3];
		
		for(int i=0;i<N-2;i++)
		{
			if(i==0 && arr1[1]==0)
			{
			 count2[1]=1;
			 min=1;
			 continue;
			}
			else
			{
				
			}
			if(arr1[i]==1 && arr1[i+1]==0)
			{
				count2[i]=min;
				min++;
				count2[i+1]=min;
			}
			else
			{
				count2[i]=min;
			}
			
		}
		 if(count2[N-2]==0)
			  count2[N-2]=count2[N-3];
		
		
		for(int i=0;i<N;i++)
			System.out.print(count1[i]+" ");
		System.out.println();
		for(int i=0;i<N;i++)
			System.out.print(count2[i]+" ");
		System.out.println();
		for(int q=0;q<Q;q++)
		 {
			int L=sc.nextInt(),R=sc.nextInt();
			int ans1=0,ans2=0;
			if(L==1)
			{
				ans1=count1[R-2];
				ans2=count2[R-2];
			}
			else
			{
				ans1=count1[R-2]-count1[L-2];
				ans2=count2[R-2]-count2[L-2];
				if(arr1[L-1]==arr1[L-2])
				{
					if(arr1[L-1]==1)
						ans1++;
					else
						ans2++;
				}
			}
			if(ans1==ans2)
				System.out.println("YES");
			else
				System.out.println("NO");
		 }
		
		  
 }
}
