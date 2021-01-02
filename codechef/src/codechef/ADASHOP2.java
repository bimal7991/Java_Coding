package codechef;
import java.util.*;
public class ADASHOP2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0)
		{
			int r=sc.nextInt(),c=sc.nextInt();
			int row[]=new int[]{1,2,1,3,4,3,2,1,5,6,5,4,3,2,1,7,8,6,5,4,3,2,7,8,6,5,4,7,8,6,7,8};
			int col[]=new int[]{1,2,3,1,2,3,4,5,1,2,3,4,5,6,7,1,2,4,5,6,7,8,3,4,6,7,8,5,6,8,7,8};
			if(r==1 && c==1)
			{
				System.out.println(31);
			for(int i=1;i<32;i++)
			{
				System.out.println(row[i]+" "+col[i]);
			}
			}
			else
			{
				int ind=0;
				for(int i=0;i<32;i++)
				{
					if(row[i]==r && col[i]==c)
					{
						ind=i;
						break;
					}
				}
				System.out.println(31);
				for(int i=ind+1;i<32;i++)
				{
					System.out.println(row[i]+" "+col[i]);
				}
				for(int i=0;i<ind;i++)
				{
					System.out.println(row[i]+" "+col[i]);	
				}
				
			}
			
			
		}
	}

}
