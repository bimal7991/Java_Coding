package codechef;
import java.util.*;
public class BREAK {
  public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    int T=sc.nextInt(),S=sc.nextInt();
    while(T-->0)
    {
    	int N=sc.nextInt();
    	long chef[]=new long[N];
    	long frd[]=new long[N];
    	for(int i=0;i<N;i++)
    		chef[i]=sc.nextLong();
    	for(int i=0;i<N;i++)
    		frd[i]=sc.nextLong();
    	
    	Arrays.sort(chef);
    	Arrays.sort(frd);
    	ArrayList<Long> tab=new ArrayList<Long>();
    	
    	if(S==1)
    	{
    	
    	int flag=0;
    	for(int i=0;i<N;i++)
    	{
    		
    		if(i==0)
    		{
    		if(frd[i]<=chef[i])
    		{
    			flag=1;
    			break;
    		}
    		else
    		{
    			if(!tab.contains(chef[i]))
    			tab.add(chef[i]);
    			if(!tab.contains(frd[i]))
        		tab.add(frd[i]);
    			
    			
    		}
    		}
    		else
    		{
    			if(frd[i]<=chef[i] || (!tab.contains(chef[i])))
        		{
        			flag=1;
        			break;
        		}
    			else
        		{
        			if(!tab.contains(chef[i]))
        			tab.add(chef[i]);
        			if(!tab.contains(frd[i]))
            		tab.add(frd[i]);
        		}
    		}
    		
    		
    			
    	}
    	//System.out.println(tab);
    	
    	
  
    	if(flag==0)
    		System.out.println("YES");
    	else
    		System.out.println("NO");
    	}
    	
    	//s==2
    	else
    	{
    		int flag=0,count=0;
    		for(int i=0;i<N;i++)
    		{
    			if(frd[i]==chef[i])
        		{
        			//flag=1;
        			count++;
        		}
    		}
    		
        	//System.out.println(tab);
        	if(count==N)
        		System.out.println("NO");
        	else
        		System.out.println("YES");
    		
    		
    	}
    }
}
  
}
