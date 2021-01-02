package codechef;

import java.util.Scanner;

public class Bubble {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t,n;
		t=sc.nextInt();
		for(int k=0;k<t;k++)
		{
			n=sc.nextInt();
			int count=0;
			int arr[]=new int[n];
			for(int j=0;j<n;j++)
			{
				arr[j]=sc.nextInt();
			}
		
		for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    // swap temp and arr[i]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    count++;
                }
		
		 System.out.println(count);
		
		}		
				
	}
	

}
