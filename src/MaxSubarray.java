import java.util.*;
public class MaxSubarray {
	public static void main(String[] args) {
		int arr[]={1,3,-1,-3,5,3,6,7};
		ArrayList<Integer> list=new ArrayList<Integer>();
		
		int i=0,j=0;
		int k=3;
		int l=arr.length;
		ArrayList<Integer> ans=new ArrayList<Integer>();
		while(j<l) {
			if(!list.isEmpty()) {
				if(arr[j]>list.get(0)) {
					list.clear();
					
					list.add(arr[j]);
				}
				else {
					list.add(arr[j]);
				}
			}
			else {
				list.add(arr[j]);
			}
			
			if(j-i+1<k) {
				j++;
			}
			else if(j-i+1==k) {
				//System.out.println(list);
				ans.add(list.get(0));
				if(arr[i]==list.get(0)) {
					list.remove(0);
					
				}
				i++;
				j++;
			}
			
			
			
		}
		
		
		System.out.println(ans);
	}

}
