package codechef;
import java.util.*;

public class Decoding {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	for(int i=0;i<t;i++)
	{
		String s=sc.next();
		int res=decoding(s);
		System.out.println(res);
	}
	
}
static  int decoding(String str)
{
int len=str.length();
if(str.charAt(0)=='0')
return 0;
int dp[]=new int[len+1];
dp[0]=1;
dp[1]=1;
for(int i=2;i<=len;i++)
{
dp[i]=0;
if(str.charAt(i-1)>'0')
dp[i]=dp[i-1];
if(str.charAt(i-2)=='1'||str.charAt(i-2)=='2'&& str.charAt(i-1)<'7')
dp[i]+=dp[i-2];
}
return dp[len];
}
}
