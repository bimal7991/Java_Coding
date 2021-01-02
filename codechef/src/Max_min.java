import java.math.BigInteger;
import java.util.*;
public class Max_min {
   public static void main(String[] args) {
	  
	Scanner sc=new Scanner(System.in);
	int t,i;
	t=sc.nextInt();
	for(i=0;i<t;i++)
	{
	   int n=sc.nextInt();
	    
	   //int div=k/n;
	    
	   double k=sc.nextDouble();
       int rem=(int) (k%(double)n);
      
       if(n%2==0)
       {
    	   if(n/2>rem)
    	   {
    		   System.out.println(2*rem);
    		  
    	   }
    	   else if(n/2==rem)
    	   {
    		   System.out.println(2*rem-1);
    		   
    	   }
    	   else
    	   {
    		   System.out.println((2*(n-rem)));
    		   
    	   }
       }
       else
       {
    	  if((n+1)/2>rem)
    		  System.out.println(2*rem);    		  
    	  else
    		  System.out.println(2*(n-rem));
    		  
       }
       
    	   
	   
	}

   
   
}
}
