import java.util.*;
public class Infinx2 {
  public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int T=sc.nextInt();
	while(T-->0) {
		int n=sc.nextInt(),k=sc.nextInt();
		long a=(long)Math.pow(2, k);
		
		long ans=1;
		for(int i=1;i<n;i++) {
			ans=(ans*a)%1000000007;
		}
		
		System.out.print(ans+" ");
		if(n%2==0)
		{
		for(int i=0;i<n-1;i++)
		{
		  System.out.print(a-1+" ");
		}
		System.out.println(0);
		}
		else {
			for(int i=0;i<n;i++)
			{
			  System.out.print(a-1+" ");
			}
			System.out.println();
		}
		
		
	}
}
}
