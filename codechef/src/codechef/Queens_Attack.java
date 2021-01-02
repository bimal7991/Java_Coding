package codechef;
import java.util.*;
public class Queens_Attack {
 public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt(),k=sc.nextInt();
	int rq=sc.nextInt(),cq=sc.nextInt();
	int arr[][]=new int[n][n];

	for(int i=0;i<k;i++)
	{
	   arr[sc.nextInt()-1][sc.nextInt()-1]=1;
	}
	int count=0,i,j;
	for(i=rq;i<n && arr[i][cq-1]==0;i++)
	{
		if(arr[i][cq-1]==0)
			count++;
		else
			break;
		
	}
	//System.out.println(count);
	for(i=rq-2;i>=0 && arr[i][cq-1]==0;i--)
	{
		if(arr[i][cq-1]==0)
			count++;
		else
			break;
		
	}
	//System.out.println(count);
	for(i=cq-2;i>=0 && arr[rq-1][i]==0;i--)
	{
		if(arr[rq-1][i]==0)
			count++;
		else
			break;
		
	}
	//System.out.println(count);
	for(i=cq;i<n && arr[rq-1][i]==0;i++)
	{
		if(arr[rq-1][i]==0)
			count++;
		else
			break;
		
	}
//	System.out.println(count);
	for( i=rq, j=cq;i<n && j<n && arr[i][j]==0;i++,j++)
	{
		if(arr[i][j]==0)
			count++;
		else
			break;
	}
	//System.out.println(count);
	for( i=rq-2, j=cq-2;i>=0 && j>=0 && arr[i][j]==0;i--,j--)
	{
		if(arr[i][j]==0)
			count++;
		else
			break;
	}
	//System.out.println(count);
	for( i=rq, j=cq-2;i<n && j>=0 && arr[i][j]==0;i++,j--)
	{
		if(arr[i][j]==0)
			count++;
		else
			break;
	}
	//System.out.println(count);
	for( i=rq-2, j=cq;i>=0 && j<n && arr[i][j]==0;i--,j++)
	{
		if(arr[i][j]==0)
			count++;
		else
			break;
	}
	
	System.out.println(count);
	
	
}
 
 
}
