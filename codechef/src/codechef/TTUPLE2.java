package codechef;
import java.util.*;
public class TTUPLE2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0)
		{
			int p=sc.nextInt(),q=sc.nextInt(),r=sc.nextInt();
			int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
			int dif1=a-p,dif2=b-q,dif3=c-r;
			
			int div1=0,div2=0,div3=0,rem1=0,rem2=0,rem3=0;
		
			
			if(p!=0)
			{
				div1=a/p;
				rem1=a%p;
			}
			if(q!=0)
			{
				div2=b/q;
				rem2=b%q;
			}
			if(r!=0 )
			{
				div3=c/r;
				rem3=c%r;
			}
			
			
			ArrayList<Integer> arr=new ArrayList<Integer>();
			
			int gcd12=get_gcd(a<0?-a:a,b<0?-b:b);
			int g=get_gcd(gcd12,c<0?-c:c);
			
			for(int i=2;i*i<=g;i++)
			{
				if(g%i==0)
				{
					arr.add(i);
					arr.add(-i);
					if(g/i!=i)
					{
						arr.add(g/i);
						arr.add(-g/i);
					}
				}
			}
			arr.add(g);
			//System.out.println(arr);
			boolean cond11=false;
			
			for(int i=0;i<arr.size();i++)
			{
				if(arr.get(i)!=0)
				{
				if( a/arr.get(i)-p== b/arr.get(i)-q && b/arr.get(i)-q==c/arr.get(i)-r)
				{
					cond11=true;
					break;
				}
				}
			}
			
			
			
			
			
			
			
			boolean cond6=(rem1==0 && rem2==0 && rem3==0);
			
			
			
			boolean cond1=(dif1==dif2 && dif2==dif3);
			boolean cond2=(dif1==dif2 && (dif3==0 || dif1==0)) || (dif2==dif3 && (dif1==0 || dif2==0) ) || (dif1==dif3 && (dif2==0 || dif1==0));
			
			
			boolean cond15=(a==0 && b==0 && c==0);
			boolean cond16=(a==0 && b==0 && c==r) || (a==0 && c==0 && q==b) || (b==0 && c==0 && a==p);
				
			boolean cond3=(div1==div2 && div2==div3 && div1!=0 && div2!=0  && div3!=0 && cond6);
			boolean cond4=(div1==div2 && div1!=0 && div3==1 && cond6 ) || (div2==div3 && div2!=0 && div1==1 && cond6) || (div1==div3 && div1!=0 && div2==1 && cond6);
			boolean cond5=(a==0 && p==0 && div2==div3 && cond6) || (b==0 && q==0 && div1==div3 && cond6) || (c==0 && r==0 && div1==div2 && cond6);	
			
			
			boolean cond7=(dif1==dif2 || dif2==dif3 || dif3==dif1);
			boolean cond8=(div1==div2 && div1!=0 && rem1==0 && rem2==0) || (div2==div3 && rem2==0 && div2!=0 && rem3==0 ) || (div1==div3 && div3!=0 && rem1==0 && rem3==0);
			
			
			boolean cond9=((q+dif1)!=0 && b%(q+dif1)==0 && b/(q+dif1)==div3  && rem3==0 && r!=0) || ((p+dif2)!=0 && a%(p+dif2)==0 && a/(p+dif2)== div3 && rem3==0 && r!=0) ||  ((r+dif2)!=0 && c%(r+dif2)==0 && c/(r+dif2)== div1 && rem1==0 && p!=0)  || ((q+dif3)!=0 && b%(q+dif3)==0 && b/(q+dif3)== div1 && rem1==0 && p!=0) || ((p+dif3)!=0 && a%(p+dif3)==0 && a/(p+dif3)== div2 && rem2==0 && q!=0) || ((r+dif1)!=0 && c%(r+dif1)==0 && c/(r+dif1)== div2 && rem2==0 && q!=0);
				
			boolean cond10=(div1==div2 && div1!=0 && div2!=0 && div3!=0 && div2==div3 && rem1==rem2 && rem2==rem3 );
			
			boolean cond12=(rem1==0 && div1!=0 && q*div1-b==r-c) || (rem1==0 && div1!=0 && r*div1-c==q-b) || (rem2==0 && div2!=0 && p*div2-a==r-c) || (rem2==0 && div2!=0 &&  r*div2-c==p-a) || (rem3==0 && div3!=0 &&  q*div3-b==p-a) || (rem3==0 &&  div3!=0 &&  p*div3-a==q-b);
			
			
			boolean cond13= ( q!=0  && r!=0 && (b-dif1)%q==0 && (c-dif1)%r==0 && (b-dif1)/q==(c-dif1)/r) || (p!=0 && q!=0 && (a-dif3)%p==0 &&(b-dif3)%q==0 && (a-dif3)/p==(b-dif3)/q) ||  (p!=0 && r!=0 && (a-dif2)%p==0 && (c-dif2)%r==0 && (a-dif2)/p==(c-dif2)/r);
			
			
			boolean cond14=(b-div1*q==c-div1*r  && div1!=0 && rem1==0) || (a-div2*p==c-div2*r && div2!=0 && rem2==0)  || (a-div3*p==b-div3*q && div3!=0 || rem3==0);
			
			boolean cond17=(c-(dif1+r)==dif2) || (b-(dif1+q)==dif3) || (a-(dif2+p)==dif3) || (c-(dif2+r)==dif1) || (a-(dif3+p)==dif2) || (b-(dif3+q)==dif1);
			
			boolean cond18=(div1!=0 && div2!=0 && rem1==0 && rem2==0 && (c-(r*div1*div2)==0)) || (div1!=0 && div3!=0 && rem1==0 && rem3==0 && (b-(p*div1*div3)==0)) || (div2!=0 && div3!=0 && rem3==0 && rem2==0 && (a-(p*div2*div3)==0)) ;
			boolean cond19=(a==p && !cond5 && !cond2) || (b==q && !cond5 && !cond2) || (c==0 && !cond5 && !cond2);
			
			if(dif1==0 && dif2==0 && dif3==0)
			{
			    System.out.println(0);	
			}
			else if(cond1 || cond2 || cond3 || cond4 || cond5 || cond15 || cond16)
			{
				System.out.println(1);
			}
			else if(cond7 || cond8 || cond9 || cond10 || cond11 || cond12 || cond13 || cond14 || cond17 || cond18 || cond19)
			{
				//System.out.println(cond7 +" "+cond8+" "+cond9+" "+cond10+" "+cond11+" "+cond12 +" "+cond13+" "+cond14+" ");
				
				System.out.println(2);
			}
			else 
			{
				System.out.println(3);
			}
			
		}
	}

	 static int get_gcd(int a, int b) {
		// TODO Auto-generated method stub
		 
		if(a==0)
			return b;
		else 
			return get_gcd(b%a,a);
				
	}

}
