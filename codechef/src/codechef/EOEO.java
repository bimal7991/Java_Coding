package codechef;
import java.math.BigInteger;
import java.util.*;
public class EOEO {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0)
		{
			
			String str=sc.next();
			BigInteger n=new BigInteger(str);
			
			BigInteger f = new BigInteger("1");
			BigInteger divisor = new BigInteger("2"); 
			//long n=sc.nextLong();
			String s=n.toString(2);
			//System.out.println(s);
			
			int count=0;
			for(int i=s.length()-1;i>=0;i--)
			{
				if(s.charAt(i)=='1')
				{
					break;
				}
				count++;
			}
			
			BigInteger b1=divisor.pow(count+1);
			
			 BigInteger[] answers = n.divideAndRemainder(divisor); 
			if(answers[1].equals(f))
			{
				System.out.println(answers[0]);
			}
			else
			{
				System.out.println(n.divide(b1));
			}
			
			
			
		}
	}

}
