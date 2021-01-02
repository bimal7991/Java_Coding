package codechef;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Box {
	public static void  main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int b,n,sum=0;
		b=sc.nextInt();
		n=sc.nextInt();
		int arr[]=new int[b];
		int arr2[]=new int[b];
		int arr1[]=new int[b];
		
		for(int i=0;i<b;i++)
		{
			arr[i]=sc.nextInt();
		}
		arr1=Arrays.copyOf(arr,b);
		Arrays.sort(arr);
		arr2=Arrays.copyOf(arr, b);
		swap(arr2[n],arr2[b-1]);
		while(Arrays.equals(arr1, arr2))
		{
		
	    int smindex=smallest(arr1,b);
	    
	    
		}
		
		
		
	
	
	}

	 private static void swap(int smindex, int i) {
		// TODO Auto-generated method stub
		 int temp=smindex;
		 smindex=i;
		 i=temp;
		
	}

	static int smallest(int[] arr, int n) {
		// TODO Auto-generated method stub
		 int small=arr[0],smindex=0;
		 for(int i=1;i<n;i++)
		 {
			 if(arr[i]<small)
			 {
				 small=arr[i];
				 smindex=i;
			 }
			 
		 }
		return smindex;
	}

}
