import java.util.*;
public class MinwindowSubstr {
  public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s1=sc.next();
	String s2=sc.next();
	HashMap<Character, Integer> hm=new HashMap<Character, Integer>();
	for(int i=0;i<s2.length();i++) {
		char c=s2.charAt(i);
		if(hm.containsKey(c)) {
			hm.put(c, hm.get(c)+1);
		}
		else {
			hm.put(c, 1);
		}
	}
	int count=hm.size();
	
	
	int i=0,j=0;
	String ans="";
	int min=s1.length()+1;
	//System.out.println(hm);
	int flag=0;
	while(j<s1.length()) {
		char c=s1.charAt(j);
		if(hm.containsKey(c)) {
			hm.put(c, hm.get(c)-1);
			if(hm.get(c)==0) {
				count--;
			}
		}
		while(count==0) {
			if(j-i+1<min) {
				//System.out.println(i+" "+j);
				min=j-i+1;
				ans=s1.substring(i,j+1);
			}
			char c1=s1.charAt(i);
			if(hm.containsKey(c1)) {
				hm.put(c1, hm.get(c1)+1);
				if(hm.get(c1)>0) {
					count++;
				}
			}
			i++;
		}
		j++;
	}
	System.out.println(ans);
	
}
}
