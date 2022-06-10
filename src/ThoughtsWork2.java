import java.util.*;
public class ThoughtsWork2 {
  public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String st=sc.next();
    String word[]=st.split(",");
	
    String s=word[0];
	String sp=word[1];
	int count=0;
	int sum=0;
	for(int i=0;i<s.length();i++) {
		if(s.charAt(i)!=sp.charAt(0)) {
			count++;
		}
		else {
			sum=sum+(count*(count+1)/2);
			count=0;
		}
	}
	if(count>0) {
		sum=sum+(count*(count+1)/2);
	}
	System.out.println(sum);
}
}
