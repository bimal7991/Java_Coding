package codechef;

import java.util.Scanner;

public class Code3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0)
		{
			int r=sc.nextInt()-1,c=sc.nextInt()-1;
			int x=sc.nextInt(), y=sc.nextInt();
			int rf=(c-y);
			int rb=y;

			int ans1=x+ Math.max(rf, rb);
			int ans2=r-x+ Math.max(rf, rb);
			System.out.println(Math.max(ans1, ans2));
			
			
		}
		}
}