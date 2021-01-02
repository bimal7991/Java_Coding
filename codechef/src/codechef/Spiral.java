package codechef;
import java.util.*;
public class Spiral {
     public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt(),n=sc.nextInt();
		int arr[][]=new int[m][n];
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		int k=0,l=0,i;
		while(k<m && l<n)
		{
			for(i=l;i<n;i++)
			{
				System.out.print(arr[k][i]+" ");
			}
			k++;
			for(i=k;i<m;i++)
			{
				System.out.print(arr[i][n-1]+" ");
			}
			n--;
			if(k<m)
			{
				for(i=n-1;i>=l;i--)
				{
					System.out.print(arr[m-1][i]+" ");
				}
				m--;
			}
			if(l<n)
			{
				for(i=m-1;i>=k;i--)
				{
					System.out.print(arr[i][l]+" ");
				}
				l++;
			}
		}
		
		
		
		
	}
}
