import java.util.*;
public class Thoughts {
  public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	 String s=sc.next();
	 
	 boolean b=check(s);
	 
	 if(b) {
		 System.out.println("Valid");
	 }
	 else {
		 System.out.println("Invalid");
	 }
}
private static boolean check(String s) {
	 boolean up=false,low=false,dig=false,sp=false;
	  if(s.length()<8) {
		  return false;
	  }
	  
	  for(int i=0;i<s.length();i++) {
		  if(s.charAt(i)>='A' && s.charAt(i)<='Z') {
			  up=true;
		  }
		  else if(s.charAt(i)>='a' && s.charAt(i)<='z') {
			  low=true;
		  }
		  else if(s.charAt(i)>='0' && s.charAt(i)<='9') {
			  dig=true;
		  }
		  else {
			  sp=true;
		  }
	  }
	  if(up && low && dig && sp) {
		  return true;
	  }
	  else {
		  return false;
	  }
}
}
