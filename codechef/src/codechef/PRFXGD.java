package codechef;
import java.util.*;
public class PRFXGD {
  public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int T=sc.nextInt();
   while(T-->0)
   {
	   String str=sc.next();
	   sc.nextLine();
	   int k=sc.nextInt(),x=sc.nextInt();
	   int arr[]=new int[26];
	   
	   int i=0,count=0;
	   for( i=0;i<str.length() ;i++)
	   {
		   int ch=str.charAt(i)-'a';
		   
		   if(arr[ch]==x)
		   {
			   if(k==0)
				   break;
			   else
				   k--;
		   }
		   else
		   {
			   arr[ch]++;
			   count++;
		   }
		   
	   } 
	    System.out.println(count);
	   
   }
}
}
