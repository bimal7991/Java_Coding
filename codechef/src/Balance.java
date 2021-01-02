import java.util.ArrayList;
import java.util.Scanner;

public class Balance {
	public class Repeated {

	}

	public static void main(String[] args) {
	
	
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		for(int i=0;i<t;i++)
		{
		String st=sc.next();
		//long n=sc.nextLong();
		//long arr1[]=new long[n];
		ArrayList<Character> arr=new ArrayList<Character>(); 
		int count=0,k=0,max=0;
		for(int j=0;j<st.length();j++)
		{
			
			if(st.charAt(j)=='(')
			{
				arr.add(k++, st.charAt(j));
				count=0;
			}
			else
			{
				count++;
				if(count>max)
					max=count;
				arr.remove(--k);
				
			}
				
		}
	
			System.out.println(2*max);
		
	}

}
}
