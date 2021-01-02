package codechef;
import java.util.*;
public class Cozeva {
   public static void main(String[] args) {
	String s1="bimal";
	String s2="paul";
	int len1=s1.length();
	
	s1=s1+s2;
	s2=s1.substring(0,len1);
	s1=s1.substring(len1,s1.length());
	System.out.println(s2+" "+s1);
}
}
