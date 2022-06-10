import java.util.*;
public class AddString {

	public static void main(String[] args) {
	   String s1="abcz";
	   String s2="edfr";
	   String s=addString(s1,s2);
	   System.out.println(s);
	}

	private static String addString(String s1, String s2) {
		 
		String s="";
		int len=Math.min(s1.length(), s2.length());
		int i=0;
		for( i=0;i<len;i++) {
			s=s+s1.charAt(i);
			s=s+s2.charAt(i);
		}
		if(i==s1.length() && i!=s2.length()) {
			while(i<s2.length()) {
				s=s+s2.charAt(i);
				i++;
			}
		}
		else if(i==s2.length() && i!=s1.length()) {
			while(i<s1.length()) {
		   s=s+s1.charAt(i);
		   i++;
			}
		}
		
		return s;
		
		
		
		
	}
}
