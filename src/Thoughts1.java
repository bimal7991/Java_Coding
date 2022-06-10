import java.util.ArrayList;
import java.util.Scanner;
public class Thoughts1 {
  public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	 String s=sc.next();
	 String arr[]=s.split(",");
	 ArrayList<Character> list=new ArrayList<Character>();
	 int c=0;
	 if(arr[0].charAt(0)=='0') { 
	 }
	 else {
		 if(arr[0].length()>1) {
			 list.add(arr[0].charAt(1));
			 c++;
		 }
		 else {
			 list.add(arr[0].charAt(0));
		 }
	 }
	 for(int i=1;i<arr.length;i++) {
		 if(arr[i].length()>1) {
			 list.add(arr[i].charAt(1));
			 c++;
		 }
		 else {
			 list.add(arr[i].charAt(0));
		 }
	 }
	 if(c%2==1) {
		 System.out.print("-");
	 }
	 for(int i=0;i<list.size();i++) {
		 System.out.print(list.get(i));
	 }
}
}