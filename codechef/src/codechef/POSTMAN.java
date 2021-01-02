package codechef;
import java.util.*;
public class POSTMAN {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int k=sc.nextInt();
		int ans=mindiffrence(arr,k);
		System.out.println(ans);
		
		
	}

   static int mindiffrence(int[] arr, int k) {
		// TODO Auto-generated method stub
	   int hi=arr[arr.length-1]-arr[0];
	   int lo=0;
	   while(lo<hi){
           int mid=(lo+hi)/2;
           if(solvable(arr,mid,k))
        	   hi=mid;
           else lo=mid+1;
       }
       return lo;   
	   
	   
		
	}

 static boolean solvable(int[] arr, int diff, int k) {
	// TODO Auto-generated method stub
	 int n=arr.length;
	 int prev=0;
	 int removed=0;
	 for(int i=1;i<n;i++){
         if(i==n-1 || arr[i+1]-arr[prev]>diff || removed==k){
             if(arr[i]-arr[prev]>diff)return false;
             prev=i;
         }
         else removed++;
     }
     return (removed==k);     
	 
	 
	
}
	

}
