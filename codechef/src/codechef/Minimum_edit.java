package codechef;
import java.util.*;
public class Minimum_edit {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,t=sc.nextInt();
		for(i=0;i<t;i++)
		{
			int n=sc.nextInt(),m=sc.nextInt();
			String s1=sc.next();
			String s2=sc.next();
			int ans=edit(s1,s2,n,m);
			System.out.println(ans);
		}
		
	}

	static int edit(String s1, String s2, int n, int m) {
		// TODO Auto-generated method stub
		int arr[][]=new int[n+1][m+1];
		for(int i=0;i<n+1;i++)
		{
			arr[i][0]=i;
		}
		for(int i=0;i<m+1;i++)
		{
			arr[0][i]=i;
		}
		for(int i=1;i<n+1;i++)
		{
			for(int j=1;j<m+1;j++)
			{
				if(s1.charAt(i-1)==s2.charAt(j-1))
				{
					arr[i][j]=arr[i-1][j-1];
				}
				else
				{
					arr[i][j]=min(arr[i-1][j],arr[i-1][j-1],arr[i][j-1])+1;
				}
			}
			
		}
		
		return arr[n][m];
	}

	static int min(int i, int j, int k) {
		// TODO Auto-generated method stub
		int a=Math.min(i, j);
		
		return Math.min(a, k);
	}
}
