package codechef;
import  java.util.*;
public class TWOSTRS {
	public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   int  T=sc.nextInt();
	   while(T-->0)
	   {
		   String A=sc.next();
		   String B=sc.next();
		  
		   int N=sc.nextInt();
		   String str[]=new String[N];
		   int min=999999;
		   HashMap<String, Integer> hash=new HashMap<String,Integer>();
		   for(int i=0;i<N;i++)
		   {
			   String key=sc.next();
			   str[i]=key;
			   if(key.length()<min)
				   min=key.length();
			   int val=sc.nextInt();
			   hash.put(key, val); 
		   }
		  // System.out.println(hash);
		   ArrayList<String> sub1=new ArrayList<String>();
		   ArrayList<String> sub2=new ArrayList<String>();
		   for (int i = 0; i < A.length(); i++)  
	           for (int j = i+1; j <= A.length(); j++) 
	           {
	                String s=A.substring(i, j); 
	                int flag=0;
	                for(int k=0;k<str.length;k++)
	                {
	                  if(str[k].startsWith(s))
	                  {
	                	  sub1.add(s);
	                	 
	                  }
	                }
	                
	               
	                	
	           }
		   
		   for (int i = 0; i < B.length(); i++)  
	           for (int j = i+1; j <= B.length(); j++) 
	           {
	                String s=B.substring(i, j); 
	                int flag=0;
	                for(int k=0;k<str.length;k++)
	                {
	                  if(str[k].endsWith(s) || s.endsWith(str[k]))
	                  {
	                	 flag=1;
	                	 break;
	                  }
	                }
	                if(flag==1 && !sub2.contains(s))
	                {
	                	sub2.add(s);
	                }
	               
	                	
	           }
		   
		     // System.out.println(sub1);
		      //System.out.println(sub2);
		   
		   long max=0;
		   long maxlen=0;
		   for(int i=0;i<sub1.size();i++)
		   {
			   for(int j=0;j<sub2.size();j++)
			   {
				   
				   String S=sub1.get(i).concat(sub2.get(j));
				   if(S.length()<min)
					  continue; 
				   
				   long sum=0;
				   for (int k = 0; k < S.length(); k++)  
			           for (int l = k+1; l <= S.length(); l++) 
			           {
			                String s=S.substring(k, l); 
			                if(hash.containsKey(s))
			                {
			                sum=sum+hash.get(s);
			                }
			               
			           }
				   if(sum>=max)
				   {
					   max=sum;
					   maxlen=S.length();
				   }
				   
				   
			   }
		   }
		   System.out.println(max);
		   
		   
	   }
	}

}
