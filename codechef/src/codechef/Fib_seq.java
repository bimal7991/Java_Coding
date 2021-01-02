package codechef;
import java.util.*;
import java.math.*;
public class Fib_seq {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int T=0;T<t;T++)
		{
			BigInteger b1,re; 
			String s2=sc.next();
			b1=new BigInteger(s2);
			re=new BigInteger("60");
			int radix = 2; 

			// apply toString(radix) method public
			String b1String = b1.toString(radix);
			int l=b1String.length();
			char[] b3 = new char[l];
			Arrays.fill(b3, '0');
			b3[0]='1';
			//  System.out.println(b3);
			
			
			String b4=new String(b3);
			//System.out.println(b4);

			BigInteger b2= new BigInteger(b4, 2);

			
			BigInteger m=b2.mod(re);
			int n=m.intValue();
			//  int value=decToBinary(n)
			// long a=0,b=1,c=0;

			//System.out.println(fib[(int) (Math.pow(2, i-1)-1)]);
			//System.out.println(fib(limit-1));
			System.out.println(fib(n-1)%10);

		}

	}



	static long fib(int limit) { 
		double phi = (1 + Math.sqrt(5)) / 2; 
		return (long) Math.round(Math.pow(phi, limit)  
				/ Math.sqrt(5)); 
	} 
}
