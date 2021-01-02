package codechef;
import java.util.*;
public class SNUG_FIT {
 public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 int T=sc.nextInt();
	 while(T-->0)
	 {
		 int N=sc.nextInt();
		 int A[]=new int[N];
		 int B[]=new int[N];
		 for(int i=0;i<N;i++)
		 {
			 A[i]=sc.nextInt();
		 }
		 for(int i=0;i<N;i++)
		 {
			 B[i]=sc.nextInt();
		 }
		 Arrays.sort(A);
		 Arrays.sort(B);
		 long sum=0;
		 for(int i=0;i<N;i++)
		 {
			 sum=sum+Math.min(A[i], B[i]);
		 }
		 System.out.println(sum);
	 }
}
}
