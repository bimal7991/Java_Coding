package codechef;
import java.util.*;
public class Algorithm {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int t=sc.nextInt();
		for(int T=0;T<t;T++)
		{
			String s=sc.next();
			if(s.length()==1)
			{
				System.out.println("NO");
				continue;
			}
			int nlen=calc(s);
			if(nlen<s.length())
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
	public static int calc(String str) 
    { 
		String encoding = "";
		int count;

		for (int i = 0; i < str.length(); i++)
		{
			// count occurrences of character at index i
			count = 1;
			while (i + 1 < str.length() && str.charAt(i) == str.charAt(i+1))
			{
				count++;
				i++;
			}

			// append current character and its count to the result
			encoding += String.valueOf(count) + str.charAt(i);
		}

		//System.out.println(encoding);
        return (encoding.length());
    } 

}

