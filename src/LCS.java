import java.util.*;
public class LCS {
  public static void main(String[] args) {
	String a="beutyst";
	String b="seutstgh";
	//System.out.println(lenLCS(a, b, a.length(), b.length()));
	int arr[][]=new int[a.length()+1][b.length()+1];	
	for(int i=1;i<a.length()+1;i++) { 
		for(int j=1;j<b.length()+1;j++) {
			
			if(a.charAt(i-1)==b.charAt(j-1)) {
			   arr[i][j]=1+arr[i-1][j-1];	
			}
			else {
				arr[i][j]=Math.max(arr[i-1][j], arr[i][j-1]);
			}
		}

	}
	StringBuffer s=new StringBuffer();
	int n=a.length(),m=b.length();
	while(n>0 && m>0) {
		if(a.charAt(n-1)==b.charAt(m-1)) {
			s=s.append(a.charAt(n-1));
			n--;
			m--;
		}
		
		else {
			if(arr[n][m-1]>arr[n-1][m]) {
				m--;
			}
			else {
				n--;
			}
		}
	}
	System.out.println(s.reverse());
	
	System.out.println(arr[a.length()][b.length()]);

  }
// recursive solution
 static int lenLCS(String a,String b,int n,int m) {
	 if(m==0 || n==0) {
		 return 0;
	 } 
	 if(a.charAt(n-1)==b.charAt(m-1)) {
		 return 1+lenLCS(a, b, n-1, m-1);
	 }
	 else {
		 return  Math.max(lenLCS(a, b, n-1, m),lenLCS(a, b, n, m-1));
	 }
 }
}
