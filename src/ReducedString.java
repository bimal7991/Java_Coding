import java.util.*;
public class ReducedString {
  public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  String s=sc.next();
	
	  Stack<Character> st=new Stack<Character>();
	  
	  st.push(s.charAt(0));
	  for(int i=1;i<s.length();i++) {
		  
		 if( st.size()>0 && st.peek()==s.charAt(i)) {
			 st.pop();
		 }
		 else {
			 st.push(s.charAt(i));
		 }
		  
	  }
	  if(st.size()==0)
		  System.out.println("Empty String");
	  for(int i=0;i<st.size();i++) {
		  System.out.print(st.get(i));
	  }
	  System.out.println();
	  
}
}
