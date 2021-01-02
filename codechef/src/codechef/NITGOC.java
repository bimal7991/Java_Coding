package codechef;

import java.util.Scanner;

public class NITGOC {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0)
		{
			long a=sc.nextLong(),b=sc.nextLong();
			long max=Math.max(a, b);
			long min=Math.min(a, b);
			if(min+1==max)
			{
				System.out.println("YES");
			}
			else
			{
				if((max-1)%(min-1)==0)
					System.out.println("YES");
				else
					System.out.println("NO");
			}
			
			
			
		}
	}
	 
}
