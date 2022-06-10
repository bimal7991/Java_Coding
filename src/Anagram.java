import java.util.*;
public class Anagram {
  public static void main(String[] args) {
	String s="aababaababaa";
	String a="aaba";
	HashMap<Character, Integer> hm=new HashMap<Character, Integer>();
	
	
	for(int i=0;i<a.length();i++) {
		Character c=a.charAt(i);
		
		if(hm.containsKey(c)) {
			hm.put(c, hm.get(c)+1);
		}
		else {
			hm.put(c, 1);
		}
	}
	
	
	int count=hm.size();
	
	
	int i=0,j=0;
	int k=a.length();
	int ans=0;
	while(j<s.length()) {
		//System.out.println(hm);
		
		Character c=s.charAt(j);
		if(hm.containsKey(c)) {
			hm.put(c, hm.get(c)-1);
			if(hm.get(c)==0) {
				count--;
			}
		}else {}
		
		
		if(j-i+1<k) {
			j++;
		}
		
		else if(j-i+1==k) {
			
			System.out.println(hm);
			if(count==0) {
			   ans++;
			   
			   hm.put(s.charAt(i), hm.get(s.charAt(i))+1);
			   
			   count++;
			   //System.out.println(hm);
			}
			else {
				if(hm.get(s.charAt(i))==0) {
					count++;
				}
				 hm.put(s.charAt(i), hm.get(s.charAt(i))+1);
				
				
			}
			i++;
			
			j++;
		}
		
		
	}
	System.out.println(ans);
}
}
