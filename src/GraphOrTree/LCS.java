package GraphOrTree;
import java.util.*;
public class LCS {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int d=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();  //2 3 4 2 3 6 8 4 
		}
		
		int count=0;
		for(int i=d;i<n;i++) {
			ArrayList<Integer> t=new ArrayList<>(); 
			for(int j=i-1;j>=i-d;j--) {
				t.add(arr[j]);
			}
			Collections.sort(t);
			
			//System.out.println(t.size());
			int a=t.get(t.size()/2);
			if(arr[i]>=a)
				count++;
			
		}
		
		System.out.println(count);
	}
	
}
