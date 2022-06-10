import java.util.*;
public class Tata {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		int q=sc.nextInt();
		int query[]=new int[q];
		for(int i=0;i<q;i++)
			query[i]=sc.nextInt();
		int ans=get(n,arr,q,query);
		System.out.println(ans);
	}
	static int get(int n,int[] arr,int q ,int[] query) {
		int count=getCount(arr);
		int light=0;
		if(count>=(int)Math.ceil(n/2.0))
			light=1;
		int state=0;
		for(int i=0;i<q;i++) {
			if(arr[query[i]-1]==1) {
				arr[query[i]-1]=0;
				count--;
			}
			else {
				arr[query[i]-1]=1;
				count++;
			}
			
			if(count>=(int)Math.ceil(n/2.0)) {
				if(light==0) {
					light=1;
					state++;
				}
			}
			else {
				if(light==1) {
					light=0;
					state++;
				}	
			}
		}
		return state;
	}

	private static int getCount(int[] arr) {
		int count=0;
		
		for(int i=0;i<arr.length;i++)
			if(arr[i]==1)
				count++;
		return count;
	}
	

}
