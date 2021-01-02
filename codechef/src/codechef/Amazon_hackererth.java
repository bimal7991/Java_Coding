package codechef;
import java.util.*;

public class Amazon_hackererth {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 String s=sc.next();
		 int i=0;
		 int count7=0;
		 int count=0;
		 while(i<s.length())
		 {
			 if(s.charAt(i)=='1')
				 count++;
			 i++;
		 }
		 i=0;
		 while(i<s.length())
		 {
			 if(s.charAt(i)=='1')
			 {
				 int flag=0;
				 for(int k=i;k<i+7;k++)
				 {
					if(s.charAt(k)=='0')
					{
						flag=1;
						break;
					}
						
				 }
				 if(flag==0)
				 {
					 count7++;
					 i=i+7;
				 }
				 else
					 i++;
				  
			 }
			 else
				 i++;
			 
		 }
		// System.out.println(count7);
		 int ans=(count-count7*7)*2+count7*5;
		 
		 System.out.println(ans);
			
			
			
		
	}

}
