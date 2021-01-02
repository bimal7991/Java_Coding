package codechef;
import java.util.*;
public class STRANGE {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0)
		{
		  long X=sc.nextLong();
		  long K=sc.nextLong();
		  if(K==1)
		  {   if(X>=2)
			  System.out.println(1);
		     else
		     {
		    	 System.out.println(0);
		     }
		  }
		  else
		  {
			  long p=primeFactors(X);
			  if(p>=K)
				  System.out.println(1);
			  else
				  System.out.println(0);
		  }
		  
		  
		}
	}
	public static long primeFactors(long n) 
    { 
		long count=0;
        // Print the number of 2s that divide n 
        while (n%2==0) 
        { 
            //System.out.print(2 + " "); 
            count++;
            n /= 2; 
        } 
  
        // n must be odd at this point.  So we can 
        // skip one element (Note i = i +2) 
        for (int i = 3; i <= Math.sqrt(n); i+= 2) 
        { 
            // While i divides n, print i and divide n 
            while (n%i == 0) 
            { 
               // System.out.print(i + " "); 
            	count++;
                n /= i; 
            } 
        } 
  
        // This condition is to handle the case whien 
        // n is a prime number greater than 2 
        if (n > 2) 
        {
        	count++;
        	// System.out.print(n); 
        	 
        }
        return count;
           
    } 

}
