package codechef;
import java.util.*;
public class CHEFSHIP {
  public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int T=sc.nextInt();
     while(T-->0)
     {
    	 String s=sc.next();
    	 int k=1;
    	 int count=0;
    	while(k!=s.length()/2)
    	{
    		if(s.substring(0,k).equals(s.substring(k,k+k)))
    		{
    			if(s.substring(k+k,k+k+(s.length()-2*k)/2).equals(s.substring(k+k+(s.length()-2*k)/2,s.length())))
                   {
                	   count++;
                   }
    		}
    		k++;
    	}
    	System.out.println(count);
     }
 }
}
