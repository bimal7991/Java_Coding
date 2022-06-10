import java.util.*;

public class WordCount {
   public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	 int n=sc.nextInt();
	 String arr[]=new String[n];
	 for(int i=0;i<n;i++)
		 arr[i]=sc.next();
	 HashMap<String, Integer> hm=new HashMap<String, Integer>();
	 for(int i=0;i<n;i++) {
		 if(hm.containsKey(arr[i])) {
			 hm.put(arr[i], hm.get(arr[i])+1);
		 }
		 else {
			 hm.put(arr[i], 1);
		 }
	 }
	 int count=0;
	 for(Map.Entry<String, Integer> e:hm.entrySet()) {
		 if(e.getValue()==2) {
			 count++;
		 }
	 }
	 System.out.println(count);
	
}
}
