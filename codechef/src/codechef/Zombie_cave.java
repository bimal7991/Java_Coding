package codechef;


import java.util.*;
class Zombie_cave{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int j=0;j<t;j++)
		{
			int n=sc.nextInt();
			int arr[]=new int[n];
		       int zom[]=new int[n];
			for(int i=0;i<n;i++)
				arr[i]=sc.nextInt();
			for(int i=0;i<n;i++)
				zom[i]=sc.nextInt();
			
		int rad[]=new int[n];
			Arrays.fill(rad, 0);
			int count=0;
			for(int i=0;i<n;i++)
			{
				int rads=(i-arr[i]);
				   if(rads<0)
					rads=0;
					else
					rads=rads;
				int radl=(i+arr[i]);
				if(radl>n-1)
					radl=n-1;
				else{
				    radl=radl;
				}
				
				add(rad,n,rads,radl,1);
				
				
					
			
			}
			updateArray(rad, n);	
			
		 	
			sort(rad,0,n-1);
			sort(zom,0,n-1);
			int flag1=0;
			for(int i=0;i<n;i++)
			{
				if(rad[i]!=zom[i])
				{
				    flag1=1;
				    break;
				}

			}
			if(flag1==1)
			 System.out.println("NO");
			else
				System.out.println("YES");
			
			
		}
	}
	static void add(int rad[], int N, int lo, 
            int hi, int val) 
{ 
rad[lo] += val; 
if (hi != N - 1) 
rad[hi + 1] -= val; 
}
	static void updateArray(int arr[], int N) 
    { 
        // convert array into prefix sum array 
        for (int i = 1; i < N; i++) 
            arr[i] += arr[i - 1]; 
    } 
	
 static	 void merge(int arr[], int l, int m, int r) 
    { 
        // Find sizes of two subarrays to be merged 
        int n1 = m - l + 1; 
        int n2 = r - m; 
  
        /* Create temp arrays */
        int L[] = new int [n1]; 
        int R[] = new int [n2]; 
  
        /*Copy data to temp arrays*/
        for (int i=0; i<n1; ++i) 
            L[i] = arr[l + i]; 
        for (int j=0; j<n2; ++j) 
            R[j] = arr[m + 1+ j]; 
  
  
        /* Merge the temp arrays */
  
        // Initial indexes of first and second subarrays 
        int i = 0, j = 0; 
  
        // Initial index of merged subarry array 
        int k = l; 
        while (i < n1 && j < n2) 
        { 
            if (L[i] <= R[j]) 
            { 
                arr[k] = L[i]; 
                i++; 
            } 
            else
            { 
                arr[k] = R[j]; 
                j++; 
            } 
            k++; 
        } 
  
        /* Copy remaining elements of L[] if any */
        while (i < n1) 
        { 
            arr[k] = L[i]; 
            i++; 
            k++; 
        } 
  
        /* Copy remaining elements of R[] if any */
        while (j < n2) 
        { 
            arr[k] = R[j]; 
            j++; 
            k++; 
        } 
    } 
  
    // Main function that sorts arr[l..r] using 
    // merge() 
   static void sort(int arr[], int l, int r) 
    { 
        if (l < r) 
        { 
            // Find the middle point 
            int m = (l+r)/2; 
  
            // Sort first and second halves 
            sort(arr, l, m); 
            sort(arr , m+1, r); 
  
            // Merge the sorted halves 
            merge(arr, l, m, r); 
        } 
    } 
  

}
