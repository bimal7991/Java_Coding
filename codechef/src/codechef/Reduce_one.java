package codechef;
import java.math.BigInteger;
import java.util.*;

public class Reduce_one {
  public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
  for(int i=0;i<t;i++)
  {
	int n=sc.nextInt();
	BigInteger b=factorial(n+1);
	BigInteger ans=b.mod(BigInteger.valueOf(1000000007));
	System.out.println(ans);
  }  
  
}
  static BigInteger factorial(int n)
  {
	  BigInteger mult=new BigInteger("1");
	  for(int i=2;i<=n;i++)
	  {
		  mult=mult.multiply(BigInteger.valueOf(i));
	  }
	  mult=mult.subtract(BigInteger.valueOf(1));
	return mult;
	  
  }
  
  
}

