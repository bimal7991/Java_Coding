package codechef;
import java.util.*;
public class XOR
{
	public static void main(String[] args) {
		

	Scanner sc = new Scanner(System.in);
	int T = sc.nextInt();

	for(int t=0;t<T;t++)
	{
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i=0;i<n;i++)
		{
			a[i] = sc.nextInt();
		}
		int count =0;
		for(int i=2;i<=n;i++)
		{
			for(int j=0;j<n-i+1;j++) 
			{
				
				for(int k=j+1;k<j+i;k++)
				{
					int xor1 = 0;
					int xor2 = 0;
					for(int l = j;l<=k;l++)
					{
						xor1 ^= a[l];
					}
					for(int l = k+1;l<j+i;l++)
					{
						xor2 ^= a[l];
					}
					System.out.println(xor1+" "+xor2);
					
					if(xor1 == xor2)
					{
						count ++;
					}
				}
			}
		}
		System.out.println(count);
		
		}
	}
}
