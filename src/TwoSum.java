import java.util.ArrayList;
import java.util.HashSet;

public class TwoSum {
        public static void main(String[] args) {
        	String s= "bacdc";
        	longestPalindrome(s);
			
		}
         static String longestPalindrome(String s) {
        	  
        	 int n=s.length();
        	 
        	 
        	 int arr[][]=new int[n+1][n+1];
        	 
        	 String ans="";
        	 for(int i=0;i<=n;i++)
        	 {
        		 arr[0][i]=1;
        		 arr[1][i]=1;
        	 }
        	 
        	 for(int i=2;i<=n;i++) {
        		 for(int j=i;j<=n;j++) {
        			 if( s.charAt(j-1)==s.charAt(j-i) && arr[i-2][j-1]==1) {
        				 
        				 arr[i][j]=1;
        			 }
        		 }
        	 }
        	 int start=0,end=0;;
        	 
        	 for(int i=0;i<=n;i++) {
        		 for(int j=0;j<=n;j++)
        			 if(arr[i][j]==1) {
        				 start=j-i;
        				 end=j;
        			 }
        			 
        		 
        		
        	 }
			//return ans;
        	 ans=s.substring(start,end);
        	 System.out.println(ans);
        	 
        	 return ans;
            
        }
}


class Solution {
    public int lengthOfLongestSubstring(String s) {
    	int max=-1;
    	
    	String test="";
    	
    	for(char c:s.toCharArray()) {
    		String temp=String.valueOf(c);
    		if(test.contains(temp)) {
    			test=test.substring(test.indexOf(temp)+1);
    		}
    			test=test+temp;
    			
    		
    		max=Math.max(max, test.length());
    		
    	}
    	return max;
    	
    }
}