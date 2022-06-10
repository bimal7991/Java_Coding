import java.util.*;
public class LongetUnique {
  public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   String s=sc.next();
   int n=sc.nextInt();
   HashMap<Character, Integer> hm=new HashMap<Character, Integer>();
   int i=0,j=0;
   int max=0;
   while(j<s.length()) {
	   Character c=s.charAt(j);
	   if(hm.containsKey(c)) {
		   hm.put(c, hm.get(c)+1);
	   }
	   else {
		   hm.put(c, 1);
	   }
	   
	   if(hm.size()<n) {
		   j++;
	   }
	   else if(hm.size()==n) {
		   max=Math.max(max, (j-i+1));
		   j++;
	   }
	   else {
		   while(hm.size()>n) {
			   Character p=s.charAt(i);
			   if(hm.containsKey(p)) {
				   hm.put(p, hm.get(p)-1);
				   if(hm.get(p)==0) {
					   hm.remove(p);
				   }
			   }
			   i++;
		   }
		  j++;
	   }
   }
   
   System.out.println(max);
}
 
}
