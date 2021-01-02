package codechef;
import java.util.*;
public class MOTU001 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0)
		{
			long a=sc.nextLong(),b=sc.nextLong(),c=sc.nextLong();
			long mod=c%a;
			long div=c/a;
			long ans=0;
			if(mod>=b)
			{
				ans=div*a+b;
			}
			else
			{
				ans=a*(div-1)+b;
			}
			System.out.println(ans);
		}
				
				
	}

}
