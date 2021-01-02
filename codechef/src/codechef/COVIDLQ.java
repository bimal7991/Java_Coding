package codechef;
import java.util.*;
public class COVIDLQ {
  public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int T=sc.nextInt();
	while(T-->0)
	{
		int N=sc.nextInt();
		int A[]=new int[N];
		ArrayList<Integer> arr=new ArrayList<Integer>();
	    for(int i=0;i<N;i++)
	    {
	    	A[i]=sc.nextInt();
	    	if(A[i]==1)
	    		arr.add(i);
	    	
	    }
	    int flag=0;
	    for(int i=0;i<arr.size()-1;i++)
	    {
	    	if(arr.get(i+1)-arr.get(i)<6)
	    	{
	    		flag=1;
	    		break;
	    	}
	    }
	    if(flag==1)
	    	System.out.println("NO");
	    else
	    	System.out.println("YES");
	}
}
}
