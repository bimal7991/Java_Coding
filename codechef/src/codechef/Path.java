package codechef;
import java.util.*;
public class Path {
 public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int T=sc.nextInt();
	while(T-->0)
	{
		int N=sc.nextInt();
		
		int arr[][]=new int[N][N];
		int x=0,y=0;
		for(int row=0;row<N;row++)
		{
			for(int col=0;col<N;col++)
			{
				arr[row][col]=sc.nextInt();
			    if(arr[row][col]==1)
			    {
			    	x=row;
			    	y=col;
			    }
			}
		}
		int c=Dfs(arr,x,y);
		
		System.out.println(c);
			
		//System.out.println(count);
		
		
	}
 }

 
 static int Dfs(int[][] arr, int row, int col) {
	// TODO Auto-generated method stub
	if(row<0 ||row>=arr.length || col<0 || col>=arr[0].length || arr[row][col]==0)
		return 0;	
	if(arr[row][col]==2)
		return 1;
	arr[row][col]=0;
  	if( Dfs(arr, row+1, col) || Dfs(arr, row-1, col) || Dfs(arr, row, col+1) || Dfs(arr, row, col-1))	
  	{
  		return 1;
  	}
  
  
  
  
}
}
