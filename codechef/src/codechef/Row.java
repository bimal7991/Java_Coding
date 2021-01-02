package codechef;
import java.util.*;
public class Row {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	
		String s=sc.nextLine();
		int mult=0;
		for(int i=0;i<s.length();i++)
		{
			mult=mult*26;
			mult=mult+s.charAt(i)-'A'+1;
		}
		System.out.println(mult);
	}

}
