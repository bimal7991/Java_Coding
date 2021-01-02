package codechef;
import java.util.*;

public class LIFTME {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0)
		{
			int n=sc.nextInt(),q=sc.nextInt();
			int pos=0;
			
			long ans=0;
			while(q-->0)
			{
				int f=sc.nextInt(),d=sc.nextInt();
				
				ans=ans+Math.abs(f-pos);
				ans=ans+Math.abs(d-f);
				pos=d;
				
				
				
			}
			System.out.println(ans);
		}
	}

}
