package codechef;
import java.util.*;
public class Alice {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		int n=sc.nextInt();
		int arr[]=new int[n+2];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		arr[n]=0;
		arr[n+1]=0;
		int m=sc.nextInt();
		int arr1[]=new int[m];
		for(int i=0;i<m;i++)
		{
			arr1[i]=sc.nextInt();
		}
		for(int i=0;i<m;i++)
		{
			int count=0;
			for(int j=0;j<=n;j++)
			{
				if(arr[j]!=arr[j+1])
					count++;
				
				if(arr1[i]>=arr[j])
				{
					if(j==0)
					{
						System.out.println(1);
						break;
					}
					else if(j==n)
					{
						System.out.println(count+1);
						break;
					}
					else if(arr[j]==arr[j+1])
					{
						System.out.println(count+1);
						break;
					}
					
					else
						
					{
					System.out.println(count);
					break;
					}
				}
			}
		}
		
		
		
	}
}
