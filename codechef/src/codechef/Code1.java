package codechef;
import java.util.*;
public class Code1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0)
		{
			int n=sc.nextInt();
			sc.nextLine();
			String Str=sc.next();
			int x=0,y=0;
			for(int i=0;i<n;i++)
			{
				if(Str.charAt(i)=='L')
				{
					x--;
				}
				else if(Str.charAt(i)=='R')
				{
					x++;
				}
				else if(Str.charAt(i)=='U')
				{
					y++;
				}
				else
				{
					y--;
				}
				
				
				if(i>=1)
				{
				if(Str.charAt(i)=='L' && ((Str.charAt(i-1)=='L')||(Str.charAt(i-1)=='R')))
				{
				    x++;;	
				}
				else if(Str.charAt(i)=='R' && ((Str.charAt(i-1)=='L')||(Str.charAt(i-1)=='R')))
				{
					x--;
				}
				else if(Str.charAt(i)=='U' && ((Str.charAt(i-1)=='U')||(Str.charAt(i-1)=='D')))
				{
					y--;
				}
				else if(Str.charAt(i)=='D' && ((Str.charAt(i-1)=='U')||(Str.charAt(i-1)=='D')))
				{
					y++;
				}
				
				}
			}
			System.out.println(x+" "+y);
		}
	}

}
