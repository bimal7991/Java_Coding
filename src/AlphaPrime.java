import java.util.*;
public class AlphaPrime {
	static int prime[]=new int[1000001];
   public static void main(String[] args) {
	Scanner Sc=new Scanner(System.in);
	int arr[]=new int[1000001];
	
	sieve();
	int count=0;
	for(int i=1;i<arr.length;i++) {
	         	if(isAlpha(i)) {
	         		 count++;
	         		 arr[i]=count;
	         	}
	         	else {
	         		arr[i]=count;
	         	}
	}
	for(int i=1;i<=100;i++)
		System.out.print(arr[i]+" ");
	
	int q=Sc.nextInt();
	while(q-->0) {
		int L=Sc.nextInt(),R=Sc.nextInt();
		int ans=arr[R]-arr[L]+1;
		if(arr[L]==arr[L-1])
			ans--;
		
		System.out.println(ans);
		
	}
	
			
}
   
   

private static boolean isAlpha(int i) {
	// TODO Auto-generated method stub
	if(prime[i]==0)
		return true;
	
	if(i%10==0)
		return false;
	
	ArrayList<Integer> dig=new ArrayList<Integer>();
	while(i>0) {
	int a=i%10;
	dig.add(a);
	i=i/10;
	}
	
	int k=0;
	int num=0;
	while(k<dig.size()) {
	    num=num*10+dig.get(k);
	    int v=reverse(num);
	    if(prime[v]==0)
	    	return true;
	    k++;
	}
	
	return false;
}



private static int reverse(int num) {
	// TODO Auto-generated method stub
	int val=0;
	while(num>0) {
		int dig=num%10;
		val=val*10+dig;
		num=num/10;
	}
	return val;
}



private static void sieve() {
	// TODO Auto-generated method stub
	int max=1000001;
	
	
		
	
	prime[1]=1;
	prime[0]=1;
	for(int i=2;i*i<max;i++) {
		if(prime[i]==0) {
			for(int j=i*i;j<max;j+=i) {
				prime[j]=1;
			}
		}
	}
}
  
   
}
