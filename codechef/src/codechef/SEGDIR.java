package codechef;
import java.util.*;
public class SEGDIR {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int T=0;T<t;t++)
		{
			int n=sc.nextInt();
			//int k=sc.nextInt();
			String str[]=new String[n];
			//String wr=sc.next();
			int arr[]=new int[n];
			int freq[]=new int[100000000];
			Arrays.fill(freq, -1);
			str[0]=sc.next();
			arr[0]=sc.nextInt();
			freq[getAscii(str[0])]=arr[0];
			int count=0;
			for(int i=1;i<n;i++)
			{
				str[i]=sc.next();
				arr[i]=sc.nextInt();
				if(freq[getAscii(str[i])]!=arr[i] && freq[getAscii(str[i])]!=2 && freq[getAscii(str[i])]!=-1) 
				{
					count++;
					freq[getAscii(str[i])]=2;
				}
				else {
					freq[getAscii(str[i])]=arr[i];
				}
					
				
			    
			}
			
			System.out.println(n-count);
		}
	}

	
	
	
	
	
	private static int getAscii(String string) {
		
		
		StringBuilder sb = new StringBuilder(); 
		char[] letters = string.toCharArray(); 
		for (int i=0;i<2;i++) 
		
		{ sb.append((byte) letters[i]); } 
		String s=sb.toString();
		//System.out.println(sb.toString());

		//javarevisited.blogspot.com/2015/07/how-to-convert-string-or-char-to-ascii-example.html#ixzz62iDw7ThG
		// TODO Auto-generated method stub
		
		
		return Integer.parseInt(s);
	}

}
