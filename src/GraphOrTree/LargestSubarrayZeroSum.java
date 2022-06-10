package GraphOrTree;
import java.util.*;
public class LargestSubarrayZeroSum {
   public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int arr[]=new int [n];
	for(int i=0;i<n;i++)
		arr[i]=sc.nextInt();
	
	HashMap<Integer, Integer> hm=new HashMap<Integer, Integer>();
	int sum=0;
	int max=0;
	
	for(int i=0;i<n;i++) {
		sum=sum+arr[i];
		if(sum!=0) {
		if(!hm.containsKey(sum)) {
			hm.put(sum, i);
		 }
		else {
			 int ind=hm.get(sum);
			 int current=i-ind;
			 max=Math.max(max, current);
			 
		 }
		}
		else {
			 max=Math.max(max, i+1);
		}
		
	}
	System.out.println(hm);
	System.out.println(max);
	
	
}
}
