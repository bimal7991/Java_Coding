package codechef;
import java.util.*;
public class XYSTR {
  public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	while(t-->0)
	{
		String str=sc.next();
		char ch=str.charAt(0);
	    int i=1;
	    int count=0;
	    while(i<str.length())
	    {
	    	if(str.charAt(i)!=ch)
	    	{
	    		count++;
	    		i++;
	    		if(i<str.length())
	    		  ch=str.charAt(i);
	    		i++;
	    	}
	    	else
	    	{
	    		ch=str.charAt(i);
	    		i++;
	    		
	    	}
	    	
	    }
	    System.out.println(count);
	}
}
}
