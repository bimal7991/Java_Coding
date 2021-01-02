package codechef;
import java.util.*;
public class Permutation {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		char arr[]=str.toCharArray();
		permutate(arr,0,str.length()-1);
	}

	private static void permutate(char[] arr, int l, int r) {
		// TODO Auto-generated method stub
		int i;
         if(l==r)
         {
        	 String str=String.valueOf(arr);
        	 System.out.println(str);
         }
         else
         {
        	for(i=l;i<=r;i++)
        	{
        		swap(arr,l,i);
        		permutate(arr, l+1, r);
        		swap(arr,l,i);
        	}
         }


	}

	private static void swap(char[] arr, int l, int i) {
		// TODO Auto-generated method stub
		char temp=arr[l];
		arr[l]=arr[i];
		arr[i]=temp;
		
	}
}
