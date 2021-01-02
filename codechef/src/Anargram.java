import java.util.Scanner;

public class Anargram {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    for(int i=0;i<t;i++)
	    {
	    String s1=sc.next();
	    String s2=sc.next();
	   int arr[]=new int[58];
	   int arr2[]=new int[58];
	   for(int j=0;j<s1.length();j++)
	   {
		  arr[s1.charAt(j)-'a']++;
		
	   }
	   for(int j=0;j<s2.length();j++)
	   {
		  arr2[s2.charAt(j)-'a']++;
		   
	   }
	   int flag=0;
	   for(int j=0;j<58;j++)
	   {
		   if(arr[j]!=arr2[j])
		   {
			   System.out.println("NO");
			   flag=1;
			   break;
		   }
	   }
	   if(flag==0)
		   System.out.println("Yes");
	   
	    }
	    
	}
	
	
}
