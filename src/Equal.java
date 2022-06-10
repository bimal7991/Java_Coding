
public class Equal {
  public static void main(String[] args) {
	int arr[]=new int[] {1,0,1,0,1,1};
	int ans=largestSubarray(arr.length,arr);
	System.out.println(ans);	
}

private static int largestSubarray(int n, int[] arr) {		
	int sum = 0;
    int maxsize = 0, startindex = 0;
    int endindex = 0;
    for (int i = 0; i < n - 1; i++) {
        sum = (arr[i] == 0) ? -1 : 1;
        for (int j = i + 1; j < n; j++) {
            if (arr[j] == 0)
                sum += -1;
            else
                sum += 1;
            if (sum == 0 && maxsize < j - i + 1) {
                maxsize = j - i + 1;
                startindex = i;
            }
        }
    }  
    return maxsize;
} 
}
