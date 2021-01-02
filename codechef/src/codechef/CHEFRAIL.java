package codechef;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;
 class CHEFRAIL {
  public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int T=sc.nextInt();
	 while(T-->0)
	 {
		 int N=sc.nextInt();
		 int M=sc.nextInt();
		 int X[]=new int[N];
		 int Y[]=new int[M];
		 
		 int pos=0,neg=0,x=0,y=0;
		 for(int i=0;i<N;i++)
		 {
			 X[i]=sc.nextInt();
			 if(X[i]<0)
			 {
				 neg++;
			 }
			 else if(X[i]>0)
			 {
				 pos++;
			 }
			 else
			 {
				 x=1;
			 }
			
		 }
		 int xpos[]=new int[pos];
		 int xneg[]=new int[neg];
		 int j=0,k=0;
		 for(int i=0;i<N;i++)
		 {
			if(X[i]<0)
			{
				xneg[j++]=X[i];
			}
			else if(X[i]>0)
			{
				xpos[k++]=X[i];
			}
			
		 }
		 
		 
		 pos=0;neg=0;
		 for(int i=0;i<M;i++)
		 {
			 Y[i]=sc.nextInt();
			 if(Y[i]<0)
			 {
				 neg++;
			 }
			 else if(Y[i]>0)
			 {
				 pos++;
			 }
			 else
				 y=1;
		 }
		 int ypos[]=new int[pos];
		 int yneg[]=new int[neg];
		  j=0;k=0;
		 for(int i=0;i<M;i++)
		 {
			if(Y[i]<0)
			{
				yneg[j++]=Y[i];
			}
			else if(Y[i]>0)
			{
				ypos[k++]=Y[i];
			}
		 }
		 long count=0;
		 ArrayList<Long> arr=new ArrayList<Long>();
		 int i=0;
		  for(j=0;j<ypos.length;j++)
			 { 
				 for(k=0;k<yneg.length;k++)
				 {
				   if(isPerfectSquare((long)ypos[j]*-yneg[k]))	 
					 arr.add((long)ypos[j]*-yneg[k]);
				 }
				 
		     }
		  
		  Arrays.sort(xpos);
		  Collections.sort(arr);
		  
		  for(i=0;i<xpos.length;i++)
		  {
			  for(j=0;j<arr.size();j++)
			  {
				  if((long)xpos[i]*xpos[i]==arr.get(j))
				  {
					  count++;
				  }
				  else if((long)xpos[i]*xpos[i]<arr.get(j))
				  {
					  break;
				  }
			  }
		  }
		  
		
		 if(x==1 || y==1)
		 {
			 count=count+(long)(xpos.length+xneg.length)*(ypos.length+yneg.length);
		 }
		 System.out.println(count);
		 
		 }
		 
	 
}

  static boolean isPerfectSquare(double x)  
  { 
        
      // Find floating point value of 
      // square root of x. 
      double sr = Math.sqrt(x); 
    
      // If square root is an integer 
      return ((sr - Math.floor(sr)) == 0);
    	 
  } 
 
}
