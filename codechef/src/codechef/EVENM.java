package codechef;
import java.util.*;
public class EVENM {
  public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int T=sc.nextInt();
	while(T-->0)
	{
		int n=sc.nextInt();
		int k=1;
		int even=1;
		
		for(int i=1;i<=n;i++)
		{
			if(i%2==1)
			{
				k=(i-1)*n+1;
			for(int j=1;j<=n;j++)
			{
				System.out.print(k+" ");
				k++;
			}
			}
			else
			{
				even=i*n;
				for(int j=1;j<=n;j++)
				{
					System.out.print(even+" ");
					even--;
				}
			}
			System.out.println();
			
		}
	}
}
}
