package codechef;
import java.util.*;
	
public class FUNRUN {
	
  public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int T=sc.nextInt();
	while(T-->0)
	{
		int A=sc.nextInt();
		int B=sc.nextInt();
		int lenB=Integer.toBinaryString(B).length();
		int lenA=Integer.toBinaryString(A).length();
		
		
		
		//System.out.println(len);
	    int max=0;
	    int op=0;
	    for(int i=1;i<Math.max(lenA, lenB);i++)
	    {
	    	
	       int b=circularRightShift(B, i,lenA,lenB);
	     // System.out.println(b);
	       int val=A^b;
	       if(val>max)
	       {
	    	   max=val;
	    	   op=i;
	       }
	       
	    }
		System.out.println(op+" "+max);
	    
	}	
}
  public static int circularRightShift(int input, int n,int lenA,int lenB) {
	      String s=Integer.toBinaryString(input);
	      
	      
	      
	      char arr1[]=s.toCharArray();
	     
	      char brr[];
	      if(lenB<lenA)
	      {
	    	  char arr2[]=new char[arr1.length+(lenA-lenB)];  
	    	  for(int i=0;i<(lenA-lenB);i++)
	    	  {
	    		  arr2[i]='0';
	    	  }
	    	  for(int i=(lenA-lenB);i<arr2.length;i++)
	    	  {
	    		  arr2[i]=arr1[i-(lenA-lenB)];
	    	  }
	    	  brr=arr2.clone();
	      }
	      else
	      {
	    	  brr=arr1.clone();
	      }
	      char arr[]=new char[brr.length];
	      
	      for(int i=0;i<n;i++)
	      {
	    	  arr[i]=brr[arr.length-n+i];
	    	 
	      }
	     
	      for(int i=n;i<arr.length;i++)
	      {
	    	  arr[i]=brr[i-n];
	    	 
	      }
//	      for(int i=0;i<arr.length;i++)
//	      {
//	    	  System.out.print(arr[i]+" ");
//	      }
	      
	      String str=String.valueOf(arr);
	      int r=Integer.parseInt(str,2);
	      
	      return r;
	}
  
}
