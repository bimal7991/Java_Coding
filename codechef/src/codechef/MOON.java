package codechef;
import java.util.*;
public class MOON {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0)
		{
		 int A=sc.nextInt(),B=sc.nextInt();
		 
		 
		 int a1,a2,b1,b2;
		 
		 if(A>=10 && B>=10)
		 {
		 a1=A%10;
		 a2=A/10;
		 
		 b1=B%10;
		 b2=B/10;
		 
		 int arr[]=new int[4];
		 arr[0]=(b1*10+a1)+(b2*10+a2);
		 arr[1]=(a2*10+b2)+(a1*10+b1);
		 arr[2]=(b2*10+a1)+(a2*10+b1);
		 arr[3]=A+B;
		 Arrays.sort(arr); 
		 System.out.println(arr[3]);
		 }
		 else if(A>=10 && B<10)
		 {
			 a1=A%10;
			 a2=A/10;
			 int arr[]=new int[3];
			 arr[2]=A+B;
			 arr[1]=a2*10+B+a1;
			 arr[0]=B*10+a1+a2;
			 Arrays.sort(arr); 
			 System.out.println(arr[2]);
			 
		 }
		 else if(A<10 && B>=10)
		 {
			 b1=B%10;
			 b2=B/10;
			 int arr[]=new int[3];
			 arr[2]=A+B;
			 arr[1]=b2*10+A+b1;
			 arr[0]=A*10+b1+b2;
			 Arrays.sort(arr); 
			 System.out.println(arr[2]);
		 }
		 else
		 {
			 System.out.println(A+B);
		 }
		 
		 
		}
	}

}
