package codechef;
import java.util.*;
public class Matrix_odd {
  public class NARM {

	}

public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	for(int i=0;i<t;i++)
	{
		int n=sc.nextInt(),m=sc.nextInt(),q=sc.nextInt();
		//int arr[][]=new int[n][m];
		int r[]=new int[n];
		int c[]=new int[m];
		for(int j=0;j<q;j++)
		{
			 r[sc.nextInt()-1]++;
			     
			 
			 c[sc.nextInt()-1]++;         
		
		}
		int oddc=0,evenc=0;
		for(int k=0;k<m;k++)
		{
			
			if(c[k]%2!=0)
			oddc++;
			else
				evenc++;
		}
		
		long count=0;
		for(int j=0;j<n;j++)
		{
			if(r[j]%2==0)
			count=count+oddc;
			else
				count=count+evenc;		
					
		}
		
		
		System.out.println(count);
		
	}
}
}