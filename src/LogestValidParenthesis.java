import java.util.*;
public class LogestValidParenthesis {
  public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 String s=sc.nextLine();
	 int ans=longestPare(s);
	 System.out.println(ans);
}

  
private static int longestPare(String s) {
	Stack<Integer> st=new Stack<Integer>();
	for(int i=0;i<s.length();i++) {
		if(s.charAt(i)=='(')
		{
			st.push(i+1);
		}
		else {
						
			if(!st.isEmpty() && s.charAt(st.peek()-1)=='(') {
				st.pop();
			}
			else {
				st.push(i+1);
			}
		}
			
	}
	System.out.println(st);
	int count=0;
	int n=s.length();
	int prev=n;
	if(st.size()==0)
		return n;	
	
	if(st.size()==1) {
		return Math.max(n-st.peek(), st.peek()-1);
	}
	
	count=n-st.peek();
	prev=st.pop();
	
	while(!st.isEmpty()) {
		int a=st.pop();
		count=Math.max(prev-a-1, count);
		prev=a;
		
	}
	count=Math.max(prev-1, count);
	return count;
}
}
