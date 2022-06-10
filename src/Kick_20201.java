import java.io.IOException;
import java.util.*;
public class Kick_20201 {
   public static void main(String[] args) throws IOException {
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	int k=1;
	while(k<=t) {
		int n=sc.nextInt(),m=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		int sum=0,count=0;
		Arrays.sort(arr);
		int i=0;
		while(sum<m && i<n) {
			sum=sum+arr[i];
			i++;
			if(sum<=m)
			count++;
		}
		System.out.println("Case #"+k+": "+count);
		k++;
		
	}
}
}
