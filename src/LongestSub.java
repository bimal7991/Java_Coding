import java.util.*;
public class LongestSub {
  public static void main(String[] args) {
	Scanner  sc=new Scanner(System.in);
	
	
		String s=sc.next();
		int k=sc.nextInt();
		int i=0,j=0;
		int count=0;
		int max=0;
		int sub[]=new int[26];
		HashMap<Character, Integer> hm=new HashMap<Character, Integer>();
		HashMap<Character, Integer> freq=new HashMap<Character, Integer>();
		for(int l=0;l<s.length();l++) {
			char c=s.charAt(l);
			if(freq.containsKey(c)) {
				freq.put(c, freq.get(c)+1);
				
			}
			else {
				freq.put(c, 1);
			}
		}
		
		//System.out.println(freq);
		while(j<s.length()) {
			char c=s.charAt(j);
			if(hm.containsKey(c)) {
				hm.put(c, hm.get(c)+1);
				if(hm.get(c)==k) {
					count++;
				}
				
			}
			else {
				if(freq.get(c)>=k)
				hm.put(c, 1);
			}
			
			if(freq.get(c)<k) {
				
			while(count==hm.size() && count!=0 || count>=1 ) {
				//System.out.println(i+" "+j);
				if(count==hm.size())
				max=Math.max(max, j-i);
				
				
				char c1=s.charAt(i);
				if(hm.containsKey(c1)) {
					
				  hm.put(c1, hm.get(c1)-1);
				  
				  if(hm.get(c1)+1==k) {
					  if(sub[c1-'a']==0)
						  count--;
					  sub[c1-'a']++;  
				  }
				  if(hm.get(c1)==0)
					  hm.remove(c1);
			   }
				
				i++;
			
			}
			for(int p=0;p<26;p++) {
				sub[p]=0;
			}
			
			i++;
			}
			else {
				
				if(count==hm.size()) {
					System.out.println(i+" "+j);
					max=Math.max(max, j-i+1);
				}
			}
			
			j++;
			
		}
		
		System.out.println(max);
	}
}

