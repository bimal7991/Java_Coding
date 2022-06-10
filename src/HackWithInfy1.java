

import java.util.*;
public class HackWithInfy1 {
   public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int p=sc.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<n;i++) {
		arr[i]=sc.nextInt();
		
	}
	HashMap<Integer, Integer> hm=new HashMap<Integer, Integer>();
	
	for(int i=0;i<n;i++) {
		int a=sc.nextInt();
		hm.put(arr[i], a);
	}
	
	TreeMap<Integer, Integer> sort=new TreeMap<Integer, Integer>(hm);
	
	int count=0;
	for(Map.Entry<Integer, Integer> m:sort.entrySet()) {
		System.out.println("Key "+ m.getKey()+ " Value "+m.getValue());
	   	if(p>=m.getKey()) {
	   		p=p+m.getValue();
	   		count++;
	   	}
	}
	System.out.println(count);
	   
  }  
}
