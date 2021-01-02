import java.util.*;
class Match {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1,s2;
		s1=sc.next();
		s2=sc.next();
		int i,count=0;
		for(i=0;i<=(s1.length()-s2.length());i++)
		{
			if(match(s1.substring(i, i+s2.length()), s2))
			{
				count++;
			}
		}
		System.out.println(count);
	}

	 static boolean match(String a,String b) {
		 int count=0;
		for(int i=0;i<a.length();i++)
		{
			if(a.charAt(i)!=b.charAt(i))
				count++;
		}
		
		if(count%2==0)
			return true;
		else
			return false;
		// TODO Auto-generated method stub
		
	}

}
