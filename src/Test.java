import java.util.*;
public class Test {
   public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 int T=sc.nextInt();
	 while(T-->0) {
		 int n=sc.nextInt();
		 String s=sc.next();
		 int count=0;
		 for(int i=0;i<s.length();i++) {
			 for(int j=i+1;j<=s.length();j++) {
				 String sub=s.substring(i,j);
				 if(find(sub)) {
					 count++;
				 }
			 }
		 }
		 System.out.println(count);
	 }
}
private static boolean find(String sub) {
	// TODO Auto-generated method stub
	int arr[]=new int[26];
	for(int i=0;i<sub.length();i++) {
		arr[sub.charAt(i)-'a']++;
	}
	int flag=0;
	for(int i=0;i<26;i++) {
		if(arr[i]%2==1)
		{
			flag=1;
			break;
		}
	}
	if(flag==0)
		return true;
	else
	return false;
}
}
