package codechef;
import java.util.*;
public class Gekks {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();

		for(int T=0;T<t;T++)
		{
			int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt(),d=sc.nextInt(),e=sc.nextInt(),f=sc.nextInt();
			int arr[]=new int[3];
			int arr2[]=new int[3];
			if(b-a>0)
			{
				arr[0]=1;
				
			}
			else if(a==b)
			{
				arr[0]=0;
			}
			else
				arr[0]=2;
			if(c-b>0)
			{
				arr[1]=1;
				
			}
			else if(c==b)
			{
				arr[1]=0;
			}
			else
				arr[1]=2;
			if(c-a>0)
			{
				arr[2]=1;
				
			}
			else if(c==a)
			{
				arr[2]=0;
			}
			else
				arr[2]=2;
			
			
			
			
			if(e-d>0)
			{
				arr2[0]=1;
				
			}
			else if(e==d)
			{
				arr2[0]=0;
			}
			else
				arr2[0]=2;
			
			if(f-e>0)
			{
				arr2[1]=1;
				
			}
			else if(e==d)
			{
				arr2[1]=0;
			}
			else
				arr2[1]=2;
			
			if(f-d>0)
			{
				arr2[2]=1;
				
			}
			else if(d==f)
			{
				arr2[2]=0;
			}
			else
				arr2[2]=2;
			
			if(Arrays.equals(arr, arr2))
				System.out.println("FAIR");
			else
				System.out.println("NOT FAIR");
			
           /* for(int i=0;i<2;i++)
            {
            	if(a[i]==a[i+1])
            	{
            		if(b[i]!=b[i+1])
            		{
            			flag=1;
            		   break;
            		}
            	}
            	else if(b[i]>b[i+1])
            	{
            		flag=1;
            		break;
            	}            		
            	
            }*/
           

		}
	}
	
}