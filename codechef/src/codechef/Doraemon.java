package codechef;
import java.util.*;
public class Doraemon {
 public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int T=sc.nextInt();
	for(int t=0;t<T;t++)
	{
		int n=sc.nextInt(),m=sc.nextInt();
		int arr[][]=new int[n][m];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		long count=0;
		for(int i=1;i<n-1;i++)
		{
			for(int j=1;j<m-1;j++)
			{
			   for(int k=j-1,l=j+1,p=i-1,q=i+1;k>=0 && p>=0 && l<m && q<n;k--,l++,p--,q++)
			   {
				   //System.out.print(k+" "+l+" "+p+" "+q);
				   if(arr[i][k]==arr[i][l] && arr[p][j]==arr[q][j] )
				   {
					   count++;
				   }
				   else
					   break;
			   }	
			}
			System.out.println(count);
		}
		
		System.out.println(count+(long)(n*m));
		
		
	}
}
}
