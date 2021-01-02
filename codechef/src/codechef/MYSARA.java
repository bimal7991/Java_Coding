package codechef;
import java.util.*;
public class MYSARA {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0)
		{
			int N=sc.nextInt();
			int arr[]=new int[N];
			for(int i=0;i<N;i++)
			{
				arr[i]=sc.nextInt();
			}
			int flag=0;
			for(int i=1;i<N;i++)
			{
			   if(arr[i-1]!=(arr[i] & arr[i-1]))
			   {
				   flag=1;
				   break;
			   }
			}
			if(flag==1)
				System.out.println(0);
			else
			{
				long count=0;
				for(int i=0;i<N-1;i++)
				{
					count=count+count_set_bits(arr[i]);
				}
				int ans=1;
				for(int i=0;i<count;i++)
				{
					ans=(ans*2)%1000000007;
				}
				System.out.println(ans);
			}
			
		}
	}

	static int set_bits[]=new int[] {0,1,1,2,1,2,2,3,1,2,2,3,2,3,3,4};
	
	private static int count_set_bits(int num) {
		   
		int nibble=0;
		if(num==0)
			return set_bits[0];
		
		nibble=num & 0xf;
		// TODO Auto-generated method stub
		return set_bits[nibble]+count_set_bits(num>>4);
	}

}
