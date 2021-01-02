package codechef;

import java.util.*;
 class Pari_again
{
	public static void main(String[] args) {
		int t,i;
		Scanner sc=new Scanner(System.in);
		t=sc.nextInt();
		for(i=0;i<t;i++)
		{
		    int n=sc.nextInt();
		    int k=0,even=0,odd=0;
		    HashMap<Integer, Integer> map = new HashMap<Integer,Integer>(); 
		    for(int j=0;j<n;j++)
		    {
		        int b=sc.nextInt();
		        if(b>128)
		        b=b%128;
		         if(!(map.containsValue(b)))
		         {
		        map.put(k,b);
		        k++;
		        if(getParity(b))
		          odd++;
		        else
		          even++;
		         }
		        int siz=map.size();
		        if(map.size()>1)
		        {
		            for(int a=0;a<siz;a++){  
		                
		                  Integer p=(Integer)map.get(a);
                             if(p!=b)
                             {
                                int temp=p ^ b;
                                if(!(map.containsValue(temp)))
                                  {
                                      if(getParity(temp))
		                                 odd++;
		                               else
		                                   even++;
                                     map.put(k,temp);
                                       k++;
                                     
                                  }
                               
                                
                             }
                          }
		        }
		        
		        
		        System.out.println(even+" "+odd);
		        
		    }
		    
		}
	}
	static boolean getParity(int x) 
    { 
         int y = x ^ (x >> 1); 
        y = y ^ (y >> 2); 
        y = y ^ (y >> 4); 
        y = y ^ (y >> 8); 
        y = y ^ (y >> 16); 
        if ((y & 1) > 0) 
        return true; 
        return false; 
       
          
    } 
}