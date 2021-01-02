package codechef;
import java.util.*;
public class MULTHREE {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		
		while(T-->0)
		{
			long k=sc.nextLong();
			int  d0=sc.nextInt();
			int  d1=sc.nextInt();
			int arr[]=new int[21];
			arr[1]=d0;
			arr[2]=d1;
			
		
			
			String s="";
			s=s+d0;
			s=s+d1;
			int sum=(d0%10+d1%10)%10;
			
			if(sum==5 || sum==0)
			{
                  int a=d0+d1+sum;
                  if(a%3==0)
                	  System.out.println("YES");
                  else
                	  System.out.println("NO");
                  continue;
                	  
			}
			
			for(int i=3;i<=20;i++)
			{
				arr[i]=sum;
			    s=s+arr[i];
				sum=(sum+arr[i])%10;
				
				
			}
			if(k>20)
			{
			//System.out.println(s);
			int ind=s.indexOf("4862");
			//System.out.println(ind);
			
			
			
			long val=k-ind;
			long div4=val/4;
			
			long rem4=val%4;
			long div3=div4%3;
			
			long ans=div3*20 + (rem4==1?4:0) + (rem4==2 ? 12:0)+(rem4==3?18:0);
			
			
			for(int i=1;i<=ind;i++)
				ans=ans+arr[i];
			
		
			
			if(ans%3==0)
				System.out.println("YES");
			else
				System.out.println("NO");
			
			}
			
			else
			{
				int ans=0;
				for(int i=1;i<=k;i++)
					ans=ans+arr[i];
				if(ans%3==0)
					System.out.println("YES");
				else
					System.out.println("NO");
			}
			  
			
		
			
			
			
			
			
			
			
	}

}
}
