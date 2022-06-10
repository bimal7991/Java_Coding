package GraphOrTree;
import java.util.*;
public class SubstringWithoutRepeatingCharacter {
     public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int max=0;
		HashMap<Character, Integer> hm=new HashMap<Character, Integer>();
		int i=0;
		int j=0;
		int n=s.length();
		while(j<n) {
			
			char c=s.charAt(j);
			if(!hm.containsKey(c)) {
				hm.put(c, 1);
			}
			else {
				hm.put(c, hm.get(c)+1);
			}
			
			if(hm.size()==(j-i+1)) {
				 max=Math.max(max, j-i+1);
				 j++;
			}
			else if(hm.size()<(j-i+1)) {
				while(hm.size()<(j-i+1)) {
					char f=s.charAt(i);
					if(hm.containsKey(f))
					{
						hm.put(f, hm.get(f)-1);
						if(hm.get(f)==0)
							hm.remove(f);
					}
					i++;
						
				}
				j++;
			}
			
		}
		System.out.println(max);
	}
}
