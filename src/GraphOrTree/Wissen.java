package GraphOrTree;
import java.util.*;
public class Wissen {
   public static void main(String[] args) {
	   int n=25462111;
	   int arr[]=new int[10];
	    
	   while(n>0) {
		   int dig=n%10;
		   arr[dig]++;
		   n=n/10;
	   }
	   
	   int count=0;
	   for(int i=0;i<10;i++) {
		   if(arr[i]>=1) {
			   count++;
		   }
	   }
	 
	   System.out.println(count);
  }
}


