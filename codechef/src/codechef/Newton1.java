package codechef;
import java.util.*;
public class Newton1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String input1=sc.next();
		String input2=sc.next();
		
		int sum=0;
		for(int i=0;i<input1.length();i++)
		{
			int flag=0;
			for(int j=0;j<input2.length();j++)
			{
				if(input1.charAt(i)==input2.charAt(j))
                      {
                    	  flag=1;
                    	  break;
                      }
			}
			if(flag==0)
			{
				sum=sum+input1.charAt(i);
			}
		}
		for(int i=0;i<input2.length();i++)
		{
			int flag=0;
			for(int j=0;j<input1.length();j++)
			{
				if(input2.charAt(i)==input1.charAt(j))
                      {
                    	  flag=1;
                    	  break;
                      }
			}
			if(flag==0)
			{
				sum=sum+input2.charAt(i);
			}
		}
		
		System.out.println(sum);
		
		/*
		 * Stack<Character> arr=new Stack<Character>(); arr.add(s.charAt(0)); for(int
		 * i=1;i<s.length();i++) {
		 * 
		 * if(arr.isEmpty()) arr.push(s.charAt(i)); else { char p=arr.peek();
		 * if(s.charAt(i)=='1' && p=='0') arr.pop(); else arr.push(s.charAt(i)); }
		 * 
		 * 
		 * }
		 */
		/*
		 * if(arr.size()==0) System.out.println(-1); else { for(char c:arr)
		 * System.out.print(c); }
		 */
	}

}
