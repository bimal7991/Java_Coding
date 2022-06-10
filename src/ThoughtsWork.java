import java.util.*;
public class ThoughtsWork {
     public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String words[]=s.split(";;;");
		int count=0;
		for(String word:words) {
			int sum=0;
			String numb[]=word.split(",");
			for(int i=0;i<numb.length;i++) {
				sum=sum+Integer.valueOf(numb[i]);		
			}
			int root=digitsum(sum);
			System.out.println(sum);
			if(root%2==1) 
				count++;
		}
		System.out.println(count);
	}
	private static int digitsum(int sum) {
		int n=sum;	
		while(n>=10) {		
			int digsum=0;
			sum=n;
			while(sum>0) {
				int dig=sum%10;
				digsum=digsum+dig;
				sum=sum/10;
			}
			n=digsum;
		}
		return n;
	}
     
}
