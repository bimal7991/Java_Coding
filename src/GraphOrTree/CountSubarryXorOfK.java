package GraphOrTree;
import java.util.*;
public class CountSubarryXorOfK {
   public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int [n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		
		int k=sc.nextInt();
		
		HashMap<Integer, Integer> hm=new HashMap<Integer, Integer>();
		int count=0;
		int xor=0;
		for(int i=0;i<n;i++) {
			xor=xor^arr[i];
			if(xor==k) {
				count++;
			}
			else {
				int y=xor^k;
				if(hm.containsKey(y)) {
					count=count+hm.get(y);
				}
				else {
				     if(hm.containsKey(xor)) {
				    	 hm.put(xor, hm.get(xor)+1);
				     }
				     else {
				    	 hm.put(xor, 1);
				     }
				}
			}
				
		}
		System.out.println(count);
	
 }
}
