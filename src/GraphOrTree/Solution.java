package GraphOrTree;

import java.util.*;
public class Solution {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
//		int arr[]=new int[n];
//		for(int i=0;i<n;i++) {
//			arr[i]=sc.nextInt();
//		}
//		int x=sc.nextInt();
		int ans=solution(s);
		System.out.println(ans);
	}

	private static int solution(String S) {
		int n = S.length();
        int i = 0 , j = 1;
        int[] lps = new int[n];
        lps[0] = 0;
        while(j < n){
            if(S.charAt(i) == S.charAt(j)){
                lps[j] = i + 1;
                j++;
                i++;
            }else{
                if(i == 0){
                    lps[j] = 0;
                    j++;
                }else{
                    i = lps[i - 1];
                }
            }
        }
        return lps[n - 1];
		
		// TODO Auto-generated method stub
//		int max=0;
//		int min=Integer.MAX_VALUE;
//		int count=0;
//		for(int i=0;i<D.length;i++) {
//			if(D[i]>max) {
//				max=D[i];
//			}
//			if(D[i]<min) {
//				min=D[i];
//			}
//			if(max-min>X) {
//				count++;
//				max=D[i];
//				min=D[i];
//			}	
//		}
//		return count+1;
		
	}
    
}
