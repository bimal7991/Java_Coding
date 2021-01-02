package codechef;
import java.math.BigInteger;
import java.util.*;
public class DYNAMO {
  public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int T=sc.nextInt();
	for(int t=0;t<T;t++)
	{
		int n=sc.nextInt();
	    sc.nextLine();
	    BigInteger val=new BigInteger("10");
		BigInteger A=new BigInteger(sc.next());
		BigInteger mi=new BigInteger("0");
		if(!A.equals(val.pow(n).subtract(new BigInteger("1") )))
		{
			mi=val.pow(n).subtract(new BigInteger("1")).subtract(A);
		}
		BigInteger S=val.pow(n).subtract(new BigInteger("1")).multiply(new BigInteger("3")).add(new BigInteger("2")).subtract(mi);
		System.out.println(S);
		System.out.flush();
		BigInteger B=new BigInteger(sc.next());
		BigInteger im=S.subtract(A).subtract(B);
		if(im.compareTo(val.pow(n))==1)
		{
			im=im.subtract(val.pow(n));
		}
		 System.out.println(im);
		 System.out.flush();
		 BigInteger D=new BigInteger(sc.next());
		 BigInteger E=val.pow(n).subtract(D);
		 System.out.println(E);
		 System.out.flush();
		 int a=sc.nextInt();
		/*
		 * 
		long A=sc.nextLong();
		long mi=0;
		if(A!=(long)(Math.pow(10, N)-1))
		{
			 mi=(long)(Math.pow(10, N)-1)-A;
		}
		
		long S=3*(long)(Math.pow(10, N)-1)+2-mi;
		System.out.println(S);
		System.out.flush();
	    long B=sc.nextLong();
	    long im=S-A-B;
	    if(im>(long)(Math.pow(10, N)))
	    {
	    	im=im-(long)(Math.pow(10, N));
	    	System.out.println(im);
	    }
	    
	    
	    System.out.flush();
	    long D=sc.nextLong();
	    
	    long E=(long)(Math.pow(10, N)-D);
	    System.out.println(E);
	    System.out.flush();
	    int a=sc.nextInt();*/
	    
	}
}
}
