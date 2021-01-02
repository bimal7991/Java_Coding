package codechef;
import java.util.*;
public class BRKBKS {
  public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int T=sc.nextInt();
	for(int t=0;t<T;t++)
	{
		int s=sc.nextInt();
		int w1=sc.nextInt(),w2=sc.nextInt(),w3=sc.nextInt();
		int sum=w1+w2+w3;
		if(s==1)
		{
			System.out.println(3);
			
		}
		else if(s==2)
		{
			if(w1+w2==2 || w2+w3==2)
			{
				System.out.println(2);
			}
			else
				System.out.println(3);
		}
		else if(s==3)
		{
			if(sum==3)
				System.out.println(1);
			else if(sum==6)
				System.out.println(3);
			else
				System.out.println(2);
		}
		else if(s==4)
		{
			if(sum<=4)
				System.out.println(1);
			else
				System.out.println(2);
		}
		else if(s==5)
		{
			if(sum<=5)
				System.out.println(1);
			else
				System.out.println(2);
				
		}
		else
			System.out.println(1);	
		
		
	}
}
}
