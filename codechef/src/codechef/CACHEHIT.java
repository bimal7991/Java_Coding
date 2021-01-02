package codechef;
import java.util.*;
public class CACHEHIT {
  public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	 int T=sc.nextInt();
	 while(T-->0)
	 {
		 int n=sc.nextInt(),b=sc.nextInt(),m=sc.nextInt();
		 
		 int blo=n%b==0?n/b:n/b+1;
		 
		 int arr[][]=new int[blo][2];
		 
		 int k=0;
		 for(int i=0;i<blo;i++)
		 {
			 arr[i][0]=k;
			 k=k+b-1;
			 arr[i][1]=k;
			 k++;
		 }
		 
		 int prev=-1;
		 int count=0;
		 for(int i=0;i<m;i++)
		 {
		     int x=sc.nextInt();
		     int ind=-1;
		     for(int j=0;j<blo;j++)
		     {
		    	 if(x>=arr[j][0] && x<=arr[j][1])
		    	 {
		    		 ind=j;
		    		 break;
		    	 }
		     }
		     if(prev!=ind)
		    	 count++;
		     prev=ind;
		 }
		 System.out.println(count);
		 
	 }

}
}
